package Taskz1101;

public class Album {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Song[] getSongs() {
        return songs;
    }

    public void setSongs(Song[] songs) {
        this.songs = songs;
    }

    private String title;
    private Song[] songs;

    public Album(String title, Song[] songs){
        this.title = title;
        this.songs = songs;
    }
}
