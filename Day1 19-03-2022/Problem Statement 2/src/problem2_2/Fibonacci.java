package problem2_2;

class Fibonacci{
public static void main(String args[])
{  
 int n1=1,n2=3,n3,i,count=13;  
 System.out.print(n1+" "+n2);//printing 0 and 1  
  
 for(i=0;i<count;i++)  
 {  
  n3=n1+n2;  
  System.out.print(" "+n3);  
  n1=n2;  
  n2=n3;  
 }  

}
}
