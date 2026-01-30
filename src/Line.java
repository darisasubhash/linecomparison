public class Line {
    private  Point start;
    private Point end;
    public Line(Point start,Point end){
        this.start=start;
        this.end=end;
    }
    public double calculateLength(){
        double deltax= end.getX()- start.getX();
        double deltay=end.getY()- end.getY();
        return Math.sqrt(Math.pow(deltax,2)+Math.pow(deltay,2));
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Line)) {
            return false;
        }
        Line line = (Line) object;
        return Double.compare(this.calculateLength(),
                line.calculateLength()) == 0;
    }

}
