package practiceCode;
class Pol {
    static int Multi(int a, int b){
        return a*b;
    }
    static Double Multi(Double a, Double b) {
        return a*b;
    }
}
public class PolymorphismTest1 {
    public static void main(String[] args) {
        System.out.println(Pol.Multi(2, 4));
        System.out.println(Pol.Multi(2.5, null));
    }
}
