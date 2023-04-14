package week3.task2;

public class ValidParentheses {
	/* THIS IS THE SOLUTION IN LEET CODE BUT WITHOUT PUBLIC STATIC VOID MAIN */
	public static boolean checkValidString(String string) {
		StringBuilder s = new StringBuilder("");
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '(' || string.charAt(i) == '[' || string.charAt(i) == '{') {
				s.append(string.charAt(i));
			} else {
				if (s.length() == 0)
					return false;
				char lastChar = s.charAt(s.length() - 1);
				if (isPair(lastChar, string.charAt(i))) {
					s.deleteCharAt(s.length() - 1);
				} else
					return false;
			}
		}
		if (s.length() == 0)
			return true;
		return false;
	}

	public static boolean isPair(char a, char b) {
		if (a == '(' && b == ')')
			return true;
		else if (a == '{' && b == '}')
			return true;
		else if (a == '[' && b == ']')
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(checkValidString("(){}}{"));
	}

}
