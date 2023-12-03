package ex12inheritance;

class Car
{
    int gasoline;
    public Car(int gasoline) {
        this.gasoline = gasoline;
    }
}
class HybridCar extends Car
{
    int electric;
    public HybridCar(int gasoline, int electric) {
    	super(gasoline);
    	this.electric = electric;
    	
}
class HybridWaterCar extends HybridCar
{
    int water;
    public HybridWaterCar(int gasoline, int electric, int water) {
    	super(gasoline, electric);
    	this.water = water;
    }	
 
    public void showNowGauge()
    {
     System.out.println("남은가솔린:"+gasoline);
     System.out.println("남은전기량:"+electric);
     System.out.println("남은워터량:"+water);
    }
}
public class QuConstructorAndSuper {
    // 자바에서는 static은 static끼리만 서로 호출할 수 있는데 
	// 아닌 걸 불러서 그렇게 된 것이다.
	public void main(String[] args)
	{
		HybridWaterCar hcar = new HybridWaterCar(10, 20, 30);
		hcar.showNowGauge();
	}
}



}
