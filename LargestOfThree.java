import java.util.Scanner;
class LargestOfThree
{
public static void main(String[] args)
{
int a, b, c, largest;
Scanner sc = new Scanner(System.in);
System.out.println("Enter any three numbers");

a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();

if(a>b)
{
if(a>c)
System.out.println(a+ "is largest");
else 
System.out.println(c+ "+is largest");
}
else
{
if (b>c)
System.out.println(b+ "is largest");
else
System.out.println(c+ "is largest");
}
sc.close();
}
}