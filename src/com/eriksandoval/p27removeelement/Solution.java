/*
 * 27. Remove Element
 * Given an integer array 'nums' and and integer 'val', remove all occurences of 'val' in 'nums' and
 * return the number of elements that are not equal to 'val', which is the length of the new array, since the 
 * removal will be 'in-place' (no extra space will be allocated for another array).
 */

package com.eriksandoval.p27removeelement;

public class Solution {

    public int removeElement(int[] nums, int val) {
        // We will return the "length" of the array by making use of a pointer to keep track of the index
        // of the array that we will be modifying. The way that we will modify the array is by inserting 
        // the elements that are not equal to 'val' into the array at the index of the pointer, and then
        // incrementing the pointer to move forward to the next index of the array. The final position of the
        // pointer will be the "length" of the array, since the pointer will have moved forward to the next
        // index of the array after the last element that is not equal to 'val' has been inserted into the array.
        
        // Create variable to keep track of the index of the array. 
        int pointer = 0;

        // Loop through the array. 
        for (int i = 0; i < nums.length; i++) {
            // If the element is not equal to 'val'.
            if (nums[i] != val) {
                // Insert the element into the array at the index of the pointer.
                nums[pointer] = nums[i];
                // Increment the pointer to move forward to the next index of the array.
                pointer++;
            }
        }
        // Return the "length" of the array.
        return pointer;
    

    }
    
}
