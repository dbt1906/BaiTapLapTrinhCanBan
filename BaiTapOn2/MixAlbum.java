package ReviewLTCB2;

public class MixAlbum extends Album{

	public MixAlbum(String title, int publishedYear, IAlbum consMusicItem) {
		super(title, publishedYear, consMusicItem);
		
	}

	@Override
	public String toString() {
		return "Album tong hop"+super.toString();
	}

	@Override
	public int howMany() {
		return	super.howMany();
	}
	public IAlbum thisActor(String actor) {
	return 	super.thisActor(actor);
	}
	public IAlbum sortByTime() {
		return super.sortByTime();
	};
	

}
