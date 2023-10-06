import java.util.Scanner;
class eligibility
{
public static void main(String[] args)
{
int age;
char gender;
Scanner sc = new Scanner(System.in);
System.out.println("Enter age:");
age= sc.nextInt();

System.out.println("Enter gender(M/F):");
gender = sc.next().charAt(0);

if(age>=18)
{
System.out.println("You are eligible for voting.");
}
else
{
System.out.println("You are  noteligible for voting.");
}

 if(gender=='M' || gender=='m')
{
if(age>=65)
{
System.out.println("You are eligible for retirement benifits.");
}
else 
{
System.out.println("You are not eligible for retirement benifits.");
}
}
 else if(gender=='F' || gender=='f')
{
if(age>=60)
{
System.out.println("You are eligible for retirement benifits.");
}
else 
{
System.out.println("You are not eligible for retirement benifits.");
}
}
else
{
System.out.println("Invalid gender input.");
}
if(age>=18 && age<=60)
{
System.out.println("You are eligible for driving.");
}
else
{
System.out.println("You are  not eligible for driving.");
}


sc.close();
}
}




