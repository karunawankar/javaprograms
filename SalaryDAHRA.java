import java.util.Scanner;
class SalaryDAHRA
{
public static void main(String[] args)
{
int BasicSalary, HRA1, HRA, DA1, DA2, GrossSalary1, GrossSalary2;
Scanner sc= new Scanner(System.in);
System.out.println("Enter basic salary of employee");
BasicSalary= sc.nextInt();
HRA1= (BasicSalary*10/100);
DA1= (BasicSalary*90/100);
DA2= (BasicSalary*98/100);
GrossSalary1=(BasicSalary+HRA1+DA1);
GrossSalary2=(BasicSalary+500+DA2);

if(BasicSalary<1500)
{
System.out.println("HRA="+HRA1);
System.out.println("DA="+DA1);
System.out.println("GrossSalary="+GrossSalary1);


}
else
{
System.out.println("500 rs given as  HRA");
System.out.println("DA="+DA2);
System.out.println("GrossSalary="+GrossSalary2);

}
sc.close();
}
}

