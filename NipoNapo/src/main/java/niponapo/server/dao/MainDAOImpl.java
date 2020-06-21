package niponapo.server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import niponapo.server.dto.AlbumInfoDTO;
import niponapo.server.dto.CardInfoDTO;
import niponapo.server.dto.PostInfoDTO;
import niponapo.server.dto.SearchDTO;

@Repository("MainDAO")
public class MainDAOImpl implements MainDAO {
	
	@Autowired
	Mapper mapper;

	@Override
	public AlbumInfoDTO[] album_info(int idol_pid) {
		return mapper.album_info(idol_pid);
	}

	@Override
	public CardInfoDTO[] card_info(int album_pid) {
		return mapper.card_info(album_pid);
	}
	
	@Override
	public PostInfoDTO[] post_info(int album_pid,String[] how) {
		return mapper.post_info(album_pid,how);
	}

	@Override
	public PostInfoDTO[] post_search(SearchDTO input) {
		return mapper.post_search(input);
	}

}
