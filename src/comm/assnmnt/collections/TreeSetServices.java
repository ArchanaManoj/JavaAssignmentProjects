package comm.assnmnt.collections;

//This is used if you want the set to be ordered according to Comparator
import java.util.*;
public class TreeSetServices {

	public static void main(String[] args) {
		TreeSet<Product> ts1 = new TreeSet<Product>();
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		p1.setProduct("Rice", 3.5, 65.5);
		ts1.add(p1);
		p2.setProduct("Sugar", 5, 95.78);
		ts1.add(p2);
		p3.setProduct("Pulses", 2.5, 80.0);
		ts1.add(p3);
		p4.setProduct("Potatoes", 5.0, 12.56);
		ts1.add(p4);
		System.out.println(ts1);
		for (Product p : ts1) { 
			System.out.println(p.getProduct().name+", "+p.getProduct().price+"Rupees, "+p.getProduct().quantity+"kg"); 
			}
	}
}

class Product implements Comparable<Product>{
	String name;
	double quantity;
	double price;
	
	public void setProduct(String name, double qty, double price) {
		this.name =name;
		this.quantity = qty;
		this.price = price;
	}
	
	public Product getProduct() {
		Product product = new Product();
		product.name = this.name;
		product.quantity = this.quantity;
		product.price = this.price;
		return product;
	}      
	
	@Override
    public int compareTo(Product p) {
        if (this.name == p.getProduct().name) {
            return 0;
        } else{
            return -1;
        }
     }
}


