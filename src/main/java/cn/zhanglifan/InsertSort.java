package cn.zhanglifan;

public class InsertSort {
    public void insetSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int curVal = arr[i];
            for(int j = i - 1; j >= 0; j--){
                arr[j+1] = arr[j];
                if(curVal >= arr[j]){
                    arr[j + 1] = curVal;
                    break;
                }
                if(j == 0){
                    arr[0] = curVal;
                }
            }
        }

    }
}
