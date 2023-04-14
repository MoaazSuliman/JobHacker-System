package week3.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 	LEET CODE SOLUTION.
class Solution {
    public String longestCommonPrefix(String[] strings) {
				String base = strings[0];
		int arrLen = strings.length;
		String result = "";
		int counter;
		boolean flag = true;
		for (int i = 0; i < base.length() && flag; i++) {
			counter = 0;
			for (int j = 1; j < arrLen; j++) {
				int len = strings[j].length();
				if (i < len) {
					if (base.charAt(i) == strings[j].charAt(i))
						counter++;
					else {
						flag = false;
					}

				}
			}
			if (counter == arrLen - 1)
				result += base.charAt(i);
		}
		return result;
    }
}*/
public class LargestCommonPrefix {
	static FastReader input = new FastReader();

	public static String longestCommonPrefix(String[] strings) {
		String base = strings[0];
		int arrLen = strings.length;
		String result = "";
		int counter;
		boolean flag = true;
		for (int i = 0; i < base.length() && flag; i++) {
			counter = 0;
			for (int j = 1; j < arrLen; j++) {
				int len = strings[j].length();
				if (i < len) {
					if (base.charAt(i) == strings[j].charAt(i))
						counter++;
					else {
						flag = false;
					}

				}
			}
			if (counter == arrLen - 1)
				result += base.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
		String[] strings = new String[2];
		for (int i = 0; i < 2; i++) {
			strings[i] = input.next();
		}
		System.out.println("result== " + longestCommonPrefix(strings));

	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine().trim();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}

}
