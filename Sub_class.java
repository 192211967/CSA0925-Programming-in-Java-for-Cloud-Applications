import java.util.Scanner;
class Super_class
 {
 Super_class(int x,int y)
 {
 System.out.print(x+","+y);
 }
 }
 public class Sub_class extends Super_class
 {
 Sub_class(int x,int y)
 {
 super(x,y);
 }
 public static void main(String[] args)
 {
 Scanner input=new Scanner(System.in);
 Sub_class s1=new Sub_class(100,200);
 }
 }