import java.util.Scanner;
import java.util.Arrays;

class BinarySearch{
	public static int binarysearch(int arr[],int l,int h,int key){
		while(l<=h){
			int mid = (l+h)/2; if(arr[mid]==key){
			return mid;
		}
		if(arr[mid]<key){
			return binarysearch(arr,mid+1,h,key);
  		}
		return binarysearch(arr,l,mid-1,key);
	}
	return -1;
}
public static void main(String[] args){
 	Scanner sc = new Scanner(System.in);
	System.out.print("\nEnter the Array size:");
 	int n = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("\nEnter the Array elements:");
 	int i;
	for(i=0;i<n;i++){
 		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	System.out.println("\nsorted array:");
 	for(i=0;i<n;i++){
	System.out.println(arr[i]);
}
System.out.print("\nEnter the key to search:"); 
int key = sc.nextInt();
int res = binarysearch(arr,0,n-1,key);
if(res != -1){
	System.out.println("Element found at index:" + res);
}
else{
System.out.println("Element not found");
}
}
}
