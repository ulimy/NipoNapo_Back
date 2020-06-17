package niponapo.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import niponapo.server.dao.PostDAO;
import niponapo.server.dto.SuccessDTO;
import niponapo.server.vo.PostVO;

@Service("PostService")
public class PostServiceImpl implements PostService {

	@Autowired
	@Qualifier("PostDAO")
	PostDAO dao;
	
	private final SuccessDTO success = new SuccessDTO(true);
	private final SuccessDTO fail = new SuccessDTO(false);
	
	@Override
	public SuccessDTO post_create(PostVO input) {
		try {
			dao.post_create(input);
			return success;
		} catch (Exception e) {
			return fail;
		}
	}

	@Override
	public SuccessDTO post_delete(int post_pid) {
		
		try{
			dao.post_delete(post_pid);
			return success;
		} catch (Exception e) {
			System.out.println(e);
			return fail;
		}

	}

}
