package ReviewLTCB2;

public class SingleAlbum extends Album{
	private String singer;

	/**
	 * @param title ten abum
	 * @param publishedYear nam phat hanh
	 * @param consMusicItem danh sach cac ban nhac so
	 * @param singer
	 */
	public SingleAlbum(String title, int publishedYear, IAlbum consMusicItem, String singer) {
		super(title, publishedYear, consMusicItem);
		this.singer = singer;
	}

	@Override
	public String toString() {
		return singer+" Album ca si "+ super.toString() ;
	}

	@Override
	public int howMany() {
		return super.howMany();
	}
 
	public IAlbum thisActor(String actor) {
		return 	super.thisActor(actor);
		}
	public IAlbum sortByTime() {
		return super.sortByTime();
	};
	
}
