package niponapo.server.service;

import niponapo.server.dto.SuccessDTO;
import niponapo.server.vo.PostVO;

public interface PostService {
	
	public SuccessDTO post_create(PostVO input);
	
	public SuccessDTO post_delete(int post_pid);
	
}
