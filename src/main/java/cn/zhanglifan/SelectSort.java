package cn.zhanglifan;

public class SelectSort {
    public void selectSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i; j < arr.length; j++){
                min = arr[min] < arr[j] ? min : j;
            }
            int tempVal = arr[i];
            arr[i] = arr[min];
            arr[min] = tempVal;
        }
    }
}
