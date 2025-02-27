public class GUD {
    public static void main(String[] args) {
        
        int n1 = 16;
        int n2 = 24;
        System.out.print(simpleTask(n1,n2));
        
    }    
    public static int simpleTask(int n1, int n2){
        int gcd = 0;
        for(int count = 1; count <= n1 && count <= n2; count++){
            if(n1 % count == 0 && n2 % count == 0){
                gcd = count;
            }
        }
        return gcd;
    }
}
