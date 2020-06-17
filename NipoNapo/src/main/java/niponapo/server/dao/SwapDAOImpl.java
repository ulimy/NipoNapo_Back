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
	public void swap_cancle() {
		// TODO Auto-generated method stub

	}

	@Override
	public void swap_accept() {
		// TODO Auto-generated method stub

	}

	@Override
	public PostInfoDTO[] swap_list() {
		// TODO Auto-generated method stub
		return null;
	}

}
