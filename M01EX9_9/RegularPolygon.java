//Java class
public class RegularPolygon {
    //data field
    private int n;
    private double side;
    private double x;
    private double y;

    // A no-arg constructor
    public RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    // constructor with arguments
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    // constructor with arguments
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    //The accessor and mutator methods
    public int getN() {
        return this.n;
    }
    public void setN(int n)
    {
        this.n=n;
    }
    public double getSide()
    {
        return this.side;
    }
    public void setSide(double side)
    {
        this.side=side;
    }
    public double getX()
    {
        return this.x;
    }
    public void setX(double x)
    {
        this.x=x;
    }
    public double getY()
    {
        return this.y;
    }
    public void setY(double y)
    {
        this.y=y;
    }
    public double getPerimeter()
    {
        return this.n*this.side;
    }

    public double getArea()
    {
//calculate area
        double area = this.n * this.side*this.side / (4 * Math.tan(Math.PI / n));
        return area;//return area
    }
}
