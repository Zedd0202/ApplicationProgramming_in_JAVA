package ex2;

public class C extends B{
	public void method2(){
		System.out.println("C2");
	}
	public void method3()
	{
		super.method1();
		System.out.println("C3");
	}
}
