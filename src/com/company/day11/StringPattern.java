package com.company.day11;

public class StringPattern {
    public static void main(String[] args) {
        int nums[] ={1,2,3,4,5,6};
        System.out.println(patternString(nums));
    }

    public static boolean patternString(int nums[]) {
        for (int i = 0; i < nums.length - 2; i++) {
            System.out.println(nums.length - 2);
            {
                if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}


