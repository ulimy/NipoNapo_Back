package niponapo.server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import niponapo.server.vo.PostVO;

@Repository("PostDAO")
public class PostDAOImpl implements PostDAO {
	
	@Autowired
	private Mapper mapper;

	@Override
	public void post_create(PostVO input) {
		mapper.post_create(input);
		return;
	}

	@Override
	public void post_delete(int post_pid) {
		mapper.post_delete(post_pid);
		return;

	}

}
