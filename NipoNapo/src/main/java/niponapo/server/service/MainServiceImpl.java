package niponapo.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import niponapo.server.dao.MainDAO;
import niponapo.server.dto.MainDTO;
import niponapo.server.dto.PostInfoDTO;
import niponapo.server.dto.SearchDTO;
import niponapo.server.dto.SuccessDTO;

@Service("MainService")
public class MainServiceImpl implements MainService {
	
	@Autowired
	@Qualifier("MainDAO")
	MainDAO dao;
	
	private final SuccessDTO success = new SuccessDTO(true);
	private final SuccessDTO fail = new SuccessDTO(false);

	@Override
	public MainDTO main_init(SearchDTO input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostInfoDTO[] main_search(SearchDTO input) {
		try {
			return dao.post_info(input);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
