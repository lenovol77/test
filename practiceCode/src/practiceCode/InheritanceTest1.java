package practiceCode;

public class InheritanceTest1 extends In {
public static void main(String[] args) {
	InheritanceTest1 a=new InheritanceTest1();
	a.in();
	In aa=new In();
	aa.in();
}}
 class In{
	 void in() {
		 System.out.println("in");
	 }
}
