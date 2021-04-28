package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    int n = 2147483647;
	    Solution s = new Solution();
	    System.out.println(s.convertToTitle(n));
    }
}

class Solution {
    public String convertToTitle(int columnNumber) {
        String title = new String();
        ArrayList<Integer> t = new ArrayList<>();
        while(columnNumber>0)
        {
            t.add((65+((columnNumber-1) % 26)));
            columnNumber = (columnNumber-1)/26;
        }
        for(int i = t.size()-1;i>-1;i--)
        {
            title += (char)(t.get(i).intValue());
        }
        return title;
    }
}
