package niponapo.server.service;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import niponapo.server.dao.MainDAO;
import niponapo.server.dto.MainDTO;
import niponapo.server.dto.MainInfoDTO;
import niponapo.server.dto.PostInfoDTO;
import niponapo.server.dto.SearchDTO;

@Service("MainService")
public class MainServiceImpl implements MainService {
	
	@Autowired
	@Qualifier("MainDAO")
	MainDAO dao;

	@Override
	public MainDTO main_init(int idol_pid,String how) {
		try {
			MainDTO output = new MainDTO(dao.album_info(idol_pid));
			for (MainInfoDTO maininfo : output.getMainInfo()){
				int album_pid = maininfo.getAlbumInfo().getAlbum_pid(); 
				maininfo.setCardInfo(dao.card_info(album_pid));
				output.addPostInfo(Arrays.asList(dao.post_info(album_pid,how.split(","))));
				Collections.sort(output.getPostInfo());
			}
			return output;
		} catch (Exception e) {
			return null;
		}	
	}

	@Override
	public PostInfoDTO[] main_search(SearchDTO input) {
		try {
			return dao.post_search(input);
		} catch (Exception e) {
			return null;
		}
	}

}
