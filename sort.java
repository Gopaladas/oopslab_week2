import java.util.*;

public class sort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}
