import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int num1=in.nextInt();
    int n1=num1/100;
    int n2=((num1/10)%10);
    int n3=(num1%10);
    int reverse=n3*100 +n2*10+n1;
    System.out.println(reverse);
  }
}