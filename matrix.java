package javatutorial;
import java.util.*;
class solution{
	public int ans(int value[][]) {//sum of all diagonal elements
		int sum=0;
		int n=value.length;
		int i=0,j=0;
		while(i<n) {//sum of main diagonal
			sum=sum+value[i][j];
			i++;
			j++;
		}
		i=0;j=n-1;
		while(j>=0) {//sum of secondary diagonal
			if(i!=j)
			    sum+=value[i][j];
			i++;
			j--;
		}
		return sum;
		
	}
}
public class matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = 0;
		System.out.print("Enter marix size :");
		a=sc.nextInt();
		int value[][]=new int[a][a];
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++){
				System.out.println("Enter a element "+ (i+1) + (j+1) +" :");
				value[i][j]=sc.nextInt();
				
			}
		}
		solution aa=new solution();
		System.out.println("ans = "+aa.ans(value));
	
		

	}

}
