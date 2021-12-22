package Searching;

import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {

        int[] nums = {23,14,15,25,63,85,22,96};
        int target = 14;

        int ans = linearSearch(nums , target);

        System.out.println(ans);

    }

    //So basically in linear search we return the index if item found
    //or return -1 if element not found.
    //best case time complexity is O(1) i.e constant
    //worst case time complexity is O(n)

    static int linearSearch(int[] arr, int target ){

        if (arr.length==0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {

            int element = arr[index];
            if (element==target){
                return index;
            }
        }
        return -1;

    }
}
