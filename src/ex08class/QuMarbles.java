package ex08class;

class ChildProperty{
	int cnt;
	public ChildProperty(int cnt) {
		this.cnt = cnt;
	}
	void showProperty() {
		System.out.println("보유 구슬의 개수" + cnt);
	}
	void obtainBead(ChildProperty x, int y) {
		cnt += y;
		x.cnt -= y; 
	}
	
	
}
public class QuMarbles
{

	public static void main(String[] args)
	{
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);
		
		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty();
		System.out.print("어린이2 : ");
		child2.showProperty();
		
		// **************************//
		child1.obtainBead(child2, 5);
		child2.obtainBead(child1, 9);
		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 :");
		child1.showProperty();
		System.out.print("어린이2 :");
		child2.showProperty();
		
		

	}

}
