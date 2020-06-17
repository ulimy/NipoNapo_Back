package niponapo.server.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import niponapo.server.dto.PostInfoDTO;
import niponapo.server.dto.SuccessDTO;
import niponapo.server.dto.UserPostDTO;
import niponapo.server.service.JWTService;
import niponapo.server.service.SwapService;

@Controller
@RequestMapping(value = "/swap")
public class SwapController {

	@Autowired
	@Qualifier("JWTService")
	private JWTService JWTService;
	
	@Autowired
	@Qualifier("SwapService")
	private SwapService service;
	
	@RequestMapping(value = "/request", method = RequestMethod.GET)
	public @ResponseBody SuccessDTO request(HttpServletRequest request, @RequestParam int post_pid) throws Exception {
		final String token = request.getHeader("Authorization");
		try {
			if (token != null && JWTService.isUsable(token)) {
				return service.swap_request(new UserPostDTO(JWTService.getUser_pid(token),post_pid));
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	@RequestMapping(value = "/cancle", method = RequestMethod.PUT)
	public @ResponseBody SuccessDTO cancle(@RequestBody Map<String, Object> input) throws Exception {
		return service.swap_cancle((Integer)input.get("post_pid"));
	}
	
	@RequestMapping(value = "/accept", method = RequestMethod.PUT)
	public @ResponseBody SuccessDTO accept(@RequestBody Map<String, Object> input) throws Exception {
		return service.swap_accept((Integer)input.get("post_pid"));
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody PostInfoDTO[] list(HttpServletRequest request) throws Exception {
		final String token = request.getHeader("Authorization");
		try {
			if (token != null && JWTService.isUsable(token)) {
				return service.swap_list(JWTService.getUser_pid(token));
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
}
