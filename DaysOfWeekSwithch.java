import java.util.Scanner;
class DaysOfWeekSwithch
{
public static void main(String[] args)
{
int daynum;
Scanner sc = new Scanner(System.in);
System.out.println("Enter day's number");
daynum= sc.nextInt();
switch (daynum)
{
case 1:
System.out.println("Weekend");
break;
case 2:
System.out.println("Weekday");
break;
case 3:
System.out.println("Weekday");
break;
case 4:
System.out.println("Weekday");
break;
case 5:
System.out.println("Weekday");
break;
case 6:
System.out.println("Weekday");
break;
case 7:
System.out.println("Weekday");
default:
System.out.println("Invalid");
break;
}
sc.close();
}
}