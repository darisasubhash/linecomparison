public class Point {
    private  double x;
    private double y;
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Point)) {
            return false;
        }
        Point point = (Point) object;
        return Double.compare(x, point.x) == 0 &&
                Double.compare(y, point.y) == 0;
    }
}
