package com.zhj.leetcode.sort;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import sun.util.locale.provider.FallbackLocaleProviderAdapter;

/**
 * 排序算法
 *
 */
public class Sort {
	public static void main(String[] args) {
		int[] data = new int[] { 6, 3, 2, 7, 4, 0, 1, 8, 4 };
		print(data);
		bubbleSort2(data);
		print(data);
	}

	// 交换数组中的两个元素
	public static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

	// 打印数组
	public static void print(int[] data) {
		if (data != null && data.length > 0) {
			for (int i = 0; i < data.length; i++) {
				System.out.print(data[i] + " ");
			}
			System.out.println("\n");
		}
	}

	// 冒泡排序1
	public static void bubbleSort(int[] data) {
		int n = data.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (data[i] > data[j]) {
					swap(data, i, j);
				}
			}
		}
	}

	// 冒泡排序2(优化)
	public static void bubbleSort2(int[] data) {
		boolean flag = true;
		int k = data.length - 1;
		
		while(flag){
			flag = false;
			for(int j = 0;j < k;j++){
				if(data[j] > data[j+1]){
					flag = true;
					swap(data, j, j+1);
				}
			}
			k--;
		}
	}
	
	//简单选择排序
	public static void SimlpeSort(int[] data) {
		int n = data.length;
		int min;
		for(int i = 0;i<n;i++){
			min = i;
			for(int j = i;j<n;j++){
				if(data[min] > data[j]){
					min = j;
				}
			}
			
			//减少了数据交换移动数据的次数
			if(min != i){
				swap(data, min, i);
			}
		}
	}

}















