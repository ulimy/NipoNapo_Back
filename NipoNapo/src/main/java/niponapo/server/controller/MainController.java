package niponapo.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import niponapo.server.dto.PostInfoDTO;
import niponapo.server.dto.SearchDTO;
import niponapo.server.service.MainService;

@Controller
@RequestMapping(value = "/main")
public class MainController {
	
	@Autowired
	@Qualifier("MainService")
	private MainService service;

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public @ResponseBody PostInfoDTO[] search(@ModelAttribute SearchDTO input) throws Exception{
		return service.main_search(input);
	}

}
