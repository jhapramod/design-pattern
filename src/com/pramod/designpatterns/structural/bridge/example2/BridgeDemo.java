package com.pramod.designpatterns.structural.bridge.example2;

import java.util.ArrayList;
import java.util.List;

public class BridgeDemo {

	public static void main(String[] args) {
		List<Workshop> workshops = new ArrayList<Workshop>();
		workshops.add(new ProduceWorkshop());
		workshops.add(new AssembleWorkshop());
		
		Vehicle car = new Car(workshops);
		car.manufacture();
		
		Vehicle bus = new Bus(workshops);
		bus.manufacture();
	}

}
