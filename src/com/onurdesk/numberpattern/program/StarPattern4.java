package com.onurdesk.numberpattern.program;
class StarPattern4
{

    public static void main(String arg[])
    {

        int num = 12;
        int f = 2;
        int g = num - 1;

        for (int i = 1; i <= (num / 2); i++)
        {

            for (int j = 1; j <= num; j++)
            {

                if (j >= f && j <= g)
                {

                    System.out.print(" ");

                }
                else
                {

                    System.out.print("*");

                }
            }

            f = f + 1;
            g = g - 1;

            System.out.println();
        }
    } 
}
