package com.zhj.leetcode.array;

import com.sun.java.swing.plaf.windows.WindowsBorders.DashedBorder;

/**
 * 第三个最大值
 *
 */
public class ThirdMaxNumber {
	public static void main(String[] args) {
//		int[] data = new int[]{3,5,7,32,1,45,78,34,94,57,65};
		int[] data = new int[]{1,1,2,5,6,7};
		int third = thirdMaxNum(data);
		System.out.println("thirdMaxNum="+third);
	}
	
	
	private static int thirdMaxNum(int[] data) {
		int first  = data[0];
		int secode = data[0];
		int third  = data[0];
		
		for(int i = 1;i<data.length;i++){
			if(data[i] > first){
				secode = first;
				first = data[i];
			}else if(data[i] >= secode){
				third = secode;
				secode = data[i];
			}else if(data[i] >= third) {
				third = data[i];
			}
		}
		
		return secode == third ? first : third;
	}

}









