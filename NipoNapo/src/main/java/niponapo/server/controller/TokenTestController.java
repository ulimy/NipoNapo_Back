package niponapo.server.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import niponapo.server.service.JWTService;

@Controller
public class TokenTestController {
	
	@Autowired
	@Qualifier("JWTService")
	private JWTService JWTService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void create(HttpServletResponse response) {
		
		int user_pid=1;
		try{
			String token = JWTService.create("user_pid", user_pid);

			if (JWTService.isUsable(token)) {
				response.setHeader("Authorization", token);

			}
		}catch (Exception e){
			
		}
	}
	
	@RequestMapping(value = "/verify", method = RequestMethod.GET)
	public @ResponseBody int verify(HttpServletRequest request) {
		final String token = request.getHeader("Authorization");
		try {
			if (token != null && JWTService.isUsable(token)) {
				return JWTService.getUser_pid(token);
			} else {
				return 0;
			}
		} catch (Exception e) {
			return 0;
		}
	}
	

}
