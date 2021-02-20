package com.onurdesk.arraymatrix.programs;
import java.util.*;

class ArrayBasic
{
    public static void main(String[] args)
    {
        int[] arr;
        int size, i;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        size = sc.nextInt();

        arr = new int[size];

        System.out.println("\nEnter array elements");
        for (i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nElements in the Array are : ");
        for (i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}