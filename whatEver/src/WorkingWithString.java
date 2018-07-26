
public class WorkingWithString {
    public static void main(String[] args) {  
        Space3D space3d = new Space3D();
        
        Point3D startPoint = new Point3D(2,1,3);
        Point3D entPoint = new Point3D(0,0,6);
        
        double distance = space3d.caculatPoint(startPoint, entPoint);
        System.out.println(distance);
    }
}

class Point3D{
    int x;
    int y;
    int z;
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Space3D{
    private static final int EXPONENT_TWO = 2;
    double caculatPoint(Point3D startPoint, Point3D entPoint) {
        double x = Math.pow(startPoint.x-entPoint.x,Space3D.EXPONENT_TWO);
        double y = Math.pow(startPoint.y-entPoint.y,Space3D.EXPONENT_TWO);
        double z = Math.pow(startPoint.z-entPoint.z,Space3D.EXPONENT_TWO);
        double distance = Math.sqrt(x+y+z);
        
        return distance;
    }
}
