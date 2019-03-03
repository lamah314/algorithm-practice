package algorithms.medium;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

//Given an array of integers, find and print the maximum number of integers you can select from the array such that the absolute difference between any two of the chosen integers is less than or equal to . For example, if your array is a = [1,1,2,2,4,4,5,5,5], you can create two subarrays meeting the criterion: [1,1,2,2] and [4,4,5,5,5]. The maximum length subarray has 5 elements.

public class PickingAdjacentNumbers {

	public static int pickingNumbers(List<Integer> a) {
		Collections.sort(a);
		List<Integer> currentSolutionList = new ArrayList<Integer>();
		int solution = 0;

		int lastNum = a.get(0);
		currentSolutionList.add(a.get(0));

		for (int i = 1; i < a.size(); i++) {

			if (a.get(i) == lastNum) {
				currentSolutionList.add(a.get(i));
			} else if ((a.get(i) - lastNum) <= 1) {
				currentSolutionList.add(a.get(i));
			} else {
				
				if (solution < currentSolutionList.size()) {
					solution = currentSolutionList.size();
				}
				currentSolutionList = new ArrayList<Integer>();
				currentSolutionList.add(a.get(i));
				lastNum = a.get(i);
			}

		}
		
		if (solution < currentSolutionList.size()) {
			solution = currentSolutionList.size();
		}

		return solution;
	}
}
