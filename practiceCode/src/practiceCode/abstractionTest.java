package practiceCode;
public class abstractionTest extends abstractionTest2  {
public static void main(String[] args) {
	abstractionTest a=new abstractionTest();
	System.out.println(a.rahul(3,4));
	abstractionTest aa=new abstractionTest();
	aa.complete();
}

@Override
public void complete() {
	
	System.out.println("hello");
}

@Override
	public int rahul( int a, int b) {
		System.out.println("rahul");
		return a*b;
	}
//	int to string  string to int
	int b=10;
	String c=Integer.toString(b);
	int cc=Integer.parseInt(c);
}

