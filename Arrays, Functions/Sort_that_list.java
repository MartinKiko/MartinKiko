import java.util.*;

public class Sort_that_list
{
    public static void main(String[] args)
    {
        Random generator = new Random();

        int[] list = new int[11];
        for(int i=0; i<list.length; i++)
        {
            list[i] = generator.nextInt(10);
        }

        System.out.println("Original Random array: ");
        printArray(list);

        bubbleSort(list);

        System.out.println("\nAfter bubble sort: ");
        printArray(list);
    }

    public static void bubbleSort(int[] list)
    {
        for(int i=0; i<list.length; i++)
        {
            for(int j=i + 1; j<list.length; j++)
            {
                if(list[i] > list[j])
                {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }

        }
    }

    public static void printArray(int[] list)
    {
        for(int i=0; i<list.length; i++)
        {
            System.out.print(list[i] + ", ");
        }
    }
}

/*
//------------------------------------------------------------------

import java.util.Arrays;

public class Sort_that_list {

    public static void main(String[] args) {

        int[] arr={34, 12, 24, 9, 5};
        int n=arr.length;

        for(int k=0;k<n-1;k++){
            for(int i=0;i<n-k-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }

        System.out.println("Sorted array" +Arrays.toString(arr));



    }

}

 */