# Assignment-Programs
TRIANGLE STAR PATTERN

In this program i have written a java code to print the triangle star pattern.

For that I have written one mothod called trianglepattern.

In that method I have declared one variable n which is used to provide the number of rows.

And i have written two for loops to provide spacing between the stars.


     for (int i=1;i<=n;i++)  
     {  
     for (int j=i; j<n ;j++)   
     {  
     System.out.print(" ");  
     }  



Next I have used one more for loop to print the star. inside that for loop I have written if-else blocks to get the required output.

In the if block I have written 3 conditions with OR operator for where we have to print star.


      for ( int k=1; k<=(2*i-1) ;k++)   
      {  
      if(k==1 ||  k==(2*i-1) || i==n)   
      {  
      System.out.print("*");  
      }  


In else block I have written a print statement for not to print star.

      System.out.print(" "); 

In outer for loop i have written a println statement to go to next line.

      System.out.println(" ");

And in the main method I have called the trianglepattern method with n value.

      public static void main(String[] args)
      {
      trianglepattern(5);
      } 


