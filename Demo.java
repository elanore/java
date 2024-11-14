class Computer {
    // void specify no return
    public void playMusic() {
        System.out.println("Music is playing ");

    }

    public String getMeaPen(int cost) {
        if (cost >= 10)
            return "Pen";
        else
            return "nothing";

        // System.out.println("Pen");
    }
}

// class Calculator {
// int a;

// can be called from anywhere -public
// add is method
// public int add(int n1, int n2) {
// int r = n1 + n2;
// System.out.println("in add");
// return r;
// }
// }

public class Demo {
    public static void main(String a[]) {
        // int num1 = 4;
        // int num2 = 3;
        // class name variable name = new key word
        // Calculator calc = new Calculator();
        // int result = calc.add(num1, num2);
        // System.out.println(result);
        // obj reference variable
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeaPen(12);
        System.out.println(str);

    }

}
