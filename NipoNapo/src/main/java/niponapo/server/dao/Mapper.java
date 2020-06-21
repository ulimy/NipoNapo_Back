package niponapo.server.dao;

import org.apache.ibatis.annotations.Param;

import niponapo.server.dto.AlbumInfoDTO;
import niponapo.server.dto.CardInfoDTO;
import niponapo.server.dto.PostInfoDTO;
import niponapo.server.dto.SearchDTO;
import niponapo.server.dto.UserPostDTO;
import niponapo.server.vo.PostVO;

public interface Mapper {
	
	public void post_create(PostVO input);
	
	public void post_delete(int post_pid);
	
	public void swap_request(UserPostDTO input);
	
	public void swap_cancle(int post_pid);
	
	public void swap_accept(int post_pid);
	
	public PostInfoDTO[] swap_list(int user_pid);
	
	public AlbumInfoDTO[] album_info(int idol_pid);
	
	public CardInfoDTO[] card_info(int album_pid);
	
	public PostInfoDTO[] post_info(@Param("album_pid") int album_pid, @Param("how") String[] how);
	
	public PostInfoDTO[] post_search(@Param("input") SearchDTO input);
	
}
