class CompoundInterest
{
    double p=12.6,r=7.52,n=2,t=3,a=0,CI;
    public static void main(String[] args) {
        CompoundInterest obj=new CompoundInterest();
        obj.r=(1+obj.r/100);
        for(int i=0; i<obj.t; i++)
        {
           obj.t=obj.t*obj.r;
            obj.a=obj.p*obj.t;
            System.out.println("Amount:"+obj.a);
            obj.CI=obj.a-obj.p;
            System.out.println("Compound Interest:"+obj.CI);

        }
    }
}