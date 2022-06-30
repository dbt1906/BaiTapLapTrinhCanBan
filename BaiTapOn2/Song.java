package ReviewLTCB2;

public class Song {
	private String title;
	private String actor;
	private String genre;
	/**
	 * @param title tieu de bai hat
	 * @param actor  nhac si sang tac
	 * @param genre the loai nhac
	 */
	public Song(String title, String actor, String genre) {
		this.title = title;
		this.actor = actor;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return title +", "+actor +", "+ genre +", ";
	}
	/**
	 * @return the actor
	 */
	public String getActor() {
		return actor;
	}
	/**
	 * @param actor the actor to set
	 */
	public void setActor(String actor) {
		this.actor = actor;
	}
	
	
}
