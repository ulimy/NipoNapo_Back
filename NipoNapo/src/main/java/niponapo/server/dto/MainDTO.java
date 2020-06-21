package niponapo.server.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainDTO {
	private List<MainInfoDTO> MainInfo;
	private List<PostInfoDTO> PostInfo;

	public MainDTO() {
		super();
	}

	public MainDTO(AlbumInfoDTO[] albumInfo) {
		MainInfo = new ArrayList<MainInfoDTO>();
		PostInfo = new ArrayList<PostInfoDTO>();
		for (AlbumInfoDTO album : albumInfo) {
			MainInfo.add(new MainInfoDTO(album));
		}
	}

	public List<MainInfoDTO> getMainInfo() {
		return MainInfo;
	}

	public void setMainInfo(List<MainInfoDTO> mainInfo) {
		MainInfo = mainInfo;
	}

	public void addPostInfo(List<PostInfoDTO> postinfo) {
		if ( postinfo !=null ){
			PostInfo.addAll(postinfo);
		}
	}

	public List<PostInfoDTO> getPostInfo() {
		return PostInfo;
	}

	public void setPostInfo(List<PostInfoDTO> postInfo) {
		PostInfo = postInfo;
	}

	@Override
	public String toString() {
		return "MainDTO [MainInfo=" + MainInfo + ", PostInfo=" + PostInfo + "]";
	}

}
