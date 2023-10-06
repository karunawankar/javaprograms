import java.util.Scanner;

class TravelinsuCove
{
public static void main(String[] args)
{
String continent;
Scanner sc = new Scanner(System.in);
System.out.println("Enter continent");
continent = sc.next();
if(continent.equals("Europe"))
{
System.out.println("The coverage is rs 500000");
}
else if(continent.equals("Asia"))
{
System.out.println("The coverage is rs 300000");
}
else
{
System.out.println("Error");
}
sc.close();
}
}
