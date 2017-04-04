package ex2;

public class A{
	public void method1()
	{
		System.out.println("A1");
	}
	public void method2()
	{
		method1();
		System.out.println("A2");
	}
}