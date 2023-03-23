import java.util.*;
import java.math.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(sc.hasNextInt())
        {
        al.add(sc.nextInt());
        }
        int len=al.size();
        B b=new B();
        int sum1=b.add1(al,len);
        int sum2=b.add2(al,len);
        System.out.println(Math.abs(sum1-sum2));
        
    }
}
class A{
    
    int add1(ArrayList al,int len)
    {
         int sum1=0;
       
        for(int i=0;i<len;i++)
        {
            if(i%2==0)
            {
               sum1=sum1+(int)(al.get(i)); 
            }
        }
        return sum1;
    }
    
}
class B extends A{
    
    int add2(ArrayList al,int len)
    {
        int sum2=0;
        for(int i=0;i<len;i++)
        {
            if(i%2==1)
            {
                sum2=sum2+(int)(al.get(i));
            }
        }
        return sum2;
    }
}
