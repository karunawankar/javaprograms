import java.util.Scanner;
class Grade
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter grades");
int grade = sc.nextInt();

if(grade>=90 && grade<=100)
{
System.out.println("A grade");
}
else  if(grade>=80 && grade<=80)
{
System.out.println("B grades");
}
else if(grade >=70 && grade<=79)
{
System.out.println("c grades");
}
else if(grade >=60 && grade<=69)
{
System.out.println("D grades");
}
else if(grade>=0 && grade<= 50)
{
System.out.println("Fail");
}
else
{

 System.out.println("Invalid input");

}
sc.close();
}

}