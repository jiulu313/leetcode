package com.zhj.leetcode.array;


/**
 * 一个整数数组，将它里面的奇数排前，偶数排后
 */
public class OddNumber {
	public static void main(String[] args) {
		int[] data = new int[]{1,2,3,4,5,6,7,8,9};
		sort(data);
		
		for(int i =0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
	}
	
	public static void sort(int[] data) {
		int pos = 0;
		for(int i = 0 ;i < data.length;i++){
			if(data[i]%2 != 0){
				int temp = data[pos];
				data[pos] = data[i];
				data[i] = temp;
				pos++;
			}
		}
	}
	
	
	
}
