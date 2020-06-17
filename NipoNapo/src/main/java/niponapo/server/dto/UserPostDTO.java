package niponapo.server.dto;

public class UserPostDTO {
	private int user_pid;
	private int post_pid;

	public int getUser_pid() {
		return user_pid;
	}

	public void setUser_pid(int user_pid) {
		this.user_pid = user_pid;
	}

	public int getPost_pid() {
		return post_pid;
	}

	public void setPost_pid(int post_pid) {
		this.post_pid = post_pid;
	}

	@Override
	public String toString() {
		return "UserPostDTO [user_pid=" + user_pid + ", post_pid=" + post_pid + "]";
	}

}
