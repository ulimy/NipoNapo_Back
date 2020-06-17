package niponapo.server.dto;

public class SuccessDTO {
	boolean success;

	public SuccessDTO(boolean success) {
		this.success = success;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	@Override
	public String toString() {
		return "SuccessDTO [success=" + success + "]";
	}
}
