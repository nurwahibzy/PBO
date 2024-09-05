public class Main
{
    public static void main(String[] args)
    {
        int x = 1;
        int y = 2;
        int z = 21;
        //Menambahkan bilangan
        System.out.println(tambah(x,y));
        int[] inputAngka = new int[10];
        for (int i = 1; i < args.length; i++) {
            String input = args[i];
            //Konversi dari String ke integer
            int inputInt = Integer.parseInt(input);
            inputAngka[(i-1)] = inputInt;
        }

        System.out.println("Jumlah bilangan = "+tambahBanyak(inputAngka));
        //Percabangan
        boolean hasilGanjil= isGanjil(z);
        if (hasilGanjil == true)
            System.out.println("Bilangan " + z + " adalah bilangan ganjil" );
        else
            System.out.println("Bilangan " + z + " bukan bilangan ganjil" );


        //menampilkan nama pembuat
        String namaPembuat = args[0];
        System.out.println("Kode ini dibuat oleh "+namaPembuat);

        SepedaMotor sepeda1 = new SepedaMotor("Vespa",2005);
        SepedaMotor sepeda2 = new SepedaMotor("Beat",2022);

        sepeda1.nyalakan();
        sepeda2.nyalakan();

        sepeda1.jalan();
        sepeda2.jalan();

        Mobil mobil1 = new Mobil("Panther",2000);
        Mobil mobil2 = new Mobil("Toyota Supra",2022);

        mobil1.nyalakan();
        mobil2.nyalakan();

        mobil1.maju();
        mobil2.maju();

        mobil1.mundur();
        mobil2.mundur();
        }
        public static boolean isGanjil(int angka)
        {
            if (angka % 2 == 1)
                return true;
            else
                return false;
        }
        public static int tambah(int x,int y)
        {
            int hasil = x+y;
        return hasil;
        }
        public static int tambahBanyak(int ... bilangan)
        {
            int total = 0;
            for (int i = 0; i < bilangan.length; i++) {
                total+= bilangan[i];
            }
            return total;
        }
        public static void bilanganMulti(String[] bilangan)
        {
            int totalMulti = 0;
            for (int i = 1; i < bilangan.length; i++) {
                totalMulti+=Integer.parseInt(bilangan[i]);
            }
            System.out.println("Bilangan Multi = " + totalMulti);
        }
    }
