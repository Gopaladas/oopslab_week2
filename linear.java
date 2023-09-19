import java.util.*;

public class linear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.print("enter the element to check : ");
		int ele = sc.nextInt();
		int flag = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[i] == ele){
					flag = 1;
					break;
				}
			}
		}
		
		if(flag == 1){
			System.out.println("element found ");
		}
		else{
			System.out.println("element not found ");
		}
	}
}
