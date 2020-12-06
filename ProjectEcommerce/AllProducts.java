package ProjectEcommerce;

import java.util.ArrayList;
import java.util.List;

public class AllProducts {
	
	 List<Product> products = new ArrayList<Product>();
	 
	 	public AllProducts () {
	        this.initStoreItems();
	    }
	    
	    public List<Product> getProducts() {
	        return products;
	    }
	    
	    public void initStoreItems() {
	        String [] title = {"Macbook Pro", "IPhone X", "Honda Wave"};
	        double [] price = {69500d, 26000d, 49000d};
	        
	        for (int i=0; i < title.length; i++) {
	            this.products.add(new Product(i+1, title[i], price[i]));
	        }
	    }
	    
	    public void addProduct(Product p) {
	    	products.add(p);
	    	
	    }

	    private Product getProductByProductID(int pid) {
	        Product product = null;
	        List<Product> products = new AllProducts().getProducts();
	        for (Product prod: products) {
	            if (prod.getPid() == pid) {
	                product = prod;
	                break;
	            }
	        }
	        return product;
	    }


	    public void removeProductByPID(int pid) {
	        Product prod = getProductByProductID(pid);
	        products.remove(prod);
	    }

	   public void printProducts() {
		   System.out.println("ALL PRODUCTS");
	        for (Product prod: products) {
				System.out.println(prod.getPid() + ". " + prod.getName() + " " + prod.getPrice());
	        }
			System.out.println("________________________________");

	    }

}
