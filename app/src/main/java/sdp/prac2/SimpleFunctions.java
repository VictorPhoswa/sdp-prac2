package sdp.prac2;

import java.util.*;

public class SimpleFunctions {

	public static int Task1(List<Integer> a, List<Integer> b) {
		int total = 0;  // Initialize total to 0
		for (int i = 0; i < b.size(); i++) {  // Loop through each index i in b
			int index = b.get(i);  // Get the index at position i from b
			if (index < a.size()) {  // Check if index is within range of a
				total += a.get(index);  // Add the element at index in a to total
			}
		}
		return total;  // Return the final total
	}//TASK 1
	

    public static boolean Task5 (List<Integer>lst){ //assuming the list is of integers
		boolean descendingOrder = true; //boolean flag
		for (int i=0; i<lst.size()-1; i++){ //check descending order
			if (lst.get(i)<lst.get(i+1)){
				descendingOrder = false;
			}
		}
		boolean ascendingOrder = true;
		for (int i=0; i<lst.size()-1; i++){ //check descending order
			if (lst.get(i)>lst.get(i+1)){
				ascendingOrder = false;
			}
		}
		if (ascendingOrder == true || descendingOrder == true){ //if either ascending or descending order is true then return true
			return true;
		}
		else{
			return false;
		}
    }//Task5 method for sorting a list of integers
	public static List<String> task2 (List<String> lst){
		List<String> out = new ArrayList<String>(); //Create an empty list of type string named out
		for (String i : lst){ //Loop through the list given
			if (i.length() > 1){ //If the list is greater than length of 1
				out.add(i.substring(1)); //Append the list out with that value missing its first entry
			} //Otherwise dont add it hence satisfying second condition
		}
		return out; //Return list of strings missing its first character
	}//Task2 method for removing the first character in a list.
    public SimpleFunctions() {}
}
