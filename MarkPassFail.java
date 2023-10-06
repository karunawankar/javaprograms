import java.util.Scanner;
class MarkPassFail
{
public static void main(String[] args)
{
int marks;
Scanner sc = new Scanner(System.in);
System.out.println("Enter marks");
marks = sc.nextInt();
if(marks>=50)
System.out.println("Pass");
else if(marks>0 && marks<=49)
System.out.println("Fail");
else
System.out.println("invalid");


sc.close();
}
}