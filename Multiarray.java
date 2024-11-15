public class Multiarray {
    public static void main(String a[]) {

        System.out.println("hello world");

        // array of array - multi dimension array int nums[][] = new [3][4] - shows 3
        // array with four elements

        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        // jagged arrays - no need to specify number of columns in multi array
        /*
         * draw backs of array
         * need to be homogenous
         */
/**
 * array of objects 
 * by default the value of integer array will be 0.
 * exceptions are run time error
 * num.length - array length
 * 
 */
    }

}
