package niponapo.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import niponapo.server.dao.SwapDAO;
import niponapo.server.dto.PostInfoDTO;
import niponapo.server.dto.SuccessDTO;
import niponapo.server.dto.UserPostDTO;

@Service("SwapService")
public class SwapServiceImpl implements SwapService {

	@Autowired
	@Qualifier("SwapDAO")
	SwapDAO dao;
	
	private final SuccessDTO success = new SuccessDTO(true);
	private final SuccessDTO fail = new SuccessDTO(false);
	
	@Override
	public SuccessDTO swap_request(UserPostDTO input) {
		try{
			dao.swap_request(input);
			return success;
		}catch (Exception e) {
			return fail;
		}
	}

	@Override
	public SuccessDTO swap_cancle(int post_pid) {
		try{
			dao.swap_cancle(post_pid);
			return success;
		}catch (Exception e) {
			return fail;
		}
	}

	@Override
	public SuccessDTO swap_accept(int post_pid) {
		try{
			dao.swap_accept(post_pid);
			return success;
		}catch (Exception e) {
			return fail;
		}
	}

	@Override
	public PostInfoDTO[] swap_list(int user_pid) {
		try{
			return dao.swap_list(user_pid);
		}catch (Exception e) {
			return null;
		}
	}

}
