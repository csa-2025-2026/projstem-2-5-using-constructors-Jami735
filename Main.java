import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    //Problem 1
    Circle circ1 = new Circle(10.1);
    Circle circ2 = new Circle(14);
    Circle circ3 = new Circle(20.5);

    System.out.println(circ1.toString());
    System.out.println(circ2.toString());
    System.out.println(circ3.toString());

    //Problem 2

    double LenWid = 2.6;
    double Len = 10.4;
    double Wid = 28.9; 

    Rectangle rec4 = new Rectangle(2.6, 2.6);
    Rectangle rec5 = new Rectangle(10.4, 28.9);

    System.out.println("Type a number for length and width: ");
    System.out.println(LenWid);
    System.out.println("Type a length: ");
    System.out.println(Len);
    System.out.println("Type a width: ");
    System.out.println(Wid);
    System.out.println(rec4.toString());
    System.out.println(rec5.toString());

    //Problem 3
    System.out.println("Type a side ");
    double sides = sc.nextDouble();

    RegularPolygon poly1 = new RegularPolygon(sides);
    RegularPolygon poly2 = new RegularPolygon(4, sides);

    System.out.println(poly1.toString());
    System.out.println(poly2.toString());

  }
}
