public class operRelasi {
    public static void main(String[] args) {
        int a = 27, b = 2;

            boolean kd = a < b;
            boolean lb = a > b;
            boolean ksm = a <= b;
            boolean lsm = a >= b;
            boolean sm = a == b;
            boolean td = a != b;
            
            System.out.println(a+ " < " +b+ " = " +kd);
            System.out.println(a+ " > " +b+ " = " +lb);
            System.out.println(a+ " <= " +b+ " = " +ksm);
            System.out.println(a+ " >= " +b+ " = " +lsm);
            System.out.println(a+ " == " +b+ " = " +sm);
            System.out.println(a+ " != " +b+ " = " +td);
    }
}