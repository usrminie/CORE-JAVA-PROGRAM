class pythagoras
{
    int p=3,b=7;
    public static void main(String[] args) {
     double h;
     pythagoras n=new pythagoras();
     h=(Math.pow(n.p,2)+Math.pow(n.b,2));
     h=Math.sqrt(h);
     System.out.println("Hypotenous:"+h);  
    }
}