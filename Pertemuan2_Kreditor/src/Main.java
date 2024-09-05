public class Main {
    public static void main(String[] args) {
        //Membaca input dari parameter
        double hutang = Double.parseDouble(args[0]);
        float bunga = Float.parseFloat(args[1]);
        int jumlahCicilan = Integer.parseInt(args[2]);

        //Tampilkan data input
        System.out.println("Hutang              : " + hutang);
        System.out.println("Bunga               : " + bunga);
        System.out.println("Jumlah Cicilan      : " + jumlahCicilan);

        //Menghitung total yang harus dibayar
        double totalBayar  = hutang + (hutang * bunga/100);

        //Jumlah yang harus di bayarkan di tiap cicilan
        double angsuran = totalBayar / jumlahCicilan;

        //Tamoilkan data total bayar dan angsuran
        System.out.println("------------------------------------");
        System.out.println("Total Bayar         : " + totalBayar);
        System.out.println("Angsuran            : " + angsuran);

        //Tampilan tabel
        System.out.println("+-----------------------------------------------+");
        System.out.println("| Angsuran ke- | Jumlah Bayar\t| Sisa Pinjaman\t| ");
        System.out.println("+-----------------------------------------------+");

        for (int i = 0; i < jumlahCicilan; i++) {
            //Menghitung
            totalBayar-= angsuran;
            //Mencetak tabel
            System.out.printf("| %12d | %-14f | %-13f |\n", (i+1),angsuran,totalBayar );
            System.out.println("+-----------------------------------------------+");
        }
        System.out.println("\n\n");

        //Menggunakan metode lain

        // Cetak header tabel
        System.out.println("+--------------+--------------+---------------+");
        System.out.println("| Angsuran Ke- | Jumlah Bayar | Sisa Pinjaman |");
        System.out.println("+--------------+--------------+---------------+");

        for (int j = 0; j < jumlahCicilan; j++) {
            // Data-data yang ditampilkan
            int angsuranKe = j + 1; // 14
            double jumlahBayar = angsuran; // 14
            double sisaPinjaman = totalBayar - (angsuran * angsuranKe); // 15

            //Jadikan String untuk menghitung panjang karakter
            String strAngsuranKe= String.valueOf(angsuranKe);
            String strJumlahBayar = String.valueOf(jumlahBayar);
            String strSisaPinjaman = String.valueOf(sisaPinjaman);

            //Jumlah spasi yang dibutuhkan
            int jmlSpasiAngsuranKe = 14 - strAngsuranKe.length();
            int jmlSpasiJumlahBayar = 14 - strJumlahBayar.length();
            int jmlSpasiSisaPinjaman = 14 - strSisaPinjaman.length();


            //Membuat data menjadi rata kanan
            for (int i = 0; i < jmlSpasiAngsuranKe; i++) {
                strAngsuranKe = (" " + strAngsuranKe);
            }
            for (int i = 0; i < jmlSpasiJumlahBayar; i++) {
                strJumlahBayar = (" " + strJumlahBayar);
            }
            for (int i = 0; i < jmlSpasiSisaPinjaman; i++) {
                strSisaPinjaman = (" " + strSisaPinjaman);
            }

            // cetak
            System.out.println("|" +strAngsuranKe+"|"+strJumlahBayar+"|" +strSisaPinjaman+"|");
            System.out.println("+--------------+--------------+---------------+");
        }


    }
    }
