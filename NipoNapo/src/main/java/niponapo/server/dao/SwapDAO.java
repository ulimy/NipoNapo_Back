package niponapo.server.dao;

import niponapo.server.dto.PostInfoDTO;
import niponapo.server.dto.UserPostDTO;

public interface SwapDAO {

	public void swap_request(UserPostDTO input);
	
	public void swap_cancle(int post_pid);
	
	public void swap_accept(int post_pid);
	
	public PostInfoDTO[] swap_list(int user_pid);
	
}
