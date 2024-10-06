import java.util.Scanner;
public class kasir {
    public static void main(String[] args) {
        String[] kode = {"nr", "mg", "b", "et", "ac", "j"};
        String[] menu = {"Nasi Remes", "Mie Goreng", "Bakso", "Es Teh", "Air Cup", "Jus"};
        int[] harga = {10000, 8000, 8000, 4000, 2000, 6000};
        Scanner input = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("      Warung Sederhana    ");
        System.out.println("==========================");
        System.out.println("Kode    Menu         Harga");
        System.out.println("nr      Nasi Remes   10000");
        System.out.println("mg      Mie Goreng   8000");
        System.out.println("b       Bakso        8000");
        System.out.println("et      Es Teh       4000");
        System.out.println("ac      Air Cup      2000");
        System.out.println("j       Jus          6000");

        System.out.print("Kode Pesanan  : ");
        String inputPesanan = input.nextLine();
        String[] pesanan = inputPesanan.split(",");
        int[] jumlah = new int[pesanan.length];
        int totalHarga = 0;

        for (int i = 0; i < pesanan.length; i++) {
            pesanan[i] = pesanan[i].trim();
            int index = cariIndex(kode, pesanan[i]);

            if (index != -1) {
                System.out.print("Berapa banyak " + menu[index] + " yang ingin dipesan? ");
                jumlah[i] = input.nextInt();
                totalHarga += harga[index] * jumlah[i];
            } else {
                System.out.println("Kode pesanan " + pesanan[i] + " tidak valid.");
            }
        }

        System.out.println("\n");
        System.out.println("===================");
        System.out.println("   Struk Pesanan   ");
        System.out.println("===================");
        for (int i = 0; i < pesanan.length; i++) {
            int index = cariIndex(kode, pesanan[i]);
            if (index != -1) {
                System.out.println(menu[index] + " (" + jumlah[i] + " x " + harga[index] + ") = " + (jumlah[i] * harga[index]));
            }
        }

        System.out.println("\n");
        System.out.println("Total Harga : " + totalHarga);
        int diskonAwal = totalHarga * 5/100;
        System.out.println("Diskon 5%   : " + diskonAwal);
        System.out.println("Total   : " + (totalHarga - diskonAwal));
        System.out.print("Tunai   : ");
        int tunai = input.nextInt();
            if (tunai < (totalHarga - diskonAwal)){
                System.out.println("====================");
                System.out.println("  Uang Tidak Cukup  ");
                System.out.println("====================");
            } else {
                int kembalian = tunai - (totalHarga - diskonAwal);
                System.out.println("Kembalian   : " +kembalian);
                System.out.println("=== Terima Kasih ===");
                input.close();
            }
        }

    public static int cariIndex(String[] kode, String cariKode) {
        for (int i = 0; i < kode.length; i++) {
            if (kode[i].equalsIgnoreCase(cariKode)) {
                return i;
            }
        }
        return -1;
    }
}