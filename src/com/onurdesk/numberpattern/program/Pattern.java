package com.onurdesk.numberpattern.program;

import java.util.Scanner;

class Pattern
{
	/**
	 * @author Onurdesk
	 *
	 *         Thanks for visiting https://onurdesk.com like us on facebook :
	 *         https://facebook.com/onurdesk
	 */
    public static void main(String args[])
    {
        int n, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++)
        {
            for (j = i; j <= n; j++)
            {
                if (i % 2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
		System.out.println("Thanks for visiting https://onurdesk.com");

    }
}