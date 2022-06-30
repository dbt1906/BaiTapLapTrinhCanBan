package ReviewLTCB2;

public class MTMusicItem implements IAlbum{

	@Override
	public String toString() {
		return "";
	}

	@Override
	public int howMany() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalTime() {
		
		return 0;
	}

	@Override
	public IAlbum thisActor(String actor) {
		return new MTMusicItem();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof MTMusicItem))
			return false;
		else
			return true;
	}

	@Override
	public IAlbum sortByTime() {
		// TODO Auto-generated method stub
		return new MTMusicItem();
	}

	@Override
	public IAlbum insertInTimeOrder(MusicItem that) {
		// TODO Auto-generated method stub
		return new ConsMusicItem(that, new MTMusicItem());
	}
	
	
}
