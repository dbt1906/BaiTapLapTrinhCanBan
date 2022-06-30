package ReviewLTCB2;

public interface IAlbum {
	public int howMany();
	public double totalTime();
	public IAlbum thisActor(String actor);
	public IAlbum insertInTimeOrder(MusicItem that);
	public IAlbum sortByTime();
}
