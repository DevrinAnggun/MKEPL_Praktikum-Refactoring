// sebelum refactor
// public HotelRoomBooking(String namaPemesan, String nomorKTP, String nomorTelepon, String email, 
//                         String jenisKelamin, String jenisKamar, int jumlahTamu, int jumlahMalam, 
//                         double hargaPerMalam, Date tanggalCheckin, Date tanggalCheckout, 
//                         boolean statusAktif, String kodeVoucher, boolean sudahDibayar)

// sesudah refactor                      
public class HotelRoomBooking {

    private Customer customer;
    private BookingInfo booking;

    public HotelRoomBooking(Customer customer, BookingInfo booking) {
        this.customer = customer;
        this.booking = booking;
    }

    public void cetakDetailPemesanan() {
        System.out.println("===== DETAIL PEMESANAN KAMAR =====");
        System.out.println("Nama Pemesan : " + customer.getNama());
        System.out.println("Jenis Kelamin: " + customer.getJenisKelamin());
        System.out.println("No. KTP      : " + customer.getNomorKTP());
        System.out.println("Telepon      : " + customer.getNomorTelepon());
        System.out.println("Email        : " + customer.getEmail());
        System.out.println("Jenis Kamar  : " + booking.getJenisKamar());
        System.out.println("Jumlah Tamu  : " + booking.getJumlahTamu());
        System.out.println("Jumlah Malam : " + booking.getJumlahMalam());
        System.out.println("Harga/Malam  : " + booking.getHargaPerMalam());
        System.out.println("Check-in     : " + booking.getTanggalCheckin());
        System.out.println("Check-out    : " + booking.getTanggalCheckout());
        System.out.println("Status Aktif : " + booking.isStatusAktif());
        System.out.println("Voucher      : " + booking.getKodeVoucher());
        System.out.println("Sudah Dibayar: " + booking.isSudahDibayar());
        System.out.println("Total Biaya  : Rp " + hitungTotalBiaya());
        System.out.println("Tipe Tamu    : " + klasifikasiTamu());
        System.out.println("===================================");
    }

    public double hitungTotalBiaya() {
        double total = booking.getHargaPerMalam() * booking.getJumlahMalam();
        if (booking.getJumlahTamu() > 2) {
            total += (booking.getJumlahTamu() - 2) * 100000;
        }
        if (booking.getKodeVoucher() != null && booking.getKodeVoucher().length() > 3) {
            total -= 50000;
        }
        if (!booking.isStatusAktif()) {
            total = 0;
        }
        return total;
    }

    public String klasifikasiTamu() {
        int jumlah = booking.getJumlahTamu();
        if (jumlah == 1)
            return "Individu";
        else if (jumlah == 2)
            return "Pasangan";
        else
            return "Keluarga";
    }
}
