import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
         System.out.println("enetr the value of n");
        n=sc.nextInt();
        sc.nextLine();
        int m=n,s=0,p=0;
        while(m!=0){
            p++;
            m=m/10;
        }
        m=n;
        while(m!=0){
            int a=m%10;
            s+=Math.pow(a,p);
            m=m/10;
        }
        
        if(s==n){
             System.out.println("it is a armstrong number");
        }
        else{
             System.out.println("it is not a armstrong number");
        }

    }
}