package lab03;

public class DigitalVideoDisc {
	 private String title;
	    private String category;
	    private String director;
	    private int length;
	    private double cost;


	    public DigitalVideoDisc() {
	    }

	    public DigitalVideoDisc(String title, String category, double cost) {
	        this.title = title;
	        this.category = category;
	        this.cost = cost;
	    }
	    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
	        this.title = title;
	        this.category = category;
	        this.director = director;
	        this.length = length;
	        this.cost = cost;
	    }

	    public DigitalVideoDisc(String title) {
	        this.title = title;
	    }

	    public String getTitle() {
	        return title;
	    }
	    public void setTitle(String title) {
	        this.title = title;
	    }
	    public String getCategory() {
	        return category;
	    }
	    public void setCategory(String category) {
	        this.category = category;
	    }
	    public String getDirector() {
	        return director;
	    }
	    public void setDirector(String director) {
	        this.director = director;
	    }
	    public int getLength() {
	        return length;
	    }
	    public void setLength(int length) {
	        this.length = length;
	    }
	    public double getCost() {
	        return cost;
	    }
	    public void setCost(double cost) {
	        this.cost = cost;
	    }
	    public void printDetail() {
	        System.out.println("Title:" + this.title);
	        System.out.println("Category:" + this.category);
	        System.out.println("Director:" + this.director);
	        System.out.println("Length:" + this.length);
	        System.out.println("Cost:" + this.cost);
	    }
}
