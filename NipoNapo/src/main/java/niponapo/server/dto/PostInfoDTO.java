package niponapo.server.dto;

import java.util.Date;

public class PostInfoDTO implements Comparable<PostInfoDTO> {
	private int post_pid;
	private String id;
	private String how;
	private Date date;
	private int state;
	private String photo;

	public int getPost_pid() {
		return post_pid;
	}

	public void setPost_pid(int post_pid) {
		this.post_pid = post_pid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHow() {
		return how;
	}

	public void setHow(String how) {
		this.how = how;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public int compareTo(PostInfoDTO postInfo) {
		if (this.post_pid > postInfo.getPost_pid()) {
			return -1;
		} else if (this.post_pid == postInfo.getPost_pid()) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return "PostInfoDTO [post_pid=" + post_pid + ", id=" + id + ", how=" + how + ", date=" + date + ", state="
				+ state + ", photo=" + photo + "]";
	}

}
