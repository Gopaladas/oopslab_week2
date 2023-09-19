import java.util.*;
public class bs{
	
	public static void sort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static int search(int arr[],int st,int end,int val){
		
		if(end>=st && st<=arr.length-1){
			int mid = st+(end-st)/2;
			if(arr[mid]==val){
				return 1;
			}
			if(arr[mid]>val){
				end = mid-1;
				return	search(arr,st,end,val);
			}
			if(arr[mid]<val){
				st= mid +1;
				return search(arr,st,end,val);
			}
		}
		return 0;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int size = sc.nextInt();
		int[] arr= new int[size];
		System.out.println("enter the elements of array : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		sort(arr);
		System.out.println("enter the element to find : ");
		int val = sc.nextInt();
		int flag=0;
		System.out.println(arr.length);
		flag=search(arr,0,arr.length-1,val);
		if(flag==1){
			System.out.println("found");
		}
		else if(flag==0){
			System.out.println("not-found");
		}
	}
}
