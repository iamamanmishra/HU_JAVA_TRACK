public class Area {

    void area(float length,float breath)
    {
        System.out.println("Area of Rectangle is: "+length*breath);
    }
    void area(double length)
    {
        System.out.println("Area of Square is: "+length*length);
    }
    void area(float radius)
    {
        System.out.println("Area of Circle is: "+3.14*radius*radius);
    }
    void area(double base,double height)
    {
        System.out.println("Area of Triangle is: "+(base*height)/2);
    }

    public static void main(String[] args) {
        Area a=new Area();
        a.area(4.0f,4.0f);
        a.area(2.5);
        a.area(2.0f);
        a.area(3.0,4.0);

    }
}