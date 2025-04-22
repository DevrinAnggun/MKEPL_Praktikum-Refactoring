import java.util.Date;

public class BookingInfo {
    private RoomType jenisKamar;
    private int jumlahTamu;
    private int jumlahMalam;
    private double hargaPerMalam;
    private Date tanggalCheckin;
    private Date tanggalCheckout;
    private String kodeVoucher;
    private boolean sudahDibayar;
    private boolean statusAktif;

    public BookingInfo(RoomType jenisKamar, int jumlahTamu, int jumlahMalam, double hargaPerMalam,
                       Date tanggalCheckin, Date tanggalCheckout, String kodeVoucher,
                       boolean sudahDibayar, boolean statusAktif) {
        this.jenisKamar = jenisKamar;
        this.jumlahTamu = jumlahTamu;
        this.jumlahMalam = jumlahMalam;
        this.hargaPerMalam = hargaPerMalam;
        this.tanggalCheckin = tanggalCheckin;
        this.tanggalCheckout = tanggalCheckout;
        this.kodeVoucher = kodeVoucher;
        this.sudahDibayar = sudahDibayar;
        this.statusAktif = statusAktif;
    }

    public RoomType getJenisKamar() {
        return jenisKamar;
    }

    public int getJumlahTamu() {
        return jumlahTamu;
    }

    public int getJumlahMalam() {
        return jumlahMalam;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    public Date getTanggalCheckin() {
        return tanggalCheckin;
    }

    public Date getTanggalCheckout() {
        return tanggalCheckout;
    }

    public String getKodeVoucher() {
        return kodeVoucher;
    }

    public boolean isSudahDibayar() {
        return sudahDibayar;
    }

    public boolean isStatusAktif() {
        return statusAktif;
    }
}