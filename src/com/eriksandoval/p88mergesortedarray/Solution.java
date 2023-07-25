/*
 * 88. Merge Sorted Array
 * Merge two sorted (non-decreasing order) arrays into one sorted array. 
 * Author: Erik Sandoval
 * Date: 07/24/2023
 */



package com.eriksandoval.p88mergesortedarray;

public class Solution {

    public void merge(int[] nums1, int[] nums2, int m, int n) {
        // Merge method will take in two arrays (non-decreasing order) and merge them into
        // the first array. The length of the arrays may varry, as indicated by m and n.
        
        // Create a new array to store the merged arrays.
        int[] mergedArray = new int[m + n];

        // Create a variable to keep track of the index of the merged array.
        int mergedIndex = 0;

        // Create a variable to keep track of the index of the first array. 
        int nums1Index = 0;

        // Create a variable to keep track of the index of the second array. 
        int nums2Index = 0;

        // Loop through the arrays until one of them is empty, at which point we will
        // append the remaining elements of the other (non-empty) array to the merged array
        // in non-decreasing order.
        // While neither array is empty.
        while (nums1Index < m && nums2Index < n) { 
            // If the element in the first array is less than the element in the second array. 
            if (nums1[nums1Index] < nums2[nums2Index]) { 
                // Append the element in the first array to the merged array.
                mergedArray[mergedIndex] = nums1[nums1Index];
                // Increment the index of the first array to move forward to the next comparison. 
                nums1Index++;
            } else {
                // Otherwise, append the element in the second array to the merged array.
                mergedArray[mergedIndex] = nums2[nums2Index];
                // Increment the index of the first array to move forward to the next comparison. 
                nums2Index++;
            }
            // At the end of each while loop, increment the index of the merged array to move forward
            // to the next comparison, in tandem with the other two arrays.
            mergedIndex++;
        }
        // If the first array is empty, append the remaining elements of the second array to the merged array.
        while (nums1Index == m && nums2Index < n) {
            mergedArray[mergedIndex] = nums2[nums2Index];
            nums2Index++;
            mergedIndex++;
        }
        // If the second array is empty, append the remaining elements of the first array to the merged array.
        while (nums2Index == n && nums1Index < m) {
            mergedArray[mergedIndex] = nums1[nums1Index];
            nums1Index++;
            mergedIndex++;
        }
        // Copy the merged array to the first array even if they are of different lengths.
        System.arraycopy(mergedArray, 0, nums1, 0, mergedArray.length);
    }
}