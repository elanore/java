class Hello {

    public static void main(String args[]) {
        int num1 = 3;
        int num2 = 4;
        byte val1 = 127;
        short val2 = 550;
        long val3 = 5341l;
        boolean a = true;
        char val4 = 'b';
        val4++;
        double marks = 6.5;// by default double
        float mark2 = 5.2f;// float specify with f
        int sum = num1 + num2;
        System.out.println(sum);
        System.out.println("Hello Shiny");
        // literals
        // base 2 number- binary
        int num = 0b101;
        // hexa decimal
        int num3 = 0x7E;
        // for easy reading you can add underscore to numbers in java
        int num4 = 10_00_00_00;
        // exponenetial
        double num5 = 12e10;
        System.out.println(val4);

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
        System.out.println(k);
        System.out.println(result);

    }

}
