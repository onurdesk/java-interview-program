package com.onurdesk.arraymatrix.programs;
import java.util.*;
class PassingArraystoFunction 
{
    public static void main(String[] args) 
    {
        int[] a;
        int size;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array");
        size = sc.nextInt();
        
        a = new int[size];
        
        System.out.println("Enter elements in the array");
        for(int i = 0 ;i < size; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("The Elements of the array are : ");
        for(int i = 0 ;i < size; i++)
        {
            System.out.print(a[i] + " ");
        }

        //Passing array to the function
        addElements(a, size);
    }
    
    public static void addElements(int[] a , int size)
    {
        int sum = 0;
        
        for(int i = 0; i < size; i++)
        {
            sum += a[i];
        }

        System.out.println("\nSum of the elements of arrays is : "+sum);
    }
}