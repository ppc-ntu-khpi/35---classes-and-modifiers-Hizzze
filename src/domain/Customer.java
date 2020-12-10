public class Customer {
	private int ID;
	private boolean isNew = true;
	private double total = 1000;

public Customer() {
		this.ID = 3;
    		this.isNew = true;
    		this.total = 3500;
	}

  public int getID() {
		return ID;
	}


	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void displayCustomerInfo() {
		System.out.println("ID is: " + this.ID);
		System.out.println("Is new: " + this.isNew);
		System.out.println("ammount " + this.total);
	}
}
