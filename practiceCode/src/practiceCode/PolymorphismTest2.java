package practiceCode;

class P{
	public void print() {
		System.out.println("pring pol");
	}
}

public class PolymorphismTest2 extends P {
public static void main(String[] args) {
	PolymorphismTest2 a=new PolymorphismTest2();
	P aa=new P();
	aa.print();
	a.print();
	
}
	@Override
	public void print() {
		System.out.println("print Pol test2");
	}
}

