package niponapo.server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import niponapo.server.dto.PostInfoDTO;
import niponapo.server.dto.UserPostDTO;

@Repository("SwapDAO")
public class SwapDAOImpl implements SwapDAO {

	@Autowired
	private Mapper mapper;
	
	@Override
	public void swap_request(UserPostDTO input) {
		mapper.swap_request(input);
		return;
	}

	@Override
	public void swap_cancle(int post_pid) {
		mapper.swap_cancle(post_pid);
		return;

	}

	@Override
	public void swap_accept(int post_pid) {
		mapper.swap_accept(post_pid);
		return;
	}

	@Override
	public PostInfoDTO[] swap_list(int user_pid) {
		return mapper.swap_list(user_pid);
	}

}
