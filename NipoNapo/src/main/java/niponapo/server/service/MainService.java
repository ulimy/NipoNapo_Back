package niponapo.server.service;

import niponapo.server.dto.MainDTO;
import niponapo.server.dto.PostInfoDTO;
import niponapo.server.dto.SearchDTO;

public interface MainService {
	
	public MainDTO main_init(int idol_pid,String how); 
	
	public PostInfoDTO[] main_search(SearchDTO input);

}
