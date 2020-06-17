package niponapo.server.service;

import niponapo.server.dto.PostInfoDTO;
import niponapo.server.dto.SuccessDTO;
import niponapo.server.dto.UserPostDTO;

public interface SwapService {
	
	public SuccessDTO swap_request(UserPostDTO input);
	
	public SuccessDTO swap_cancle(int post_pid);
	
	public SuccessDTO swap_accept(int post_pid);
	
	public PostInfoDTO[] swap_list(int user_pid);
	
}
