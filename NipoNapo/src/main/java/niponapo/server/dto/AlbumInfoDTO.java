package niponapo.server.dto;

public class AlbumInfoDTO {
	private int album_pid;
	private String album_name;

	public int getAlbum_pid() {
		return album_pid;
	}

	public void setAlbum_pid(int album_pid) {
		this.album_pid = album_pid;
	}

	public String getAlbum_name() {
		return album_name;
	}

	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}

	@Override
	public String toString() {
		return "AlbumInfoDTO [album_pid=" + album_pid + ", album_name=" + album_name + "]";
	}

}
