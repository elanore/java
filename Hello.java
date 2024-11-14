import javax.lang.model.util.ElementScanner14;

class Hello {

    public static void main(String args[]) {
        int num1 = 3;
        int num2 = 4;
        byte val1 = 127;
        short val2 = 550;
        long val3 = 5341l;
        // boolean a = true;
        char val4 = 'b';
        val4++;
        double marks = 6.5;// by default double
        float mark2 = 5.2f;// float specify with f
        int sum = num1 + num2;
        // System.out.println(sum);
        // System.out.println("Hello Shiny");
        // literals
        // base 2 number- binary
        int num = 0b101;
        // hexa decimal
        int num3 = 0x7E;
        // for easy reading you can add underscore to numbers in java
        int num4 = 10_00_00_00;
        // exponenetial
        double num5 = 12e10;
        // System.out.println(val4);

        // we cant assign value of int to a byte , since int has a large value .
        // but we can convert the integer to byte using (byte)a; - casting
        // incase of trying to stored float f to int , convert float value to integer by
        // using int x = (int)f
        // byte b = 125;
        // does a modulous operation on the variable when int value is higher than 256
        // and print the rmeinder as output
        int p = 257;
        byte k = (byte) p;
        float f = 5.6f;
        // when you try to store byte value 12 to integer varaible is called conversion
        // casting () explicit conversion
        int t = (int) f;

        byte h = 10;
        byte i = 20;
        // type promotion since the output of the operation in greater than 257;
        int result = h * i;
        // System.out.println(k);
        // System.out.println(result);

        // arithmetic operations

        int no1 = 7;
        // int no2 = 5;
        // int output = no1 / no2;
        // no1 = no1+ 2;
        no1 += 1; // no1++;
        // num++ and ++num operation after the variable and before the variable-
        // post increment num ++ value is assigned before increment and preincrement
        // ++num - incremented value assinged
        // System.out.println(no1);

        // relational operator
        // > < ,== ,!=

        double abc = 6.6;
        double xyz = 5.8;
        boolean result1 = abc >= xyz;
        // System.out.println(result1);

        // logical operator
        // AND & OR | NOT !
        // AND && both true - true, both false false , true false false , false true
        // false
        // OR || true true true , true false true, false true true , false false false
        // NOT ! true - false , false true
        // XOR
        // int x = 7;
        // int y = 5;
        // int a = 5;
        // int b = 9;

        // boolean results = a>b;
        // System.out.println(!results);

        // conditional statements

        // int x = 21;
        // if multiple stmts in if condition use {} brackets
        // if (x > 10 && x < 20)
        // System.out.println("Hello world");
        // else
        // System.out.println("Hello Shiny");

        // int x = 10;
        // int y = 17;
        // int z = 9;

        // if (x > y && x > z){
        // System.out.println(x);

        // }
        // else if (y>z){
        // System.out.println(y);

        // }else
        // System.out.println(z);
        // ternary operator
        // int a = 5;
        // int results = 0;
        // results = a % 2 == 0 ? 10 : 20;
        // System.out.println(results);

        // switch statement:
        int n = 2;
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }

}
