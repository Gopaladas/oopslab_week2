import java.util.*;
public class command{
	public static void main(String[] args){
		int n = args.length;
		String[] arr = new String[n];
		for(int i=0;i<args.length;i++){
			arr[i] = args[i];
		}
		
		for(int i=0;i<args.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
