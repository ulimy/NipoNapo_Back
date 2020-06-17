package niponapo.server.dto;

import java.util.Arrays;

public class MainDTO {
	private MainInfoDTO[] MainInfo;
	private PostInfoDTO[] PostInfo;

	public MainInfoDTO[] getMainInfo() {
		return MainInfo;
	}

	public void setMainInfo(MainInfoDTO[] mainInfo) {
		MainInfo = mainInfo;
	}

	public PostInfoDTO[] getPostInfo() {
		return PostInfo;
	}

	public void setPostInfo(PostInfoDTO[] postInfo) {
		PostInfo = postInfo;
	}

	@Override
	public String toString() {
		return "MainDTO [MainInfo=" + Arrays.toString(MainInfo) + ", PostInfo=" + Arrays.toString(PostInfo) + "]";
	}

}
