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
		int high = data.length;
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
		System.out.println("low="+low+" high="+high);
		return 0;
	}

}
