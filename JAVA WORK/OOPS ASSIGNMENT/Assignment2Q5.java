/*
  Write the classes Line, Rectangle, Cube etc. & make the Shape as their base class. Add an abstract draw() method in the class Shape & draw all shapes.
 */

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	System.out.println("Class rectangle extends shape");
    	return "this is the Rectangle5";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	System.out.println("Class line extends shape");
    	return "This is the Line5";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	System.out.println("Class cube extends shape");
    	return "This is the Cube5";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) {
    	Shape5 Rectangle= new Rectangle5 ();
    	Shape5 Line= new Line5 ();
    	Shape5 Cube= new Cube5 ();
    	System.out.println(Cube.draw());
    	System.out.println(Line.draw());
    	System.out.println(Rectangle.draw());
    }
}