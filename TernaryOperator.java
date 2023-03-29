import java.util.*;

class TernaryOperator
{
    int a=12,b=15,c=30,max;
    public static void main(String[] args) {
        
        TernaryOperator r=new TernaryOperator();
        r.max=(r.a>r.b?(r.a>r.c?r.a:r.c):(r.b>r.c?r.b:r.c));
        System.out.println("maximum value:"+r.max);
    }

}