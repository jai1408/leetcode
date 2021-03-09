package com.common_problems;

public class ReverseInteger {

	public static int reverse(int x) {
		int rev = 0;
		int prev_rev = 0;
		boolean negativeFlag = false;
		if (x < 0) {
			negativeFlag = true;
			x = -x;
		}
		while (x > 0) {
			int rem = x % 10;
			rev = rev * 10 + rem;
			if ((rev - rem) / 10 != prev_rev)
				return 0;
			prev_rev = rev;
			x = x / 10;
		}
		return negativeFlag ? -rev : rev;
	}

	public static void main(String[] args) {
		System.out.println(reverse(176666468));

	}

}
