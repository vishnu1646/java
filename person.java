import java.util.Scanner;
class person {
String memb_name;
String gender;
String address;
int age;
Scanner ps =new Scanner(System.in);
public person() {
System.out.println("enter member name:");
memb_name=ps.next();
System.out.println("enter gender:");
gender=ps.next();
System.out.println("enter address:");
address=ps.next();
System.out.println("enter age:");
age=ps.nextInt();
}
}
class Employee extends person {
int emp_id;
String company_name;
String qualification;
double salary;
Scanner em =new Scanner(System.in);
Employee() {
System.out.println("enter emp_id:");
emp_id=em.nextInt();
System.out.println("enter company_name:");
company_name=em.next();
System.out.println("enter qualification:");
qualification=em.next();
System.out.println("enter salary:");
salary=em.nextDouble();
}
}
class Teacher extends Employee {
String subject;
String department;
int Teacher_id;
Scanner th=new Scanner(System.in);
Teacher() {
System.out .println("enter subject:");
subject=th.next();
System.out.println("enter department:");
department=th.next();
System.out.println("enter Teacher_id:");
Teacher_id=th.nextInt();
}
public void display() {
System.out.println("----------****DETAILS*****------------");
System.out.println("Name: "+memb_name);
System.out.println("Gender: "+gender);
System.out.println("Address: "+address);
System.out.println("Age: "+age);
System.out.println("Employee id: "+emp_id);
System.out.println("Company name: "+company_name);
System.out.println("Qualification: "+qualification);
System.out.println("Salary: "+salary);
System.out.println("Subject: "+subject);
System.out.println("Department details: "+department);
System.out.println("Teacher id: "+Teacher_id);
}
}
public class TestInheritance1{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int i;
System.out.println("Enter number of persons: ");
int n=sc.nextInt();
Teacher k[]=new Teacher[n];
for(i=0;i<n;i++)
{
k[i]=new Teacher();
}
for(i=0;i<n;i++)
{
k[i].display();
}
}
}
