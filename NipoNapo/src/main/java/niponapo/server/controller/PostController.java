package niponapo.server.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import niponapo.server.dto.SuccessDTO;
import niponapo.server.service.JWTService;
import niponapo.server.service.PostService;
import niponapo.server.vo.PostVO;

@Controller
@RequestMapping(value = "/post")
public class PostController {

	@Autowired
	@Qualifier("JWTService")
	private JWTService JWTService;
	
	@Autowired
	@Qualifier("PostService")
	private PostService service;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody SuccessDTO create(HttpServletRequest request, @RequestBody PostVO input) throws Exception {
		final String token = request.getHeader("Authorization");
		try {
			if (token != null && JWTService.isUsable(token)) {
				int user_pid = JWTService.getUser_pid(token);
				input.setInit(user_pid);
				return service.post_create(input);
			} else {
				return null;
			}
		} catch (Exception e) {
			return null;
		}
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public @ResponseBody SuccessDTO delete(@RequestBody Map<String, Object> post_pid){
		
		 return service.post_delete((Integer)post_pid.get("post_pid"));
		 
	}
	
}
