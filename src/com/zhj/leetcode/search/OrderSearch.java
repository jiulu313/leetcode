package com.zhj.leetcode.search;


/**
 * 1 顺序查找
 * 第0元素是我们自己定义的，假如不是待查找的数
 */
public class OrderSearch {
	public static void main(String[] args) {
		int[] data = new int[]{0,34,5,17,1,23,56,79,45,98,76,33};
		int value = 23;
		
		System.out.println(search(data,value));
		System.out.println(search2(data, value));
	}

	// 顺序查找
	public static int search(int[] data, int value) {
		for (int i = 1; i < data.length; i++) {
			if(data[i] == value){
				return i;
			}
		}
		return 0;
	}
	
	//改进的有哨兵的顺序查找，省去了每次都要比较  i < data.length
	public static int search2(int[] data,int value){
		int i = data.length - 1;
		data[0] = value;
		while(data[i] != value){
			i--;
		}
		
		return i;
	}

}
