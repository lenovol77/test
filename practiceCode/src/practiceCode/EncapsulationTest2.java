package practiceCode;

public class EncapsulationTest2 {
public static void main(String[] args) {
	EncapsulationTest test=new EncapsulationTest();
	test.setAge(20);
	test.setName("siva");
	test.setAge(21);
	test.setName("raj");
	
	System.out.println("your name is "+test.getName()+ " and your age is "+test.getAge());
}
}
