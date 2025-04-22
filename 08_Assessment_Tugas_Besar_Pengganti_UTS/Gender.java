//sebelum refactoring
private String jenisKelamin;

public String getJenisKelamin() {
    return jenisKelamin;
}

//sesudah refactoring
public enum Gender {
    PRIA,
    WANITA
}
