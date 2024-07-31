class setbits{

    public static void main(String args[])
    {
      int x,set=0;
      x=Integer.parseInt(args[0]);
      int temp=x;
      while(temp>0)
      { if(temp%2==1)
        {set=set+1;
        }
        temp=temp/2;

      }

    
    System.out.println("no of set bbits are:");
    System.out.println(set);
    }
}