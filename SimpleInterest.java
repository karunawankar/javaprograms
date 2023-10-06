import java.util.Scanner;
class SimpleInterest
{
public static void main(String[] args)
{
int principleAmt, ROI, time, simpleIntst;
Scanner sc = new Scanner(System.in);
System.out.println("Enter value of principleAmt ROI and time");
principleAmt= sc.nextInt();
ROI =sc.nextInt();
time=sc.nextInt();
simpleIntst= (principleAmt*ROI*time/100);
System.out.println("simple interest is="+simpleIntst);

sc.close();
}
}
