package niponapo.server.dao;

import niponapo.server.dto.AlbumInfoDTO;
import niponapo.server.dto.CardInfoDTO;
import niponapo.server.dto.PostInfoDTO;
import niponapo.server.dto.SearchDTO;

public interface MainDAO {

	public AlbumInfoDTO[] album_info(int idol_pid);
	
	public CardInfoDTO[] card_info(int album_pid);
	
	public PostInfoDTO[] post_info(int album_pid,String[] how);
	
	public PostInfoDTO[] post_search(SearchDTO input);
	
}
