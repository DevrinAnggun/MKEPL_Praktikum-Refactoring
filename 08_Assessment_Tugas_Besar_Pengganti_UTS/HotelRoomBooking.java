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
        // sebelum refactoring
        // System.out.println("Nama Pemesan : " + namaPemesan);
        // System.out.println("Jenis Kelamin: " + jenisKelamin);
        // System.out.println("No. KTP      : " + nomorKTP);
        // System.out.println("Telepon      : " + nomorTelepon);
        // System.out.println("Email        : " + email);

        // System.out.println("Jenis Kamar  : " + jenisKamar);
        // System.out.println("Jumlah Tamu  : " + jumlahTamu);
        // System.out.println("Jumlah Malam : " + jumlahMalam);
        // System.out.println("Harga/Malam  : " + hargaPerMalam);
        // System.out.println("Check-in     : " + tanggalCheckin);
        // System.out.println("Check-out    : " + tanggalCheckout);
        // System.out.println("Status Aktif : " + statusAktif);
        // System.out.println("Voucher      : " + kodeVoucher);
        // System.out.println("Sudah Dibayar: " + sudahDibayar);

        // sesudah refactoring
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
