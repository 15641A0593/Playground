import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      double length=in.nextDouble();
      double width=in.nextDouble();
      double area=length * width;
      System.out.println(area);
	}
}