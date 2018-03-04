class Test
{
    public static void main(String[] args)
    {
        testSum();


	testMul();

	testDiv();

	testMinus();
    
    }

    private static void testMinus()
    {
        int a = 6;
        int b = 6;
        int expected = 0;
        BasicMath bm = new BasicMath();
        int result = bm.minus(a, b);
        if (result == expected)
        {
            System.out.println("Minus: OK");
        }
        else
        {
            System.out.println("Minus: Failed, expected = " + expected + ", result = " + result);
        }

    }

    private static void testDiv()
    {
        int a = 60;
        int b = 6;
        int expected = 10;
        BasicMath bm = new BasicMath();
        int result = bm.div(a, b);
        if (result == expected)
        {
            System.out.println("Div: OK");
        }
        else
        {
            System.out.println("Div: Failed, expected = " + expected + ", result = " + result);
        }

    }

    private static void testMul()
    {
        int a = 5;
        int b = 6;
        int expected = 30;
        BasicMath bm = new BasicMath();
        int result = bm.mul(a, b);
        if (result == expected)
        {
            System.out.println("Mul: OK");
        }
        else
        {
            System.out.println("Mul: Failed, expected = " + expected + ", result = " + result);
        }
    }	

    private static void testSum()
    {
        int a = 5;
        int b = 6;
        int expected = 11;
        BasicMath bm = new BasicMath();
        int result = bm.sum(a, b);
        if (result == expected)
        {
            System.out.println("Sum: OK");
        }
        else
        {
            System.out.println("Sum: Failed, expected = " + expected + ", result = " + result);
        }
    }
}
