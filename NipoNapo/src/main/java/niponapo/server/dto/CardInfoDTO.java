package niponapo.server.dto;

public class CardInfoDTO {
	private int card_pid;
	private String card_name;

	public int getCard_pid() {
		return card_pid;
	}

	public void setCard_pid(int card_pid) {
		this.card_pid = card_pid;
	}

	public String getCard_name() {
		return card_name;
	}

	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}

	@Override
	public String toString() {
		return "CardInfoDTO [card_pid=" + card_pid + ", card_name=" + card_name + "]";
	}

}
