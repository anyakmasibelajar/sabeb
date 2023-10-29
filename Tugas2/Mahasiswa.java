package Tugas2;

/**
 * Kelas Mahasiswa merupakan representasi dari biodata seorang mahasiswa.
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    /**
     * Konstruktor untuk membuat objek Mahasiswa.
     * @param nama Nama lengkap mahasiswa.
     * @param nim Nomor Induk Mahasiswa (NIM).
     * @param jurusan Jurusan mahasiswa.
     */
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    /**
     * Mendapatkan nama mahasiswa.
     * @return Nama lengkap mahasiswa.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mendapatkan NIM mahasiswa.
     * @return NIM mahasiswa.
     */
    public String getNim() {
        return nim;
    }

    /**
     * Mendapatkan jurusan mahasiswa.
     * @return Jurusan mahasiswa.
     */
    public String getJurusan() {
        return jurusan;
    }

    /**
     * Mengubah nama mahasiswa.
     * @param nama Nama baru mahasiswa.
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Mengubah NIM mahasiswa.
     * @param nim NIM baru mahasiswa.
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /**
     * Mengubah jurusan mahasiswa.
     * @param jurusan Jurusan baru mahasiswa.
     */
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    /**
     * Metode untuk menampilkan data biodata mahasiswa.
     */
    public void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }

    /**
     * Metode utama program.
     */
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Yuuunkyy", "202210370311138", "Informatika");
        System.out.println("Informasi Mahasiswa");
        mahasiswa.tampilkanInfo();

    }
}
