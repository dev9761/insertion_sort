import java.util.*;

class Solution {
    static void insertionSort(int arr[], int n)
    {
        //Write your code here    
		for(int i=1; i<arr.length;i++){
			int curr = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>curr){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = curr;
		}
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        
        Solution Obj = new Solution();
        Obj.insertionSort(array,n);
    }
}
