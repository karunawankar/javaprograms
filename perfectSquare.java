import java.util.Scanner;
class perfectSquare
{
public static void main(String[] args)
{
double a;
Scanner sc = new Scanner(System.in);
System.out.println("Enter value of a");
a = sc.nextDouble();
double sqrt= Math.sqrt(a);

if((sqrt-Math.floor(sqrt))==0)
{
System.out.println("number is perfect square");
}
else
{
System.out.println("number is not perfect square");
}

sc.close();
}
}
