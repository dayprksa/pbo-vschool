import java.util.Scanner;
public class kalkulator {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner (System.in)){

            System.out.println("Kalkulator Sederhana");
            int rp=1;

            while (rp==1) {
                System.out.print("Angka Pertama   : ");
                int ap = myObj.nextInt();
                System.out.print("Angka Kedua : ");
                int ak = myObj.nextInt();

                System.out.println("1. Tambah\n2. Kurang\n3. Bagi\n4. Kali\n5. Modulo");
                System.out.print("Pilihan Anda  : ");
                int pil = myObj.nextInt();

                if (pil==1){
                    int result = ap + ak;
                    System.out.println(ap+ " + " +ak+ " = " +result);
                } else if (pil==2){
                    int result = ap - ak;
                    System.out.println(ap+ " - " +ak+ " = " +result);
                } else if (pil==3){
                    int result = ap / ak;
                    System.out.println(ap+ " / " +ak+ " = " +result);
                } else if (pil==4){
                    int result = ap * ak;
                    System.out.println(ap+ " x " +ak+ " = " +result);
                } else if (pil==5) {
                    int result = ap % ak;
                    System.out.println(ap+ " % " +ak+ " = " +result);
                } else {
                    System.out.println("Pilihan Anda Salah!");
                }
                System.out.print("Ulang (1/2) : ");
                rp = myObj.nextInt();
            }
        }
    }
}