package datastructures.recursion;

public class TriangleArea {
	private int width;
	
	public TriangleArea(int width) {
		this.width = width;
	}
	public int getArea() {
		if (this.width == 0) {
			return 0;
		}
		else if (this.width == 1) {
			return 1;
		}
		else
			return new TriangleArea(this.width - 1).getArea() + this.width;
	}
	
	public static void main(String[] args) {
		 TriangleArea t = new TriangleArea(10);
		 int area = t.getArea();
		 System.out.println("Area: " + area);
		 System.out.println("Expected: 55");
		}

}
