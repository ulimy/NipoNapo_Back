package niponapo.server.dao;

import niponapo.server.dto.UserPostDTO;
import niponapo.server.vo.PostVO;

public interface Mapper {
	
	public void post_create(PostVO input);
	
	public void post_delete(int post_pid);
	
	public void swap_request(UserPostDTO input);
	
	public void swap_cancle(int post_pid);
	
	public void swap_accept(int post_pid);
}
