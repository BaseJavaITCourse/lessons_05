package lecture_8_Inheritance.task_01;

public class Circle extends Figure {
	
	int r;	
	
	
	
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;

	}

	public void print() {
		System.out.println("Circle: " + x + "  " + y + "  " + r);
	}

}
