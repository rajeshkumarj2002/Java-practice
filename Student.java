package javatutorial;
import java.util.*;

class data{
	int marks[]=new int[5] ;
	String name;
	int rollno;
	int totalmark=0;
	data(int r,String n) {
		rollno=r;
		name=n;
		
	}
	int total() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Eneter mark "+(i+1)+" :");
			marks[i]=sc.nextInt();
			totalmark+=marks[i];
		}
		return totalmark;
	}
}
public class Student {

	public static void main(String[] args) {		
		data student1=new data(1,"Rajesh");
		
		data student2=new data(2,"kumar");
		
		System.out.println("Roll.no="+student1.rollno);
		System.out.println("Name="+student1.name);
		System.out.println("total= "+student1.total());
		
		System.out.println("Roll.no="+student2.rollno);
		System.out.println("Name="+student2.name);
		System.out.println("Total= "+student2.total());
		

	}

}
