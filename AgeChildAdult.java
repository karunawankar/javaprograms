import java.util.Scanner;
class AgeChildAdult
{
public static void main(String[] args)
{
double age;
Scanner sc = new Scanner(System.in);
System.out.println("Enter age");
age = sc.nextDouble();
if(age>=0 && age<13)
{
System.out.println("child");
}
else if(age>=13 && age<21)
{
System.out.println("teenager");
}
else if(age>=21 && age<60)
{
System.out.println(Adult");
}
else
{
System.out.println("senior citizen");
}
sc.close();
}
}


