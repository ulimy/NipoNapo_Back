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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardInfoDTO[] card_info(int album_pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostInfoDTO[] post_info(SearchDTO input) {
		return mapper.main_search(input);
	}

}
