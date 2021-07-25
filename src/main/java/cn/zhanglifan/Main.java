package cn.zhanglifan;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int[] arr = genArr(1000);
        //final int[] arr = int[]{3,1,4,2,5,6,7,-3};
        System.out.println("###初始arr：" + Arrays.toString(arr));
        int[] arrClone;
        long startTime;

        arrClone = arr.clone();
        QuickSort quickSort = new QuickSort();
        startTime = System.currentTimeMillis();
        quickSort.quickSort(arrClone);
        log(startTime, "快速", arrClone);

        arrClone = arr.clone();
        BubbleSort bubbleSort = new BubbleSort();
        startTime = System.currentTimeMillis();
        bubbleSort.bubbleSort(arrClone);
        log(startTime, "冒泡", arrClone);

        arrClone = arr.clone();
        SelectSort selectSort = new SelectSort();
        startTime = System.currentTimeMillis();
        selectSort.selectSort(arrClone);
        log(startTime, "选择", arrClone);

        arrClone = arr.clone();
        InsertSort insertSort = new InsertSort();
        startTime = System.currentTimeMillis();
        insertSort.insetSort(arrClone);
        log(startTime, "插入", arrClone);

    }

    public static void log(long startTime, String name, int[] arr){
        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;
        String text = "***%s排序结果：%s";
        text += "\n";
        text += "***%s排序耗时%s毫秒***";
        text = String.format(text, name, Arrays.toString(arr), name, executeTime);
        System.out.println(text);
    }

    public static int[] genArr(int len){
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = (int) (Integer.MAX_VALUE * Math.random());
            arr[i] += (int) (Integer.MIN_VALUE * Math.random());
        }

        return arr;
    }
}
