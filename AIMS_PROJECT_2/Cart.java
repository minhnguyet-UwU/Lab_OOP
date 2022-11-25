package lab03;

public class Cart {
	 private int qtyOrdered = 0;
	 private static final int MAX_NUMBERS_ORDERED = 20;
	 private final DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	  
	 public Cart() {
		 
	 }
	 
	 public int getqtyOrdered() {
	        return qtyOrdered;
	 }
	 // de private lai bao loi =((
	 private void setqtyOrdered(int qtyOrdered) {
		 this.qtyOrdered = qtyOrdered;
	    }

	 public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		 if (qtyOrdered <= 20) {
	     if (qtyOrdered < 20) {
	    	 itemsOrdered[qtyOrdered] = disc;
	         qtyOrdered++;
	         System.out.println("The disc has been added");
	     } else
	         System.out.println("The cart is almost full");
		 }
	 }

	  public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		  for (DigitalVideoDisc item : dvdList) {
			  this.addDigitalVideoDisc(item);
	      }
	  }

	  public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		  this.addDigitalVideoDisc(disc1);
	      this.addDigitalVideoDisc(disc2);
	  }

	  public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		  int count = qtyOrdered;
	      DigitalVideoDisc currentDisc = null;
	      for (int i = 0; i < qtyOrdered; i++) {
	    	  currentDisc = itemsOrdered[i];
	          if (currentDisc == disc) {
	          if (currentDisc.equals(disc)) {
	        	  for (int j = i + 1; j < qtyOrdered; j++) {
	        		  itemsOrdered[j - 1] = itemsOrdered[j];
	              }
	              itemsOrdered[qtyOrdered] = null;
	              qtyOrdered--;
	          }
	          }
	      }
	       if (qtyOrdered != count)
	    	   System.out.println((count - qtyOrdered) + " item(s) has/have been removed.");
	       else
	           System.out.println("Can't found item.");
	   }
	   public double totalCost() {
		   if (qtyOrdered <= 0)
			   return 0;
	       double cost = 0;
	       for (int i = 0; i < qtyOrdered; i++) {
	           cost += itemsOrdered[i].getCost();
	       }
	       return cost;
	   }

	   public void displayCart() {
	       if (qtyOrdered <= 0)
	           System.out.println("Nothing");
	       else {
	           for (int i = 0; i < qtyOrdered; i++) {
	        	   itemsOrdered[i].printDetail();
	           }
	       }
	   }
	   public void printCart() {
	       System.out.println("********************CART***********************\nOrdered Items:");
	       double total = 0;
	       for (int i = 0; i < qtyOrdered; i++) {
	    	   total += this.itemsOrdered[i].getCost();
	           System.out.println((i + 1) + ".DVD - " + this.itemsOrdered[i].getTitle() + " - "
	                    + this.itemsOrdered[i].getCategory() + " - " +
	                    this.itemsOrdered[i].getDirector() + " - " + this.itemsOrdered[i].getLength() + " : " +
	                    +this.itemsOrdered[i].getCost());
	       }
	       System.out.println("Total Cost : " + total);
	       System.out.println("***********************************************");

	    }

	    public static void main(String[] args) {
	        DigitalVideoDisc t = new DigitalVideoDisc("Hello world");
	        Cart a = new Cart();
	        a.addDigitalVideoDisc(t);
	        a.printCart();
	    }
}
