package niponapo.server.dto;

import java.util.Arrays;

public class SearchDTO {

	int album_pid;
	String how[];
	int have;
	int want;

	public int getAlbum_pid() {
		return album_pid;
	}

	public void setAlbum_pid(int album_pid) {
		this.album_pid = album_pid;
	}

	public String[] getHow() {
		return how;
	}

	public void setHow(String[] how) {
		this.how = how;
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

	@Override
	public String toString() {
		return "SearchDTO [album_pid=" + album_pid + ", how=" + Arrays.toString(how) + ", have=" + have + ", want="
				+ want + "]";
	}

}
