import java.util.Scanner;

class Swapwithout3rdvar
{
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two values of number");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("Before swapping:"+a+" "+b); 
        a=a+b;
        a=a-b;
        b=a-b;
        System.out.println("After swapping:"+a+" "+b);

    }
}