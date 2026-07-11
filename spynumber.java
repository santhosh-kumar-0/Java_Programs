

import java.util.Scanner;

public class spynumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int n=m;
        int sum =0 ;
        int product=1;

        while(n!=0){
            int num = n%10;
            sum = sum + num;
            product = product * num;
            n=n/10;

            

        }

        if(sum==product){
            System.out.println( m+" This is spy number");
        }
        else{
            System.out.println( m+ " This is not a spy number");
        }

        
        scan.close();
        
    }
}
