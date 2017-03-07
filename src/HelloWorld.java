import java.util.Scanner;
import java.util.Random;

public class HelloWorld {

	
	public static void main(String[] args) {
		
		//첫번째 실습.
//		int n = 454467;
//		System.out.print(n+"\n");
//		System.out.printf("n = %d%n", n);
//		System.out.format("%d%n", n);
//		System.out.println("n ="+n);
//		double a = 3.14529;
//		System.out.format("%f%n", a);
//		System.out.format("%,d%n", n);
//		System.out.format("%01d%n", n);
//		System.out.format("%+,d%n", n);
//		System.out.format("%10.3f%n", a);
//		n=1;
//		n=2;
//		n=3;
//		Scanner input = new Scanner(System.in);
//		int q = input.nextInt();
//		input.nextLine();
//		String p =input.nextLine();
//		System.out.printf("%d %s", q, p);
//		String a=null;
//		System.out.println(a);
		
		
		//두번째 실습.
//		int a=1;
//		int b=1;
//		a+=b;
//		
//		
//		System.out.println(a);
//		a=1;
//		b=1;
//		a=+b;//b=a no Add.
//		System.out.println(a);
		
		
		
//		int a=1;
//		int b=1;
//		b= a++;
//		System.out.println(b);
//		a=1;
//		b=1;
//		b= ++a;
//		System.out.println(b);
		
//		String[] namelist = {"kim","lee","park"};
//		for(String name:namelist)
//		{
//			System.out.print(name);
//			System.out.print(",");
//		}
//		for(int i=0;i<namelist.length;i++)
//		{
//			System.out.println(namelist[i]);
//		}
	  Scanner input = new Scanner(System.in);
	  Random randomGenerator =  new Random();
	  while(true)
	  {
	  int a= randomGenerator.nextInt(10);//not include 100.
	  int b = randomGenerator.nextInt(10);
	  System.out.println("How much is "+ a + " times "+ b + " ? ");
	  System.out.print("Enter your answer (-1 to exit): ");
	  int q = input.nextInt();
	  if(q==a*b)
	  {
		  System.out.println("Nice work!");
		  continue;
	  }
	  if(q==-1)
		  break;
	  else if((q!=a*b) && (q!=-1))
	  {
		  while(true)
		  {
		    System.out.println("No. Keep trying.!");
		    System.out.print("Enter your answer (-1 to exit): ");
		    int p = input.nextInt();
		    if(p==a*b)
		    {
		    	System.out.println("Nice work!");
		    	break;
		    	
		    }
		  }
		  
	  }

	  }
	  
	
		
		
	
	}

}
