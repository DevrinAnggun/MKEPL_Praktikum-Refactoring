//sebelum refactoring
private String jenisKamar;

public String getJenisKamar() {
    return jenisKamar;
}

//sesudah refactoring
public enum RoomType {
    STANDARD,
    DELUXE,
    SUITE
}
