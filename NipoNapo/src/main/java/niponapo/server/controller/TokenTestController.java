package niponapo.server.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import niponapo.server.service.JWTService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class TokenTestController {
	
	@Autowired
	@Qualifier("JWTService")
	private JWTService JWTService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void home(HttpServletResponse response) {
		
		int user_pid=1;
		try{
			String token = JWTService.create("user_pid", user_pid);

			if (JWTService.isUsable(token)) {
				response.setHeader("Authorization", token);

			}
		}catch (Exception e){
			
		}
		
		
	}

}
