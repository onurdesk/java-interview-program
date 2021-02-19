package com.onurdesk.numberpattern.program;
class NumberPat7
{
/**
	 * @author Onurdesk
	 *
	 *         Thanks for visiting https://onurdesk.com like us on facebook :
	 *         https://facebook.com/onurdesk
	 */

    public static void main(String arg[])
    {

        int t = 1;
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (t == 10) {
                    t = 0;
               }
                System.out.print(t++);
            }
            System.out.println();
        }
		System.out.println("Thanks for visiting https://onurdesk.com");

    }
}