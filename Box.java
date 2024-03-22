import java.util.Scanner;
class Box 
{
    double Length,Breadth,Height,volume;
    Box(double l,double b,double h) 
	{
        Length=l;
        Breadth=b;
        Height=h;
        volume=Length*Breadth*Height;
        System.out.println("THE VOLUME OF BOX IS " +volume);
    }

    public static void main(String[] args) 
	{
        Box b1=new Box(10,10,10);
    }
}
