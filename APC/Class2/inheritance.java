class Mobile {
	
	void calling()
	{
		System.out.println("i am calling");
	}
	
	void cameraQuality()
	{
		System.out.println("camera quality is too good");
	}

}

class Iphone extends Mobile{
	
	void airdrops()
	{
		System.out.println("airdrop is good");
	}

}

class OnePlus extends Mobile{

	
	void android()
	{
		System.out.println("android is good");
	}
}

public class inheritance {
	
	public static void main(String[] args) {
		
		Iphone i = new Iphone();
		i.airdrops();
		i.calling();
		i.cameraQuality();
		// i.android(); // This will not compile as android() is not defined in Iphone class
		OnePlus one = new OnePlus();
		one.android();
		one.calling();
		one.cameraQuality();
		
		Mobile mob = new Mobile();
		// mob.android(); // This will not compile as android() is not defined in Mobile class
		mob.cameraQuality();
		
		Mobile mob1 = new Iphone();
		// mob1.airdrops(); // This will not compile as airdrops() is not defined in Mobile class
		mob1.calling();		
	}
}


