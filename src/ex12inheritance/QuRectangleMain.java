package ex12inheritance;

//직사각형을 표현한 클래스
class Rectangle
{
	private int x, y;
	public Rectangle() {} // 기본 생성자
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int area() {
		return x * y;
		
	}
	public void showAreaInfo() {
		System.out.println("직사각형 면적 :" + area());
	}
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
	int x;
	public Square(int x) {
		super(x, x);
		
	}
	public void showAreaInfo() {
		System.out.println("정사각형 면적 :" + area());
	}	
} 
class QuRectangleMain {
	public static void main(String[] args) {
	     Rectangle rec = new Rectangle(4, 3);
	     rec.showAreaInfo();

         Square sqr = new Square(7);
	     sqr.showAreaInfo();
	     
 	}
}