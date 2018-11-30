package com.king;

import java.util.Arrays;

/**
 * 排序测试类
 * @author OneKing
 *
 */
public class SortTest {
	
	/**
	 * 构造方法
	 */
	public SortTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    /**
     * 与类名称一致的方法名
     */
    public void SortTest(){
    	System.out.println("这个方法证明方法的名字和类名称是可以一致的");
    }
    

	/**
	 * 冒泡排序
	 * @param nums
	 */
	public static void bubbleSort(int[] nums){
		int swap = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[j] > nums[i]) {
					swap = nums[i];
					nums[i] = nums[j];
					nums[j] = swap;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
	
	/**
	 * 选择排序
	 * @param array
	 */
	public static void selectSort(int array[]) {
        int t = 0;
        for (int i = 0; i < array.length - 1; i++){
            int index=	i;
            for (int j = i + 1; j < array.length; j++){
                if (array[index] > array[j]){
                    index =	j;
                }
            }
            if(index!=i){ //找到了比array[i]小的则与array[i]交换位置
                t = array[i];
                array[i] = array[index];
                array[index] = t;
            }
        }
        System.out.println(Arrays.toString(array));
    }
	

	/**
	 * 
	 * @param a
	 */
    public static void quickSort(int[] a) {  
        if(a.length>0) {  
            quickSort(a, 0 , a.length-1);  
        }  
    }  
  
    private static void quickSort(int[] a, int low, int high) {  
        //1,找到递归算法的出口  
        if( low > high) {  
            return;  
        }  
        //2, 存  
        int i = low;  
        int j = high;  
        //3,key  
        int key = a[ low ];  
        //4，完成一趟排序  
        while( i< j) {  
            //4.1 ，从右往左找到第一个小于key的数  
            while(i<j && a[j] > key){  
                j--;  
            }  
            // 4.2 从左往右找到第一个大于key的数  
            while( i<j && a[i] <= key) {
            	
                i++;  
            }  
            //4.3 交换  
            if(i<j) {  
                int p = a[i];  
                a[i] = a[j];  
                a[j] = p;  
            }  
        }  
        // 4.4，调整key的位置  
        int p = a[i];  
        a[i] = a[low];  
        a[low] = p;  
        //5, 对key左边的数快排  
        quickSort(a, low, i-1 );  
        //6, 对key右边的数快排  
        quickSort(a, i+1, high);  
    }  
    
	public static void main(String[] args) {
//		int[] a = {11,2,31,3,6,10,8,40,100,50,20,6,45};
//		bubbleSort(a);
//		selectSort(a);
		int[] a = { 5, 2, 8, 5, 9, 2, 3, 4, 9 };
        System.out.println(Arrays.toString(a));  
        quickSort(a);  
        System.out.println(Arrays.toString(a));  
	}
}
