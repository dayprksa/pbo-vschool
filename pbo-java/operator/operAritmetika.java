public class operAritmetika {   
    public static void main (String[] args){
        int a = 27, b = 2;
            
        int jumlah = a + b;
        int kurang = a - b;
        int kali = a * b;
        float bagi = (float) a / b;
        int modulo = a % b; 
        
        System.out.println(a+ " + " +b+ " = " +jumlah);
        System.out.println(a+ " - " +b+ " = " +kurang);
        System.out.println(a+ " x " +b+ " = " +kali);
        System.out.println(a+ " / " +b+ " = " +bagi);
        System.out.println(a+ " % " +b+ " = " +modulo);
    }
}