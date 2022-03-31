import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Take the new input");
        int n= sc.nextInt();

        for(int i=1;i<n+1;i++){
            int j=i;
            while(j!=0) {
                System.out.print("*");
                j--;
            }
            System.out.println("");
        }
    }
}
