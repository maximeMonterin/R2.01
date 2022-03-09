public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}
	
	public Circle(double r) {
		this.radius = r;
		this.color = "red";
	}
	
	public Circle(double r, String c) {
		this.radius = r;
		this.color = c;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	
	public String toString() {
		return "Circle[radius = " + this.radius + " color = " + this.color + "]";
	}
}
