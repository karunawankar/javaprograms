import java.util.Scanner;
class OddEvenNumber
{
public static void main(String[] args)
{
int a;
Scanner sc= new Scanner(System.in);
System.out.println("Enter value of a");
a= sc.nextInt();
if(a%2==0)
{
System.out.println("Number is even");
}
else
{
System.out.println("Number is odd");

}
sc.close();
}
}
