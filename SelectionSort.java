/** selection sort is a comparision based sorting
 *  In this we select a max or min element and find its right position.
 *  and swap.
 */

public class SelectionSort {
    private static int findMax(int[]arr,int st,int e){
        int max= st;
        for(int i=0;i<=e;i++){
            if(arr[max]<arr[i]){
                max= i;
            }
        }
        return max;
    }
    private static void swap(int []arr,int maxEle,int las){
        int temp = arr[maxEle];
        arr[maxEle] = arr[las];
        arr[las]=temp;
    }
    public static void selectionSort(int[]arr,int s,int e){
        int len = arr.length;
        for(int i=0;i<len;i++){
            int last = len-i-1;
            int maxEle = findMax(arr,0,last);
            swap(arr,maxEle,last);
        }

    }
    public static void display(int[]arr){
        System.out.println("Sorted Array is as follows::");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int[]arr ={12,5,2,9,8};
        selectionSort(arr,0,arr.length-1);
        display(arr);

    }
}
