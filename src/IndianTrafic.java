import demoClass.CentralTraffic;

public class IndianTrafic implements CentralTraffic  {
//Interface Example
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic c = new IndianTrafic();
		c.greenGo();
		c.redStop();
		c.FlashYellow();
		IndianTrafic I = new IndianTrafic();
		I.walkonsymbol();
	}

	@Override
	public void redStop() {
	// TODO Auto-generated method stub
	System.out.println(" redstop implementation");
	}
	public void walkonsymbol()
	{
	System.out.println("walking");
	}
	@Override
	public void FlashYellow() {
	// TODO Auto-generated method stub
	System.out.println(" flash yellow implementation");
	//code
	}

	@Override
	public void greenGo() {
	// TODO Auto-generated method stub
	System.out.println(" Green go implementation");
	}

	@Override
	public void Trainsymbol() {
	// TODO Auto-generated method stub

	}

}
