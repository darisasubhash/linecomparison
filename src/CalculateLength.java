import java.util.Scanner;

public class CalculateLength {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter values of Starting point");
        double x1= scan.nextDouble();
        double y1= scan.nextDouble();
        Point start=new Point(x1,y1);
        System.out.println("Enter values of End point");
        double x2= scan.nextDouble();
        double y2= scan.nextDouble();
        Point end=new Point(x2,y2);
        Line line =new Line(start,end);
        System.out.println(line.calculateLength());
    }
}