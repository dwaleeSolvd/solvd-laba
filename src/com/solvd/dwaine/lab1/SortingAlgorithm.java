package com.solvd.dwaine.lab1;
public class SortingAlgorithm {
    void sort(int startingArray[])
    {
        for (int i = 0; i < startingArray.length-1; i++)
        {
            int minimumindex = i;
            for (int j = i+1; j < startingArray.length; j++)
                if (startingArray[j] < startingArray[minimumindex])
                    minimumindex = j;

            int temp = startingArray[minimumindex];
            startingArray[minimumindex] = startingArray[i];
            startingArray[i] = temp;
        }
    }

    void organizeGroup(int EndingArray[])
    {
        int n = EndingArray.length;
        for (int i=0; i<n; ++i)
            System.out.print(EndingArray[i]+" ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int unsortedGroup[] = {26,20,99,22,1};
        SortingAlgorithm sortingObject = new SortingAlgorithm();
        sortingObject.sort(unsortedGroup);
        System.out.println("Sorted array: ");
        sortingObject.organizeGroup(unsortedGroup);
        ;
    }
}

