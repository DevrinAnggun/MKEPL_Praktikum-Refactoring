package Assignment;

import Assignment.models.*;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Song
        Song song = new Song("001", "Shape of You", "2017", "https://music.url/song.mp3");
        song.setGenre(Genre.POP);

        // Membuat dan mengatur Artist
        Artist artist = new Artist("Ed Sheeran", "Teddy", "https://artist.url/image.jpg");
        song.setArtist(artist);

        // Membuat dan mengatur Album
        Album album = new Album("Divide", "https://album.url/cover.jpg");
        song.setAlbum(album);

        // Menampilkan informasi
        System.out.println("INFO LEVEL 0:");
        song.printInfo(0);  // Menampilkan informasi lagu saja

        System.out.println("\nINFO LEVEL 1:");
        song.printInfo(1);  // Menampilkan informasi lagu + artis

        System.out.println("\nINFO LEVEL 2:");
        song.printInfo(2);  // Menampilkan informasi lagu + album

        System.out.println("\nINFO LEVEL 3:");
        song.printInfo(3);  // Menampilkan semua informasi
    }
}
