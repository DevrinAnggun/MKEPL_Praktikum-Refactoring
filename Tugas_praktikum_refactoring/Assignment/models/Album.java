package Assignment.models;

public class Album {
    private String name;
    private String coverURL;

    public Album(String name, String coverURL) {
        this.name = name;
        this.coverURL = coverURL;
    }

    public String getAlbumInfo() {
        return "Album: " + name;
    }
}
