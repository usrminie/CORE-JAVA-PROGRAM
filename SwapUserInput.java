import java.util.Scanner;

class SwapUserInput
{
    public static void main(String[] args) {
        int a,b,temp;
        System.out.print("Enter two numbers:");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("Before swapping:"+a+" "+b); 
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping:"+a+" "+b);

    }
}