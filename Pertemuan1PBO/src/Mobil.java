public class Mobil {
    String merk;
    int tahunPembuatan;

    public void nyalakan()
    {
        System.out.println(this.merk + " Menyala ");
    }
    public void maju()
    {
        System.out.println(this.merk + " Berjalan maju ");
    }public void mundur()
    {
        System.out.println(this.merk + " Berjalan mundur ");
    }
Mobil(String merk,int tahunPembuatan){
        this.merk=merk;
        this.tahunPembuatan=tahunPembuatan;
}

}
