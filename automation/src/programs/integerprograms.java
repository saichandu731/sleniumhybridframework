package programs;

public class integerprograms 
{
  //reverse the integer value
   public static void main(String[] args)
   {
	   int num=2345789;
	   int res=0;
	   int rem;
	   while (num!=0)
	   {
		   rem=num%10;
		  res=(res*10)+rem;
		  num=num/10;
		  
	    }
	   System.out.println("reverse="+res);
	   integerprograms.withoutdivoperator();
	   integerprograms.forloop();
	   integerprograms.pattern();
	   integerprograms.pattern1();
	   integerprograms.pattern2();
	   
	  
   }
   //divide 2 numbers without div operator
   public static void withoutdivoperator()
   {
	   int num=12;
	   int div=3;
	   int count =0;
	   while (num>=div)
	   {
		   num=num-div;
		   count ++;
		   
	   }
	   System.out.println("queotient="+count);
	   //determine remainder of 2 numbers without modulus operator
	   System.out.println("remainder="+num);
   }
   //forloop programs
   public static void forloop()
   {
	   for(int i=0;i<3;i++)
	   {
		   for(int j=0;j<2;j++)
		   {
			   System.out.println("hellow world");
		   }
	   }
   }
   //pattern using println straight line
   public static void pattern()
   {
	   for(int rows=0;rows<4;rows++)
	   {
		   for(int col=0;col<4;col++)
		   {
			   System.out.println("*");
		   }
	   }
   }
   //pattern using print and println 4/4 matrix
   public static void pattern1()
   {
	   for(int rows=0;rows<4;rows++)
	   {
		   for(int col=0;col<4;col++)
		   {
			   System.out.print("*");
		   }
		   System.out.println( );
	   }
   }
   public static void pattern2()
   {
	   for(int rows=0;rows<4;rows++)
	   {
		   for(int col=0;col<4;col++)
		   {
			   if(rows==0||rows==3||col==0||col==3)
			   {
				   System.out.print("x ");
				   
			   }
			   else
			   {
				   System.out.print("  ");
			   }
		   }
		   System.out.println();
	   }
   }
}
