// sebelum refactor
public class Customer {
    public String nama;
    public String nomorKTP;
    public String nomorTelepon;
    public String email;
    public Gender jenisKelamin;
}

// sesudah refactor
public class Customer {
    private String nama;
    private String nomorKTP;
    private String nomorTelepon;
    private String email;
    private Gender jenisKelamin;

    public Customer(String nama, String nomorKTP, String nomorTelepon, String email, Gender jenisKelamin) {
        this.nama = nama;
        this.nomorKTP = nomorKTP;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getEmail() {
        return email;
    }

    public Gender getJenisKelamin() {
        return jenisKelamin;
    }
}
