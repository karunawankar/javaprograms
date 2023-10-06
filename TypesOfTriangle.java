import java.util.Scanner;
class TypesOfTriangle
{
public static void main(String[] args)
{
double l1, l2, l3;
Scanner sc = new Scanner(System.in);
System.out.println("Enter l1 l2 and l3");
l1 = sc.nextDouble();
l2 = sc.nextDouble();
l3 = sc.nextDouble();


if(l1==l2 && l2==l3)
{
System.out.println("Triangle is equalateral");
}

else if(l1==l2 || l2==l3 || l1==l3)
{
System.out.println("Triangle is isosceles");
}

else 
{
System.out.println("Triangle is scalene");
}
sc.close();
}
}
