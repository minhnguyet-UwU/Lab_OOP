package lab03;

public class Aims {
	public static void main(String[] args) {
		//Create a new cart
		Cart anOrder = new Cart();
		
		//Create new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Avatar","Science Fiction","James Cameron", 200, 21.05);
		anOrder.addDigitalVideoDisc(dvd1);
		
		System.out.println("Total cost: " + anOrder.totalCost());
		anOrder.displayCart();
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Our Beloved Summer","Romantic Comedy","Kim Yoon-jin", 128, 24.95);
		anOrder.addDigitalVideoDisc(dvd2);
		
		System.out.println("Total cost: " + anOrder.totalCost());
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Swamp Shark","Science Fiction","Griff Furst", 178, 18.99);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("Total cost: " + anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd2);
		
		System.out.println("Total cost: " + anOrder.totalCost());
		
	}

}
