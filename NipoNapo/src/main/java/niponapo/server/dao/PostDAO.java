package niponapo.server.dao;

import niponapo.server.vo.PostVO;

public interface PostDAO {
	
	public void post_create(PostVO input);
	
	public void post_delete(int post_pid);
}
