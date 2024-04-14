package abstraction;

abstract class M{
	abstract public void fly();
}
class N extends M
{
	public void fly()
	{
		System.out.println("Fly Ship in the Air");
	}
}


public class SingleLevelAbstractionWithUpCasting {
	
	public static void main(String[] args) {

		N n1 = new N();
		M m1 = (M)n1;
		m1.fly();
//		n1.fly();
	}

}
