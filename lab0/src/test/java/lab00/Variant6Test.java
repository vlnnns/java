package lab00;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Variant6Test {

    @Test(dataProvider = "inputProvider")
    public void inputTest(int a, int b, int c, int[] expected) {
        int[] actual = new Variant6().inputOutputTask(a, b, c);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] inputProvider() {
        return new Object[][]{
                {2, 3, 4, new int[]{24, 52}},
                {5, 6, 7, new int[]{210, 214}},
                // Add more test cases as needed
        };
    }


////////////////////////////////////////////////

    @Test(dataProvider = "integerProvider")
    public void inputTest(int number, int[] expected) {
        int[] actual = new Variant6().integerNumbersTask(number);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][]{
                {23, new int[]{2, 3}},
                {12, new int[]{1, 2}},
                {34, new int[]{3, 4}},
        };
    }

    ////////////////////////////////////////////////


    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int a, int b, int c, boolean expected) {
        assertEquals(new Variant6().booleanTask(a, b, c), expected);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][]{{5, 6, 7, true}, {0, 7, 4, false}, {3, 8, 5, false}};
    }


    //////////////////////////////////////////////////

    @Test(dataProvider = "ifProvider")
    public void ifTest(int param1, int param2, int expected) {
        assertEquals(new Variant6().ifTask(param1, param2), expected);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][]{{2, 3, 3}, {0, 14, 14}, {18, -3, 18}};
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "switchProvider")
    public void switchTest(int unitNumber, double lengthINUnits, double expected) {
        Variant6 variant = new Variant6();
        assertEquals(variant.switchTask(unitNumber, lengthINUnits), expected);
    }

    @Test(dataProvider = "negativeSwitchProvider")
    public void negativeSwitchTest(int unitNumber, double lengthINUnits, double unexpected) {
        Variant6 variant = new Variant6();
        double result = variant.switchTask(unitNumber, lengthINUnits);
        assertNotEquals(result, unexpected, "Unexpected result for input: unitNumber=" + unitNumber + ", lengthINUnits=" + lengthINUnits);
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][]{{1, 27, 2.7}, {3, 6, 6}, {2, 27.6, 27600}};
    }

    @DataProvider
    public Object[][] negativeSwitchProvider() {
        return new Object[][]{{1, 27, 5.0}, {3, 6, 10.0}, {2, 27.6, 1000.0}};
    }

    ///////////////////////////////////////////////////

    @Test(dataProvider = "forProvider")
    public void forTest(int pricePerKg, double[] expected) {
        assertEquals(new Variant6().forTask(pricePerKg), expected);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][]{
                {5, new double[]{6.0, 7.0, 7.999999999999999, 9.0, 9.999999999999998}},
                {2, new double[]{2.4, 2.8, 3.1999999999999997, 3.5999999999999996, 3.9999999999999996}}
        };
    }

    ///////////////////////////////////////////////////


    @Test(dataProvider = "whileProvider")
    public void whileTest(int n, double expected) {
        assertEquals(new Variant6().whileTask(n), expected);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][]{{5, 15}, {12, 46080}, {7, 105}, {17, 34459425}};
    }


    //////////////////////////////////////////
    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int n, int a, int b, int[] expected) {
        new Variant6();
        assertEquals(Variant6.arrayTask(n, a, b), expected);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][]{
                {5, 1, 2, new int[]{1, 2, 3, 6, 12}},
                {6, 3, 1, new int[]{3, 1, 4, 8, 16, 32}},
        };
    }


    //////////////////////////////////////////

    @Test(dataProvider = "matrixProvider")
    public void twoDimensionArrayTest(int m, int n, int q, int[] initialArray, int[][] expected) {
        assertEquals(new Variant6().twoDimensionArrayTask(m, n, q, initialArray), expected);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        int[] init = {2, 3, 4};
        int[] init2 = {2, 6, 5, 1};
        return new Object[][]{
                {3, 3, 2, init, new int[][]{{2, 3, 4}, {4, 6, 8}, {8, 12, 16}}},
                {2, 4, 3, init2, new int[][]{{2, 6, 5, 1}, {6, 18, 15, 3}}},

        };
    }
}
