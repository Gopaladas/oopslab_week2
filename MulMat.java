import java.util.*;

public class MulMat{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row : ");
		int row = sc.nextInt();
		System.out.println("enter the col : ");
		int col = sc.nextInt();
		int[][] a= new int[row][col];
		int[][] b= new int[row][col];
		System.out.println("enter the elements of a : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("enter the elements of b : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				b[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		int[][] c=new int[row][col];
		
		//System.out.println("enter the elements of a : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				int sum=0;
				for(int k=0;k<row;k++){
					sum=sum+(a[i][k]*b[k][j]);
				}
				c[i][j]=sum;
			}
		}
		
		//System.out.println("enter the elements of a : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
