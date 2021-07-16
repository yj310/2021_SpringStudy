package kr.hs.study.model.dto;

public class MusicDTO {
	
	private int id;
	private String song_title;
	private String song_singer;
	private String song_genre;
	private int song_price;
	private String song_passwd;
	private String song_date;
	
	private int music_seq;
	
	public MusicDTO() {
		super();
	}

	public MusicDTO(int id, String song_title, String song_singer, String song_genre, int song_price,
			String song_passwd, String song_date) {
		super();
		this.id = id;
		this.song_title = song_title;
		this.song_singer = song_singer;
		this.song_genre = song_genre;
		this.song_price = song_price;
		this.song_passwd = song_passwd;
		this.song_date = song_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSong_title() {
		return song_title;
	}

	public void setSong_title(String song_title) {
		this.song_title = song_title;
	}

	public String getSong_singer() {
		return song_singer;
	}

	public void setSong_singer(String song_singer) {
		this.song_singer = song_singer;
	}

	public String getSong_genre() {
		return song_genre;
	}

	public void setSong_genre(String song_genre) {
		this.song_genre = song_genre;
	}

	public int getSong_price() {
		return song_price;
	}

	public void setSong_price(int song_price) {
		this.song_price = song_price;
	}

	public String getSong_passwd() {
		return song_passwd;
	}

	public void setSong_passwd(String song_passwd) {
		this.song_passwd = song_passwd;
	}

	public String getSong_date() {
		return song_date;
	}

	public void setSong_date(String song_date) {
		this.song_date = song_date;
	}


	public int getMusic_seq() {
		return music_seq;
	}

	public void setMusic_seq(int music_seq) {
		this.music_seq = music_seq;
	}
	
	
	
}
