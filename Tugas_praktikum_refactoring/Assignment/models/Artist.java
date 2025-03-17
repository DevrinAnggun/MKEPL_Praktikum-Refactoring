package Assignment.models;

public class Artist {
    private String name;
    private String alias;
    private String imageURL;

    public Artist(String name, String alias, String imageURL) {
        this.name = name;
        this.alias = alias;
        this.imageURL = imageURL;
    }

    public String getArtistInfo() {
        return "Artist: " + name + (alias.isEmpty() ? "" : " (Also known as: " + alias + ")");
    }
}
