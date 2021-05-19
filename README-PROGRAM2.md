HALLOW RECTANGLE

I have written this java program to create a hallow rectanlge and written a name inside it.

First i have written a code to enter the name from the user side using Scanner class.

      System.out.println("Enter name");
      String name=sc.next();
  
  And the code to enter the rows and columns is
  
     System.out.println("Enter rows");
     int r =sc.nextInt();
     System.out.println("Enter columns");
     int c=sc.nextInt();
     int a=name.length();
  
  I have written 2 for loops to create the hallow rectanlge, one is for rows and the other one is for columns.
  
  I have written if block to print the symbol "+" at the edges.
  
      if(i==0 && j==0 || i==0 && j==c-1 || i==r-1 && j==0 || i==r-1 &&j==c-1)
      System.out.print("+");
  
 The else if block contains the code to print "-" at the top and bottom.
  
      else if(i==0 || i==r-1)
      System.out.print("-");
      
 The else if block contains the code to print "|" at the right and the left side.  
 
      else if(j==0 || j==c-1)
      System.out.print("|");
      
After creating the hallow rectangle we have to insert the name inside the rectangle with conditions that the name should be present in the last but third row and having gap of 2 space at the right side. So that i have used another else if block toprint the name.

      else if(i==r-3 && j==c-(a+2))
      {
      System.out.print(name);
      j+=a-1;
      }
      
 And finally i have written else block to provide space.
 
By writing this code we can get the output as follows.

     Enter name :
     Deepa
     Enter rows :
     10
     Enter columns :
     15
     +-------------+
     |             |
     |             |
     |             |
     |             |
     |             |
     |             |
     |       Deepa |
     |             |
     +-------------+
