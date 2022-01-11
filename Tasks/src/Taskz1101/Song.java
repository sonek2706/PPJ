package Taskz1101;

public class Song {
    private String title;
    private String singer;

    public Song(String singer, String title){
        this.singer = singer;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
