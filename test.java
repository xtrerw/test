import java.util.Scanner;

/**
 * test
 */
public class test {
    /**
     * 
     * @param n
     * @param a1
     * @param a2
     * @param a3
     */
    public static void sum(int n,int[] a1,int[] a2,int[] a3) {
        for (int i = 0; i < n; i++) {
            a3[i]=a2[i]+a1[i];
            System.out.println("array3 "+a3[i]);
        }
    }
    /**
     * 
     * @param n
     * 
     */
    public static void name(int n) {
        switch (n) {
            case 1:
                System.out.println("no cumple con este estándar");
                break;
            
            default:
                break;
        }
    }
    /**
     * 
     * @param args
     * 
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce n");
        int n=sc.nextInt();
        int [] a1=new int[n];
        int [] a2=new int[n];
        int [] a3=new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("introduce primero array");
            a1[i]=sc.nextInt();
            System.out.println("introduce segundo array");
            a2[i]=sc.nextInt();
        }
        sum(n, a1, a2, a3);
    }
}
