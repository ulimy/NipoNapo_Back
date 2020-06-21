package niponapo.server.dto;

import java.util.Arrays;

public class MainInfoDTO {
	private AlbumInfoDTO AlbumInfo;
	private CardInfoDTO[] CardInfo;
	
	public MainInfoDTO(){
		super();
	}
	
	public MainInfoDTO(AlbumInfoDTO albumInfo){
		AlbumInfo = albumInfo;
	}

	public AlbumInfoDTO getAlbumInfo() {
		return AlbumInfo;
	}

	public void setAlbumInfo(AlbumInfoDTO albumInfo) {
		AlbumInfo = albumInfo;
	}

	public CardInfoDTO[] getCardInfo() {
		return CardInfo;
	}

	public void setCardInfo(CardInfoDTO[] cardInfo) {
		CardInfo = cardInfo;
	}

	@Override
	public String toString() {
		return "MainInfoDTO [AlbumInfo=" + AlbumInfo + ", CardInfo=" + Arrays.toString(CardInfo) + "]";
	}

}
