package niponapo.server.vo;

import java.util.Date;

public class PostVO {
	private int post_pid;
	private int user_pid;
	private String id;
	private int accept_pid;
	private int album_pid;
	private int have;
	private int want;
	private String how;
	private String photo;
	private int state;
	private Date date;

	public void setInit(int user_pid) {
		this.user_pid = user_pid;
		this.state = 1;
		this.date = new Date();
	}

	public int getPost_pid() {
		return post_pid;
	}

	public void setPost_pid(int post_pid) {
		this.post_pid = post_pid;
	}

	public int getUser_pid() {
		return user_pid;
	}

	public void setUser_pid(int user_pid) {
		this.user_pid = user_pid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAccept_pid() {
		return accept_pid;
	}

	public void setAccept_pid(int accept_pid) {
		this.accept_pid = accept_pid;
	}

	public int getAlbum_pid() {
		return album_pid;
	}

	public void setAlbum_pid(int album_pid) {
		this.album_pid = album_pid;
	}

	public int getHave() {
		return have;
	}

	public void setHave(int have) {
		this.have = have;
	}

	public int getWant() {
		return want;
	}

	public void setWant(int want) {
		this.want = want;
	}

	public String getHow() {
		return how;
	}

	public void setHow(String how) {
		this.how = how;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "PostVO [post_pid=" + post_pid + ", user_pid=" + user_pid + ", id=" + id + ", accept_pid=" + accept_pid
				+ ", album_pid=" + album_pid + ", have=" + have + ", want=" + want + ", how=" + how + ", photo=" + photo
				+ ", state=" + state + ", date=" + date + "]";
	}

}
