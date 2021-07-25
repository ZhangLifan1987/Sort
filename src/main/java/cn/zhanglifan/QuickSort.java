package cn.zhanglifan;

public class QuickSort {
    public void quickSort(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }

        sort(0, arr.length-1, arr);
    }

    private void sort(int start, int end, int[] arr){
        if(start >= end){
            return;
        }

        int left = start;
        int right = end;
        int pivot = start;
        int pivotVal = arr[start];

        while (left < right){
            if(arr[left + 1] > pivotVal){
                if(arr[right] < pivotVal){
                    swap(left + 1, right, arr);
                    left++;
                    right--;
                }
            }else{
                left++;
            }

            if(left >= right){
                break;
            }

            if(arr[right] < pivotVal){
                if(arr[left + 1] > pivotVal){
                    swap(right, left + 1, arr);
                    left++;
                    right--;
                }
            }else {
                right--;
            }
        }

        swap(right, pivot, arr);
        pivot = right;

        sort(start, pivot - 1, arr);
        sort(pivot + 1, end, arr);
    }

    private void swap(int one, int other, int[] arr) {
        int tempVal = arr[one];
        arr[one] = arr[other];
        arr[other] = tempVal;
    }
}
