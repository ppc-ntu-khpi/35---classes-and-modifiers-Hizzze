# Класи та модифікатори видимості

## Customer.java

```java
public class Сustomer {
	private int ID;
	private boolean isNew = true;
	private double total = 1000;
	
public Сustomer() {
	this.ID = 1;
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
		System.out.println("ID is " + this.ID);
		System.out.println("Is new: " + this.isNew);
		System.out.println("Amount " + this.total);
	}
}
```

## CustomerTest.java

```java
public class CustomerTest {

	public static void main(String[] args) {
		Сustomer c = new Сustomer();
    c.setNew(false);
    c.setTotal(666.123);
    c.displayCustomerInfo();
	}

}
```

## Результат роботи ![Безымянный](https://user-images.githubusercontent.com/75045730/101831085-2a61dd80-3b3e-11eb-87f6-cc5052e6dde0.png)
