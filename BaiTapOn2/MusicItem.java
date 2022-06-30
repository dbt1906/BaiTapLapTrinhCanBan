package ReviewLTCB2;

public class MusicItem {
	private  Song song;
	private SourceFile file;
	private int hitCounts;
	private String singer;
	/**
	 * @param song ten bai hat
	 * @param file file cua bai hat
	 * @param hitCounts so lan phat
	 * @param singer ten ca si
	 */
	public MusicItem(Song song, SourceFile file, int hitCounts, String singer) {
		this.song = song;
		this.file = file;
		this.hitCounts = hitCounts;
		this.singer = singer;
	}
	@Override
	public String toString() {
		return song.toString() + file.toString() +hitCounts+" " +singer+" \n";
	}
	/**
	 * Xac dinh lieu ban nhac nay co duoc yeu thich hon ban nhac khac khong
	 * @param that mot ban nhac
	 * @return tra ve true neu co
	 */
public boolean moreFavouriteThan(MusicItem that) {
		return this.hitCounts>that.getHitCounts();
	}
public boolean longerThan(MusicItem that) {
	return this.file.longerThan(that.file);
}
public String favouriteRate() {
	int hitCount = this.getHitCounts();
	String result = hitCount>=40000?"Hot":hitCount>=2000?"Phổ biến":"";
	return result;
}

/**
 * @return the hitCounts
 */
public int getHitCounts() {
	return hitCounts;
}
/**
 * @param hitCounts the hitCounts to set
 */
public void setHitCounts(int hitCounts) {
	this.hitCounts = hitCounts;
}
/**
 * @return the file
 */
public SourceFile getFile() {
	return file;
}
/**
 * @param file the file to set
 */
public void setFile(SourceFile file) {
	this.file = file;
}
public double totalTime() {
	int minute = this.getFile().getDuration().getMinute();
	int second = this.getFile().getDuration().getSecond();
	return minute*60+second;
}
public boolean hasTimeShorterThan(MusicItem that) {
	return !this.getFile().getDuration().longerThan(that.getFile().getDuration());
}
@Override
public boolean equals(Object obj) {
	if(obj == null||!(obj instanceof MusicItem))
		return false;
	else {
		MusicItem that = (MusicItem) obj;
		return(this.song.equals(that.song)
				&&this.hitCounts==that.hitCounts
				&&this.singer.equals(that.singer)
				&&this.file.equals(that.file));
	}
}
/**
 * @return the song
 */
public Song getSong() {
	return song;
}
/**
 * @param song the song to set
 */
public void setSong(Song song) {
	this.song = song;
}
/**
 * @return the singer
 */
public String getSinger() {
	return singer;
}
/**
 * @param singer the singer to set
 */
public void setSinger(String singer) {
	this.singer = singer;
}

}
