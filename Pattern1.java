import java.util.Scanner;  
public class Pattern1  
{  
public static void pat(int n)  
{  
 
for (int i=1;i<=n;i++)  
{  
for (int j=i; j<n ;j++)   
{  
System.out.print(" ");  
}     
for ( int k=1; k<=(2*i-1) ;k++)   
{  
if(k==1 ||  k==(2*i-1) || i==n)   
{  
System.out.print("*");  
}  
else   
{  
System.out.print(" ");  
}  
}  
System.out.println("");  
}  
} 
public static void main(String[] args)
{
pat(5);
} 
}  