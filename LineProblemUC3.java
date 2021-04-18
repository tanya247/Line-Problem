import java.util.*;
public class LineProblemUC3 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x11,y11,x12,y12,x21,y21,x22,y22;
		double len1,len2;
		System.out.println("**FIRST LINE**");
		System.out.print("Enter x11: ");
		x11=sc.nextInt();
		System.out.print("Enter y11: ");
		y11=sc.nextInt();
		System.out.print("Enter x12: ");
		x12=sc.nextInt();
		System.out.print("Enter y12: ");
		y12=sc.nextInt();
		len1=Math.sqrt(((x12-x11)*(x12-x11))+((y12-y11)*(y12-y11)));
		String length1= String.valueOf(len1);
		
		System.out.println("**SECOND LINE**");
		System.out.print("Enter x21: ");
		x21=sc.nextInt();
		System.out.print("Enter y21: ");
		y21=sc.nextInt();
		System.out.print("Enter x22: ");
		x22=sc.nextInt();
		System.out.print("Enter y22: ");
		y22=sc.nextInt();
		len2=Math.sqrt(((x22-x21)*(x22-x21))+((y22-y21)*(y22-y21)));
		String length2= String.valueOf(len2);
		
		if(length1.compareTo(length2)==0)
		{
			System.out.println("Lines are equal!");
		}
		else if(length1.compareTo(length2)>0)
		{
			System.out.println("1st line is bigger!");
		}
		else if(length1.compareTo(length2)<0)
		{
			System.out.println("2nd line is bigger!");
		}
		}
}
