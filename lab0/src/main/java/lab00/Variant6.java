package lab00;

public class Variant6 {

    /**
     *
     * @param a num
     * @param b num
     * @param c are sides of rectangular parallelepiped. Find it's V volume and S surface area
     * @return volume and surface area
     */
    public int[] inputOutputTask(int a, int b, int c) {
        int v = a * b * c;
        int s = 2 * (a * b + b * c + a * c);

        return new int[]{v, s};
    }

    /**
     *
     * @param number integer number
     * @return it's tens and ones
     */

    public int[] integerNumbersTask(int number) {
        int tens = 0;
        int ones = 0;
        if (number >= 10 && number <= 99) {
            tens = number / 10;
            ones = number % 10;
        }
        return new int[]{tens, ones};
    }

    /**
     * @param a num
     * @param b num
     * @param c num
     * @return true or false if a < b < c
     */
    public boolean booleanTask(int a, int b, int c) {
        return (a < b && b < c);
    }


    /**
     *
     * @param param1 number
     * @param param2 are two integer numbers
     * @return the biggest one
     */
    public int ifTask(int param1, int param2) {
        if (param1 > param2){
            return param1;
        }
        return param2;
    }


    /**
     *
     * @param unitNumber 1-5
     * @param lengthInUnits number
     * @return unit number in metres
     */
    public static double switchTask(int unitNumber, double lengthInUnits) {

        switch (unitNumber) {
            case 1: // dz
                return lengthInUnits / 10.0;
            case 2: // km
                return lengthInUnits * 1000.0;
            case 3: // m
                return lengthInUnits;
            case 4: // mm
                return lengthInUnits / 1000.0;
            case 5: // Sm
                return lengthInUnits / 100.0;
            default:
                throw new IllegalArgumentException("The value of unit number should be in range 1 - 5");
        }
    }


    /**
     *
     * @param pricePerKg is integer number the price of 1 kg
     * @return the price of 1.2, 1.4, ... , 2 kg of sweets.
     */
    public double[] forTask(int pricePerKg) {
        double[] result = new double [5];
        int index = 0;
        for (double weight = 1.2; weight <= 2.0; weight += 0.2) {
            result[index++] = pricePerKg * weight;

        }
        return result;
    }

    /**
     *
     * @param n number
     * @return n!!
     */
    public double whileTask(int n) {
        if (n <= 0) {
            return 0.0;
        }

        double result = 1.0;

        for (int i = n; i >= 1; i -= 2) {
            result *= i;
        }

        return result;
    }


    /**
     *
     * @param n >2
     * @param a number
     * @param b number
     * @return an integer array of size N, the first element of which is equal to A,
     * the second element is equal to B, and each subsequent
     * element is equal to the sum of all previous elements.
     */

    public static int[] arrayTask(int n, int a, int b) {
        if (n <= 2) {
            return null;
        }

        int[] array = new int[n];
        array[0] = a;
        array[1] = b;

        for (int i = 2; i < n; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += array[j];
            }
            array[i] = sum;
        }

        return array;
    }

    /**
     *
     * @param m number
     * @param n number
     * @param q multiplier
     * @param initialArray array of numbers
     * @return  matrix of size m X n, where the first row is the same as the initial
     * set of numbers, and the elements of each next row are equal to the
     * corresponding element of the previous row multiplied by Q
     */
    public int[][]  twoDimensionArrayTask(int m, int n, int q, int[] initialArray) {
        if (m <= 0 || n <= 0) {
            return null;
        }

        int[][] matrix = new int[m][n];

        for (int i = 0; i < n; i++) {
            matrix[0][i] = initialArray[i];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = matrix[i - 1][j] * q;
            }
        }

        return matrix;
    }

    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");



    }

}