package Lesson4;

public class Arr {
    int[] arr;
    Arr(int[] arr){
        this.arr = arr;
    }
    protected int[] sort() {
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if (j < arr.length - 1)
                    if (arr[i] < arr[j]) {
                        int t = arr[j];
                        arr[j] = arr[i];
                        arr[i] = t;
                    }
            }
        }
        return arr;
    }
    protected int find_max_el(){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}