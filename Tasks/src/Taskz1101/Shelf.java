package Taskz1101;

public class Shelf {
    private Album[] albums;

    public Shelf(Album[] albums) {
        this.albums = albums;
    }

    public String findAlbumBySong(String titleOfSong) {
        for (Album al : this.albums) {
            for (Song s: al.getSongs()) {
                if (titleOfSong == s.getTitle()) return al.getTitle();
            }
        }

        return "There's no such album!";
    }
}
