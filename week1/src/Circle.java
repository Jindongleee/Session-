public class Circle {
    int radius;

    public double radius_size(int r){
        return 3.14*r*r;
    }

    public static void main(String[] args){
        Circle size1=new Circle();
        size1.radius = 8;
        System.out.println(size1.radius_size(size1.radius));
    }
}
