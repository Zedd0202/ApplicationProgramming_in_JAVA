package ex2;

public class Test {
	public static void main(String[] args) {
		A var1 = new A();
		A var2 = new B();
		B var3 =  new D();
		C var4 =  new C();
		D var5 =  new D();
		Object var6 =  new B();
		//red error : 컴파일에러
		//실행중 error : 런타임에
		var1.method1();//A1
		System.out.println();
		var2.method1();//B1,A1
		System.out.println();

		var3.method1();//B1,A1
		System.out.println();

		var4.method1();//B1,A1
		System.out.println();

		var5.method1();//B1,A1
		System.out.println();

		System.out.print("==============");
		
		
		//var6.method1();//컴파일에
		System.out.println();
		var1.method2();
		System.out.println();
		var2.method2();
		System.out.println();
		var3.method2();
		System.out.println();
		var4.method2();
		System.out.println();
		var5.method2();
		System.out.println();
		//var6.method2();
		System.out.println();
		
		//var3.method3();
		System.out.println();
		var5.method3();
		System.out.println();
		((B)var1 ).method1();
		((C)var2 ).method2();
		((D)var5 ).method1();
		((C)var3 ).method3();
		((D)var4 ).method3();
		((C)var6 ).method3();




		
	}
}
