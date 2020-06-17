package niponapo.server.vo;

public class IdolVO {
	private int idol_pid;
	private String idol_name;

	public int getIdol_pid() {
		return idol_pid;
	}

	public void setIdol_pid(int idol_pid) {
		this.idol_pid = idol_pid;
	}

	public String getIdol_name() {
		return idol_name;
	}

	public void setIdol_name(String idol_name) {
		this.idol_name = idol_name;
	}

	@Override
	public String toString() {
		return "IdolVO [idol_pid=" + idol_pid + ", idol_name=" + idol_name + "]";
	}

}
