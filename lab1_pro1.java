class lab1_pro1{

    public static void main(String args[])
    {
       int x,y,z,a,b,c;
       a=Integer.parseInt(args[0]);
       b=Integer.parseInt(args[1]);
       c=Integer.parseInt(args[2]);
       double d;
       d=Math.sqrt((b*b)-4*a*c);
       if(d>0)
       {
        System.out.println("Quqdratic Equation has real an distint roots");
        double root1,root2;
        root1=(-b+d)/2*a;
        root2=(-b-d)/2*a;
        System.out.println(root1);
        System.out.println(root2);
       }
       else if(d==0)
       {
        System.out.println("Quqdratic Equation has real and equal roots");
        double root;
        root=(-b+d)/2*a;
        System.out.println("roots are");
        System.out.println(root);
       }
       else{
           System.out.println("Roots are imaginary ");

       }
           
    }
}