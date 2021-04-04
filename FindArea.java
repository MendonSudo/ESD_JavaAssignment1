/* 46. Implement a java program to find the area of a) Circle b) Rectangle c) Square d) trapezoid e)rhombus f) triangle */

public class FindArea {

	public static void main(String[] args) {
        Circle c = new Circle(3.5);
        Rectangle r = new Rectangle(10, 4);
        Square s = new Square(7);
        Trapezoid t = new Trapezoid(3,4,10);
        Rhombus rh = new Rhombus(4,3);
        Triangle tr = new Triangle(3, 4);
        
        System.out.println("Circle Area : " + c.getArea());
        System.out.println("Rectangle Area : " + r.getArea());
        System.out.println("Square Area : " + s.getArea());
        System.out.println("Trapezoid Area : " + t.getArea());
        System.out.println("Rhombus Area : " + rh.getArea());
        System.out.println("Triangle Area : " + tr.getArea());
	}
}

class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double getArea() {
        return (22.0/7.0) * radius * radius;
    }
}

class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea(){
        return length * breadth;
    }
}

class Square {
    double side;
    Square(double side){
        this.side = side;
    }

    double getArea() {
        return side * side;
    }
}

class Trapezoid {
    double base1;
    double base2;
    double height;
    
    Trapezoid(double base1,double base2, double height){
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    double getArea() {
        return ((base1+base2) * height)/2;
    }
}

class Rhombus {
    double base;
    double height;
    
    Rhombus(double base, double height){
        this.base = base;
        this.height = height;
    }

    double getArea() {
        return base * height;
    }
}

class Triangle {
    double base;
    double height;
    
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    double getArea() {
        return (base * height)/2;
    }
}

