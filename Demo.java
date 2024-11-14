class Calculator {
    int a;

    // can be called from anywhere -public
    // return value type
    public int add(int n1, int n2) {
        int r = n1 + n2;
        // System.out.println("in add");
        return r;
    }
}

public class Demo {
    public static void main(String a[]) {
        int num1 = 4;
        int num2 = 3;
        // class name variable name = new key word
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);

    }

}
