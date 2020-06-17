package niponapo.server.vo;

public class CardVO {

	private int card_pid;
	private int ablum_pid;
	private String card_name;

	public int getCard_pid() {
		return card_pid;
	}

	public void setCard_pid(int card_pid) {
		this.card_pid = card_pid;
	}

	public int getAblum_pid() {
		return ablum_pid;
	}

	public void setAblum_pid(int ablum_pid) {
		this.ablum_pid = ablum_pid;
	}

	public String getCard_name() {
		return card_name;
	}

	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}

	@Override
	public String toString() {
		return "CardVO [card_pid=" + card_pid + ", ablum_pid=" + ablum_pid + ", card_name=" + card_name + "]";
	}

}
