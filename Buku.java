public class Buku {
    String judulBuku;
    String penulis;
    int tahunTerbit;


    public Buku(String judulBuku, String penulis, int tahunTerbit) {
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public void display() {
        System.out.println("Judul Buku: " + this.judulBuku + ", Penulis: " + this.penulis + ", Tahun Terbit: " + this.tahunTerbit);
    } 
}