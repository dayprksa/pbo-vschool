public class operLogika {
    public static void main(String[] args){
        boolean a = true, b = false;
        
        boolean log_AND = a && b;
        boolean log_OR = a || b;
        boolean log_NOTa = !a;
        boolean log_NOTb = !b;
        
        System.out.println(a+ " AND " +b+ " = " +log_AND);
        System.out.println(a+ " OR " +b+ " = " +log_OR);
        System.out.println(a+ " NOT_a " +b+ " = " +log_NOTa);
        System.out.println(a+ " NOT_b " +b+ " = " +log_NOTb);
      
    }
}