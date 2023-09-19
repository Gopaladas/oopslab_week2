import java.util.*;

public class SortName{
	
	public static void solve(String arr[]){
		for(int i=0;i<arr.length-1;i++){
			int k=0;
			for(int j=0;j<arr.length-1;j++){
				char ch = arr[j].charAt(k++);
				int val1 = ch;
				char ch1 = arr[j+1].charAt(k++);
				int val2 = ch1;
				if(val1 > val2){
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size : ");
		int size = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[size];
		System.out.println("enter the names : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextLine();
		}
		
		solve(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
