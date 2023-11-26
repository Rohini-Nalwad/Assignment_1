package com.algorithms;
//8-Unique Subsets
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueSubsets {
	
	 public static List<List<Integer>> findUniqueSubsets(int[] nums) {
	        Arrays.sort(nums); 
	        Set<List<Integer>> uniqueSubsets = new HashSet<>();
	        List<Integer> currentSubset = new ArrayList<>();

	        generateSubsets(nums, 0, currentSubset, uniqueSubsets);

	        return new ArrayList<>(uniqueSubsets);
	    }

	     static void generateSubsets(int[] nums, int index, List<Integer> currentSubset, Set<List<Integer>> uniqueSubsets) {
	        uniqueSubsets.add(new ArrayList<>(currentSubset));

	        for (int i = index; i < nums.length; i++) {
	            if (i > index && nums[i] == nums[i - 1]) {
	                continue;
	            }

	            currentSubset.add(nums[i]);
	            generateSubsets(nums, i + 1, currentSubset, uniqueSubsets);
	            currentSubset.remove(currentSubset.size() - 1);
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 2};
	        List<List<Integer>> subsets = findUniqueSubsets(arr);

	        System.out.println("Unique Subsets:");
	        for (List<Integer> subset : subsets) {
	            System.out.println(subset);
	        }
	    }

	}

	    
    