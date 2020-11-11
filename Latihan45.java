/**
 * Latihan45
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Cetak Nama
 */
class Printer {
    private int jmlCetak;
    private String nama;

    /**
     * @return int return the jmlCetak
     */
    public int getJmlCetak() {
        return jmlCetak;
    }

    /**
     * @param jmlCetak the jmlCetak to set
     */
    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    /**
     * @return String return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    
     public void setNama(String nama) {
        this.nama = nama;
    }

 
    public void cetak(String nama) {
    }
    public void cetak(String nama, int jmlCetak) {
        System.out.println("Nama anda : " + nama);
        System.out.println("Hasil Cetak : ");
        for(int i=1;i<=jmlCetak;i++){
            System.out.println(i + ". " + nama );
        }
    }

}