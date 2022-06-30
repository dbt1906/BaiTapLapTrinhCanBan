package ReviewLTCB2;

public abstract class Album {
	private String title;
	private int publishedYear;
	private IAlbum consMusicItem;
	/**
	 * @param title
	 * @param publishedYear
	 * @param consMusicItem
	 */
	public Album(String title, int publishedYear, IAlbum consMusicItem) {
		this.title = title;
		this.publishedYear = publishedYear;
		this.consMusicItem = consMusicItem;
	}
	@Override
	public String toString() {
		return title + ", " + publishedYear + ", Album gom cac ban nhac\n" + consMusicItem;
	}
	public  int howMany() {
		return consMusicItem.howMany();
	}
	public double totalTime() {
		return consMusicItem.totalTime();
	}
	public IAlbum thisActor(String actor) {
		return consMusicItem.thisActor(actor);
	}
	public IAlbum sortByTime() {
		return consMusicItem.sortByTime();
	};

	
	

	
}
