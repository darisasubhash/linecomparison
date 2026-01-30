import java.util.Scanner;

public class CalculateLength {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Start and End Points for Line One");
        System.out.println("Enter values of Line One Starting point");
        double x1= scan.nextDouble();
        double y1= scan.nextDouble();
        Point start1=new Point(x1,y1);
        System.out.println("Enter values of Line One End point");
        double x2= scan.nextDouble();
        double y2= scan.nextDouble();
        Point end1=new Point(x2,y2);
        Line lineone =new Line(start1,end1);
        System.out.println("Start and End Points for Line Two");
        System.out.println("Enter values of Line Two Starting point");
        double x3= scan.nextDouble();
        double y3= scan.nextDouble();
        Point start2=new Point(x3,y3);
        System.out.println("Enter values of Line Two End point");
        double x4= scan.nextDouble();
        double y4= scan.nextDouble();
        Point end2=new Point(x4,y4);
        Line linetwo =new Line(start2,end2);
        int res=lineone.compareTo(linetwo);
        if(res<0){
            System.out.println("Line Two is Bigger than Line One");
        } else if (res>0) {
            System.out.println("Line One is Bigger than Line Two");
        }
        else{
            System.out.println("Both lines are equal");
        }
    }
}