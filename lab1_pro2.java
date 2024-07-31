class lab1_pro2{

public static void main(String args[])
{
    int x,temp,sum=0,d,count=0;
    x=Integer.parseInt(args[0]);
    temp=x;
    
     while(temp>9){
        sum=0;
        while(temp>0)
        {
            d=temp%10;
            sum=sum+d;
            temp=temp/10;
            count=count+1;
           //System.out.println(temp);
        }
        temp=sum;
       // System.out.println(sum);
    }
      //  System.out.println(sum);
        //System.out.println(count);
    

 if (temp==1)
 {
   System.out.println("your number  is a magic number");
}
else
{
     System.out.println("your number  is not magic number");
}
}
}