package ReviewLTCB2;

import junit.framework.TestCase;

public class MixAlbumTest extends TestCase {
	ClockTime clockTime1= new ClockTime(4, 30);
	Song song1= new Song("Nắm Lấy Tay Anh","Tú Nguyễn"," Trữ tình");
	SourceFile sourceFile1 = new SourceFile("namlay.mp3", 5011, clockTime1);
	MusicItem musicItem1 = new MusicItem(song1, sourceFile1, 32912, "Tuấn Hưng");
	
	ClockTime clockTime2= new ClockTime(5, 02);
	Song song2= new Song("Người Yêu Tuyệt Vời","Trịnh Thăng Bình","Trữ tình");
	SourceFile sourceFile2 = new SourceFile("nguoiyeutv.mp3", 1212, clockTime2);
	MusicItem musicItem2 = new MusicItem(song2, sourceFile2, 2651, "Trịnh Thăng Bình");
	MTMusicItem empty = new MTMusicItem();
	ClockTime clockTime3= new ClockTime(4, 13);
	Song song3= new Song("Anh Sợ Mất Em","OnlyC – JongKay","Trữ tình");
	SourceFile sourceFile3 = new SourceFile(" anhsomatem.mp3", 59201, clockTime3);
	MusicItem musicItem3 = new MusicItem(song3, sourceFile3, 198, "The Men");
	
	
	ClockTime clockTime4= new ClockTime(4, 45);
	Song song4= new Song("Anh Nhớ Em Người Yêu Cũ"," Khánh Đơn"," Trữ tình");
	SourceFile sourceFile4 = new SourceFile(" nhonguoiyeucu.mp3", 5612, clockTime4);
	MusicItem musicItem4 = new MusicItem(song4, sourceFile4, 3592, "Minh Vương M4U");
	
	ClockTime clockTime5= new ClockTime(4, 20);
	Song song5= new Song("Lời Hứa Chỉ Là Lời Hứa","Bình Nguyên"," Trữ tình");
	SourceFile sourceFile5 = new SourceFile("chilaloihua.mp3", 4350, clockTime4);
	MusicItem musicItem5 = new MusicItem(song5, sourceFile5, 35270, "Nam Du");

	
	
	ConsMusicItem consMusicItem1 = new ConsMusicItem(musicItem1, empty);
	ConsMusicItem consMusicItem2 = new ConsMusicItem(musicItem2, consMusicItem1);
	ConsMusicItem consMusicItem3 = new ConsMusicItem(musicItem3, consMusicItem2);
	ConsMusicItem consMusicItem4 = new ConsMusicItem(musicItem4, consMusicItem3);
	ConsMusicItem consMusicItem5 = new ConsMusicItem(musicItem5, consMusicItem4);
	
	Album mixAlbum= new MixAlbum("Top bài hát Việt",2021,consMusicItem5); 
	public void testConstructor() {
		
		Album mixAlbum= new MixAlbum("Top bài hát Việt",2021,consMusicItem5); 
	}
	public void testHowMany() {
		
		assertEquals(mixAlbum.howMany(),5);
	}
	public void testTotalTime() {
		Album mixAlbum= new MixAlbum("Top bài hát Việt",2021,consMusicItem5); 
		assertEquals(mixAlbum.totalTime(),1395.0,0.01);
	}
	public void testThisActor() {
		MusicItem musicItem5 = new MusicItem(song5, sourceFile5, 35270, "Nam Du");
		ConsMusicItem consMusicItem1 = new ConsMusicItem(musicItem5, empty);
		Album mixAlbum= new MixAlbum("Top bài hát Việt",2021,consMusicItem5); 
		assertEquals(mixAlbum.thisActor("Bình Nguyên"),consMusicItem1);
		}
	public void testSortByTime() {
		Album mixAlbum= new MixAlbum("Top bài hát Việt",2021,consMusicItem5); 
		assertEquals(mixAlbum.sortByTime(),new ConsMusicItem(musicItem3, new ConsMusicItem(musicItem1, 
				new ConsMusicItem(musicItem5, new ConsMusicItem(musicItem4,new ConsMusicItem(musicItem2, empty))))));
		System.out.println(mixAlbum.sortByTime());
		
	}
}
