/*
 * 26. Remove Duplicates from Sorted Array
 * Given a sorted array 'nums', remove the duplicates in-place such that each 
 * element appears only once and returns the new length. Do not allocate extra
 * space for another array.
 * 
 * This will be accomplished by making use of a pointer to keep track of the
 * index. The index will be the "length" of the array, since the pointer will
 * have moved forward to the next index of the array after the last element that
 * is not equal to the element at the current index has been inserted into the
 * array at the index of the pointer. This will intuitevely remove the duplicates
 * and return the new length of the array at the same time. 
 */

package com.eriksandoval.p26removeduplicatesfromsortedarray;

public class Solution {

    public int removeDuplicates(int[] nums) {
        // Create variable to keep track of the index (a pointer). Begins at position 1.
        int pointer = 1;
        
        // Iterate through the array, starting at position 1.
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[pointer] = nums[i];
                System.out.println(nums.toString());
                pointer++;
            }
        }
        return pointer;

    }
    
}
