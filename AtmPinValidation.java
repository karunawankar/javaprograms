import java.util.Scanner;
class AtmPinValidation 
{
public static void main(String[] args)
{
int pin;
Scanner sc = new Scanner(System.in);
System.out.println("Enter pin");
pin = sc.nextInt();
if(pin==1234)
{
System.out.println("access is granted");
}
else
{
System.out.println("access is denied");
}
sc.close();
}
}
