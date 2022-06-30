package ReviewLTCB2;

import junit.framework.TestCase;

public class AlbumTest extends TestCase {
	public void testConstructor() {
		ClockTime clockTime1= new ClockTime(4, 30);
		Song song1= new Song("Nắm Lấy Tay Anh","Tú Nguyễn","Trữ tình");
		SourceFile sourceFile1 = new SourceFile("namlay.mp3", 5011, clockTime1);
		MusicItem musicItem1 = new MusicItem(song1, sourceFile1, 32912, "Tuấn Hưng");
		
		ClockTime clockTime2= new ClockTime(4, 12);
		Song song2= new Song("Noi anh gap em","Hoang Hiep","Tru tinh");
		SourceFile sourceFile2 = new SourceFile("noigapem.mp3", 4230, clockTime2);
		MusicItem musicItem2 = new MusicItem(song2, sourceFile2, 2651, "Quang Dung, My Tam");
		MTMusicItem empty = new MTMusicItem();
		
		ClockTime clockTime3= new ClockTime(4, 36);
		Song song3= new Song("Con đường có lá me bay","Hoàng Hiệp","Cách mạng");
		SourceFile sourceFile3 = new SourceFile("mebay.mp3", 5130, clockTime3);
		MusicItem musicItem3 = new MusicItem(song3, sourceFile3, 198, "Quang Dung");
		
		
		ClockTime clockTime4= new ClockTime(4, 17);
		Song song4= new Song("Sao biển"," Phạm Minh Tuấn"," Trữ tình");
		SourceFile sourceFile4 = new SourceFile("saobien.mp3", 48711, clockTime4);
		MusicItem musicItem4 = new MusicItem(song4, sourceFile4, 5361, "Quang Dung");
		
		
		ConsMusicItem consMusicItem1 = new ConsMusicItem(musicItem2, empty);
		ConsMusicItem consMusicItem2 = new ConsMusicItem(musicItem1, consMusicItem1);
		ConsMusicItem consMusicItem3 = new ConsMusicItem(musicItem3, consMusicItem2);
		ConsMusicItem consMusicItem4 = new ConsMusicItem(musicItem4, consMusicItem3);
		
		Album mixAlbum= new MixAlbum("Top bài hát Việt",2021,consMusicItem4); 
		Album singleAlbum= new SingleAlbum("Top bài hát Việt",2021,consMusicItem4,"Quang Dũng"); 
		
		System.out.println(mixAlbum);
	}
	
}
