package test.test1;

import java.util.*;

class Solution
{
	 ArrayList<String> list = new ArrayList<String>();
	
	public static void main (String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.paliPerm("","Taco cat"));
	}

	private boolean paliPerm(String remaining, String str) {
		if(str.isEmpty()) {
			list.add(remaining);
			System.out.println(remaining + str);
		}
		for(int i =0; i< str.length(); i++) {				
				paliPerm(remaining + str.charAt(i), str.substring(0, i) 
						+ str.substring(i + 1, str.length()));				
				
		}
		
		for(int j =0; j< list.size(); j++) {
			if(list.get(j).toLowerCase().trim().contains(("atco cta").trim()))
				return true;
				
		}
		return false;
		
	}
}

