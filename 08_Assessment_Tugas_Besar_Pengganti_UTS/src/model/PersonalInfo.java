public class PersonalInfo {
    private String namaLengkap;
    private String alamat;
    private String nomorTelepon;
    private String email;
    private String jenisKelamin;

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
}
