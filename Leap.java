import java.util.Scanner;

class Leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
         System.out.println("enetr the value of n");
        n=sc.nextInt();
        sc.nextLine();
        if(n%400==0){
         System.out.println("it is leap year");   
        }
        else{
            System.out.println("it is not a leap year");
        }

    }
}