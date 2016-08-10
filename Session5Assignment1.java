import java.util.Scanner;

abstract class calcArea 
{
    abstract void findTriangle(double b, double h);
    abstract void findRectangle(double l, double b);    
} 
  
class findArea extends calcArea {
 
    void findTriangle(double b, double h)
    {
        double area = (b*h)/2;
        System.out.println("Area of Triangle: "+area);
    }
 
    void findRectangle(double l, double b)
    {
        double area = l*b;
        System.out.println("Area of Rectangle: "+area);
    }         
} 
  

public class Session5Assignment1
{
    public static void main(String [] args) 
    {
        double l, b, h;
        findArea area = new findArea();
        Scanner sc = new Scanner(System.in);
 
        System.out.print("\nEnter Base & Vertical Height of Triangle: ");
        b = sc.nextDouble();
        h = sc.nextDouble();
        area.findTriangle(b, h);
 
        System.out.print("\nEnter Length & Breadth of Rectangle: ");
        l = sc.nextDouble();
        b = sc.nextDouble();
        area.findRectangle(l, b);
       
   }
}