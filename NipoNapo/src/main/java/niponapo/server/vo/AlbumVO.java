package niponapo.server.vo;

public class AlbumVO {

	private int album_pid;
	private int idol_pid;
	private String album_name;

	public int getAlbum_pid() {
		return album_pid;
	}

	public void setAlbum_pid(int album_pid) {
		this.album_pid = album_pid;
	}

	public int getIdol_pid() {
		return idol_pid;
	}

	public void setIdol_pid(int idol_pid) {
		this.idol_pid = idol_pid;
	}

	public String getAlbum_name() {
		return album_name;
	}

	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}

	@Override
	public String toString() {
		return "AlbumVO [album_pid=" + album_pid + ", idol_pid=" + idol_pid + ", album_name=" + album_name + "]";
	}

}
