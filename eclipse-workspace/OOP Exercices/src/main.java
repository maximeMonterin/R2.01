public class main {

	public static void main(String[] args) {
		
	      AnotherCircleClass c1 = new AnotherCircleClass(1.1);
	      System.out.println(c1);   // toString()
	      AnotherCircleClass c2 = new AnotherCircleClass(); // default constructor
	      System.out.println(c2);

	      // Test setter and getter
	      c1.setRadius(2.2);
	      System.out.println(c1);      // toString()
	      System.out.println("radius is: " + c1.getRadius());

	      // Test getArea() and getCircumference()
	      System.out.printf("area is: %.2f%n", c1.getArea());
	      System.out.printf("circumference is: %.2f%n", c1.getCircumference());
	      
	      System.out.println();
	      
	      // Test constructors and toString()
	      // You need to append a 'f' or 'F' to a float literal
	      Rectangle r1 = new Rectangle(1.2f, 3.4f);
	      System.out.println(r1);  // toString()
	      Rectangle r2 = new Rectangle();  // default constructor
	      System.out.println(r2);

	      // Test setters and getters
	      r1.setLength(5.6f);
	      r1.setWidth(7.8f);
	      System.out.println(r1);  // toString()
	      System.out.println("length is: " + r1.getLength());
	      System.out.println("width is: " + r1.getWidth());

	      // Test getArea() and getPerimeter()
	      System.out.printf("area is: %.2f%n", r1.getArea());
	      System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
	      
	      System.out.println();
	      
	      // Test constructor and toString()
	      Employee e1 = new Employee(8, "Peter", "Tan", 2500);
	      System.out.println(e1);  // toString();

	      // Test Setters and Getters
	      e1.setSalary(999);
	      System.out.println(e1);  // toString();
	      System.out.println("id is: " + e1.getId());
	      System.out.println("firstname is: " + e1.getFirstName());
	      System.out.println("lastname is: " + e1.getLastName());
	      System.out.println("salary is: " + e1.getSalary());

	      System.out.println("name is: " + e1.getName());
	      System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

	      // Test raiseSalary()
	      System.out.println(e1.raiseSalary(10));
	      System.out.println(e1);
	      
	      System.out.println();
	      
	      // Test constructor and toString()
	      InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
	      System.out.println(inv1);  // toString();

	      // Test Setters and Getters
	      inv1.setQty(999);
	      inv1.setUnitPrice(0.99);
	      System.out.println(inv1);  // toString();
	      System.out.println("id is: " + inv1.getId());
	      System.out.println("desc is: " + inv1.getDesc());
	      System.out.println("qty is: " + inv1.getQty());
	      System.out.println("unitPrice is: " + inv1.getUnitPrice());

	      // Test getTotal()
	      System.out.println("The total is: " + inv1.getTotal());
	      
	}

}