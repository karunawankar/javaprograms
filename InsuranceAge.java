import java.util.Scanner;
class InsuranceAge
{
public static void main(String[] args)
{
int age;
Scanner sc = new Scanner(System.in);
System.out.println("Enter age of the person");
age = sc.nextInt();
if(age>=18 && age<=60)
{
System.out.println("person is eligible for insurance");
}
else

{
System.out.println("person is  not eligible for insurance");
}
sc.close();
}
}
