class Test
{
    public static void main(String[] args)
    {
        testSum();
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
