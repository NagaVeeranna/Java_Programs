import java.util.Scanner;
 public class BubbleSort {
public static void main(String[] args){ 
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array size:\n");
 int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter the array elements:\n"); 
int i,j,tem;
for(i=0;i<n;i++){
arr[i] = sc.nextInt();
}
for(i=0;i<(n-1);i++){
for(j=0;j<(n-i-1);j++){
if(arr[j]>arr[j+1]){ 
tem=arr[j]; 
arr[j]=arr[j+1];
 	arr[j+1]=tem;
}
}
}
System.out.println("sorted array:"); for(i=0;i<n;i++){
System.out.println(arr[i]);
}
}
}
