package ReviewLTCB2;

public class ConsMusicItem implements IAlbum{
	private MusicItem first;
	private IAlbum rest;
	/**
	 * @param first
	 * @param rest
	 */
	public ConsMusicItem(MusicItem first, IAlbum rest) {
		this.first = first;
		this.rest = rest;
	}
	
	@Override
	public String toString() {
		return first.toString() + rest;
	}
	public int howMany() {
		return 1+this.rest.howMany();
	}
	public double totalTime() {
		return first.totalTime()+rest.totalTime();
	}

	@Override
	public IAlbum thisActor(String actor) {
		if(this.first.getSong().getActor().equals(actor)) {
			return new ConsMusicItem(first, rest.thisActor(actor));
		}
			return rest.thisActor(actor);
		
	}
	public IAlbum insertInTimeOrder(MusicItem that) {
		if(that.hasTimeShorterThan(this.first)) {
			return new ConsMusicItem(that, this);
		}
		else
			return new ConsMusicItem(this.first, this.rest.insertInTimeOrder(that));
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null ||!(obj instanceof ConsMusicItem))
			return false;
		else {
			ConsMusicItem that = (ConsMusicItem) obj;
			return (this.first.equals(that.first)&&
					this.rest.equals(that.rest));
		}
		
	}

	
	@Override
	public IAlbum sortByTime() {
		// TODO Auto-generated method stub
		return this.rest.sortByTime().insertInTimeOrder(first);
	}

	
}
