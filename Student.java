class Student
{
  String studentname;
  int registernumber;
  double add,marks1,marks2,marks3,marks4,marks5,avg,total;
  void get(String name,int number,double m1,double m2,double m3,double m4,double m5)
{
   studentname=name;
   registernumber=number;
   marks1=m1;
   marks2=m2;
   marks3=m3;
   marks4=m4;
   marks5=m5;
}
void calculate()
{
   total=marks1+marks2+marks3+marks4+marks5;
   avg=(total)/5;
}
void display()
{
   System.out.println("student name:"+studentname);
   System.out.println("Register number:"+registernumber);
   System.out.println("Total marks:"+total);
   System.out.println("Average of marks:"+avg);
   System.out.println("Enter the marks 1:"+marks1);
   System.out.println("Enter the marks 2:"+marks2);
   System.out.println("Enter the marks 3:"+marks3);
   System.out.println("Enter the marks 4:"+marks4);
   System.out.println("Enter the marks 5:"+marks5);
}
public static void main(String arg[])
{
   Student s=new Student();
    s.get("sampath", 192211974, 99, 98, 96, 94, 98);
   s.calculate();
   s.display();
}
}
 
   