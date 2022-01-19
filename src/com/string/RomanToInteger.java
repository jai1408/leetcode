package com.basic.adv.strings;

public class RomanToInteger {
	enum Roman {
		I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

		private final int i;

		Roman(int i){
			this.i=i;
		}

		public int get(){
			return i;
		}
	}
	
	public int convert(String str) {
		int sum = 0;
		char ch[] = str.toCharArray();
		for (char c : ch) {
			sum = sum + Roman.valueOf(String.valueOf(c)).get();
		}
		return sum;
	}

	public static void main(String[] args) {
		RomanToInteger sol = new RomanToInteger();
		String str = "IX";
		System.out.println(sol.convert(str));
	}

}
