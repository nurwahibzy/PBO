public class SepedaMotor {
    //properti
    String merk;
    int tahunPembuatan;

    //fungsi
    public void nyalakan()
    {
        System.out.println(this.merk + " Menyala ");
    }
    public void jalan()
    {
        System.out.println(this.merk+" Berjalan");
    }

    //Konstruktor
    public SepedaMotor(String merk,int tahunPembuatan)
    {
        this.merk=merk;
        this.tahunPembuatan=tahunPembuatan;
    }
}
