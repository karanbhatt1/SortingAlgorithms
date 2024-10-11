public class InsertionSort {
    public static void iS(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    public static void swap(int[]arr,int f,int e){
        int temp = arr[f];
        arr[f]=arr[e];
        arr[e] = temp;
    }
    public static void printSorted(int[]arr){
        System.out.println("The Sorted array is:");
        for (int j : arr) {
            System.out.print(j +" ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {12,1,23,5,6,29};
        iS(arr);
        printSorted(arr);

    }
}
