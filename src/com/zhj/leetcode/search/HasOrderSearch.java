package com.zhj.leetcode.search;


/**
 * 2 有序表查找 线性表必须是已经排序的，通常从小到大
 *
 */
public class HasOrderSearch {
	public static void main(String[] args) {
		int[] data = new int[]{0,2,3,5,6,8,9,12,34,56,78,90};
//		int value =34;
		int value =35;
		System.out.println(binarySearch(data, value));
	}

	// 二分查找，data是已经从小到大排过序的
	public static int binarySearch(int[] data, int value) {
		int low = 1;
		int high = data.length - 1;
		int mid = 0;

		while (low <= high) {
			mid = (low + high) / 2;
			if (value > data[mid]) {
				low = mid + 1;
			} else if (value < data[mid]) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
//		System.out.println("low="+low+" high="+high);
		return 0;
	}
	
	// 插值法：对上面二分查找的改进，即对 mid = (low + high) / 2 ；这句的改进
	public static int binarySearch2(int[] data,int value){
		int low = 1;
		int high = data.length - 1;
		int mid;
		
		while(low <= high){
			//算法科学家算出来的，不知道为啥
			//就改了mid的算法，就变成了插值法查找 
			mid = low + (high - low)*(value - data[low]) / (data[high] - data[low]);
			
			if(value > data[mid]){
				low = mid + 1;
			}else if(value < data[mid]){
				high = mid - 1;
			}else{
				return mid;
			}
		}
		
		return 0;
	}

	//斐波那契查找 
	public static int fibonacciSearch(int[] data,int value) {
		
		
		return -1;
	}
	
	
}


















