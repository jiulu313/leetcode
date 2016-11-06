package com.zhj.leetcode.array;

import com.sun.java.swing.plaf.windows.WindowsBorders.DashedBorder;
import com.sun.org.apache.regexp.internal.recompile;

/**
 * #414 第三个最大值
 *
 */
public class ThirdMaxNumber {
	public static void main(String[] args) {
		int[] data = new int[]{3,2,1,5,6,7,8};
		System.out.println(thirdMaxNum(data));
		
	}

	private static int thirdMaxNum(int[] data) {
		if (data.length == 1) {
			return data[0];
		}

		if (data.length == 2) {
			return data[0] > data[1] ? data[0] : data[1];
		}

		int pos = 0;
		for (int i = 0; i < 3; i++) {
			pos = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[j] > data[pos]) {
					pos = j;
				}
			}
			
			int temp = data[i];
			data[i] = data[pos];
			data[pos] = temp;
		}

		return data[pos];
	}

}
