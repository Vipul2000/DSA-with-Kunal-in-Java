package Searching;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {

        int[] nums = {5,7,9,10,15,25};
        int target = 9;

        int ans = binarySearch(nums, 6, target);

        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int n, int target){

        int start = 0;
        int end = arr.length-1;

        int mid = (start+end)/2;

        while (start<=end){

            if (arr[mid]==target){
                return mid;
            }

            if (target>arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }
}
