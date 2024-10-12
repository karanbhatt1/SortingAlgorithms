/** CycleSort is a sorting algorithm used for the data conatining numerical values from 1 to N.
 *  It is not comparision based sorting it is index based sorting algorithm.
 *  It is not stable not applicable for duplicate values.
 *  It is not adaptive sorting algorthm.
 *  It is in place sorting algorithm.
 */
public class CycleSort {
    public static void swap(int[]arr,int f,int e){
        int temp = arr[f];
        arr[f] = arr[e];
        arr[e]= temp;
    }
    public static void cS(int[]arr){
        int len = arr.length-1;
        int i=0;
        while(i<=len){
            if(arr[i]-1 == i){
                i++;
            }
            else{
                swap(arr,i,arr[i]-1);
            }
        }
    }
    public static void print(int[]arrr){
        for(int i:arrr){
            System.out.print(i+" ");
        }
    }
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5};
        cS(arr);
        print(arr);
    }
}
