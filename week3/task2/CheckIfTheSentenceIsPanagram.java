package week3.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*	LEET CODE SOLUTION.
 * class Solution {
    public boolean checkIfPangram(String sentence) {
        	int[] valid = new int[26];
		for (int i = 0; i < sentence.length(); i++) {
			valid[sentence.charAt(i) - 97]++;
		}
		for (int i = 0; i < 26; i++)
			if (valid[i] == 0)
				return false;

		return true;
    }
}
 * 
 * 
 * */
public class CheckIfTheSentenceIsPanagram {

	public static boolean checkIfPangram(String sentence) {
		int[] valid = new int[26];
		for (int i = 0; i < sentence.length(); i++) {
			valid[sentence.charAt(i) - 97]++;
		}
		for (int i = 0; i < 26; i++)
			if (valid[i] == 0)
				return false;

		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkIfPangram("abcdefghijklmnopqrstuvwxyz"));
	}
}
