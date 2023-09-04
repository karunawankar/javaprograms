import java.util.Scanner;
class SwitchArithOp
{
public static void main(String[] args)
{
char arithoperation;
int a, b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter value of a and b");
a = sc.nextInt();
b = sc.nextInt();
System.out.println("Enter operator");

arithoperation = sc.next().charAt(0);
switch (arithoperation)
{
case '+':
System.out.println("a+b="+(a+b));
break;

case '*':
System.out.println("a*b="+(a*b));
break;

case '-':
System.out.println("a-b="+(a-b));
break;

case  '/':
System.out.println("a/b="+(a/b));
break;
default:
System.out.println("invalid operator");
break;
}
sc.close();
}
}
