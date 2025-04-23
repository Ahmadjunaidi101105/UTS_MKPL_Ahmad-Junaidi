public class PersonalInfo {
    private final String namaLengkap;
    private final String alamat;
    private final String nomorTelepon;
    private final String email;
    private final String jenisKelamin;

    public PersonalInfo(String namaLengkap, String alamat, String nomorTelepon, String email, String jenisKelamin) {
        this.namaLengkap = namaLengkap;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getEmail() {
        return email;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    @Override
    public String toString() {
        return "Nama: " + namaLengkap +
               "\nJenis Kelamin: " + jenisKelamin +
               "\nAlamat: " + alamat +
               "\nTelepon: " + nomorTelepon +
               "\nEmail: " + email;
    }
}
