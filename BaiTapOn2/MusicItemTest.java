package ReviewLTCB2;

import javax.xml.transform.Source;

import junit.framework.TestCase;

public class MusicItemTest extends TestCase {
	public void testConstructor() {
		ClockTime clockTime1= new ClockTime(4, 48);
		Song song1= new Song("Khat vong","Pham Minh Tuan","Cach mang");
		SourceFile sourceFile1 = new SourceFile("khatvong.mp3", 5043, clockTime1);
		MusicItem musicItem1 = new MusicItem(song1, sourceFile1, 15350, "Quang Dung");
		
	}
	public void testMoreFavouriteThan() {
		ClockTime clockTime1= new ClockTime(4, 48);
		Song song1= new Song("Khat vong","Pham Minh Tuan","Cach mang");
		SourceFile sourceFile1 = new SourceFile("khatvong.mp3", 5043, clockTime1);
		MusicItem musicItem1 = new MusicItem(song1, sourceFile1, 15350, "Quang Dung");
		
		ClockTime clockTime2= new ClockTime(4, 12);
		Song song2= new Song("Noi anh gap em","Hoang Hiep","Tru tinh");
		SourceFile sourceFile2 = new SourceFile("noigapem.mp3", 4230, clockTime2);
		MusicItem musicItem2 = new MusicItem(song2, sourceFile2, 2651, "Quang Dung, My Tam");
		
		assertTrue(musicItem1.moreFavouriteThan(musicItem2));
	}
	public void testLongerThan() {
		ClockTime clockTime1= new ClockTime(4, 48);
		Song song1= new Song("Khat vong","Pham Minh Tuan","Cach mang");
		SourceFile sourceFile1 = new SourceFile("khatvong.mp3", 5043, clockTime1);
		MusicItem musicItem1 = new MusicItem(song1, sourceFile1, 15350, "Quang Dung");
		
		ClockTime clockTime2= new ClockTime(4, 12);
		Song song2= new Song("Noi anh gap em","Hoang Hiep","Tru tinh");
		SourceFile sourceFile2 = new SourceFile("noigapem.mp3", 4230, clockTime2);
		MusicItem musicItem2 = new MusicItem(song2, sourceFile2, 2651, "Quang Dung, My Tam");
		
		assertTrue(musicItem1.longerThan(musicItem2));
	}
	public void testFavouriteRate() {
		ClockTime clockTime1= new ClockTime(4, 48);
		Song song1= new Song("Khat vong","Pham Minh Tuan","Cach mang");
		SourceFile sourceFile1 = new SourceFile("khatvong.mp3", 5043, clockTime1);
		MusicItem musicItem1 = new MusicItem(song1, sourceFile1, 15350, "Quang Dung");
		assertEquals(musicItem1.favouriteRate(),"Phổ biến");
	}
	
}
