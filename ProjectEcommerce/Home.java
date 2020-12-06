package ProjectEcommerce;

import java.util.List;
import java.util.Scanner;

public class Home {
	Cart cart = new Cart();
	AllProducts products = new AllProducts();
	private int ch = 0;
	int count = 4;

	public Home() {
		menu();
	}

	public void startScreen() {
		System.out.println("What do you want to do ?");
		System.out.println("1. USER MODE");
		System.out.println("2. ADMIN MODE");
		System.out.println("0. Exit");
	}

	public void adminScreen() {
		System.out.println("1. Add Product");
		System.out.println("2. Remove Product");

	}

	public void storeProductsMenu() {
		System.out.println("1. Add to Cart");
		System.out.println("2. Remove From Cart");
		System.out.println("3. Show Cart");
	}

	public void menu() {

		do {
			startScreen();
			getUserInput();

			switch (ch) {
			case 1:
				showProducts();
				showCart();
				storeProductsMenu();
				getUserInput();
				innerChoice1();
				break;
			case 2:
				showProducts();
				adminScreen();

				getUserInput();
				innerChoice2();
				break;
			case 0:
				System.exit(0);
				break;
			default:

				break;
			}
		} while (ch != 0);
	}

	private void innerChoice1() {
		switch (ch) {
		case 1:
			addProductToCart();
			break;
		case 2:
			removeProductFromCart();
			break;
		case 3:
			showCart();
			break;
		default:

			break;
		}
	}

	private void innerChoice2() {
		switch (ch) {
		case 1:
			addMoreProduct();
			break;
		case 2:
			removeProduct();

			break;
		default:

			break;
		}
	}

	public void addMoreProduct() {
		Scanner in = new Scanner(System.in);

		System.out.print("Product Name: ");
		String name = in.nextLine();
		System.out.print("Product Price: ");
		double price = in.nextDouble();

		Product p = new Product(count, name, price);
		products.addProduct(p);
		List<Product> products = new AllProducts().getProducts();
		products.add(p);
		showProducts();
		count++;

	}

	private void showProducts() {
		products.printProducts();
	}

	public void removeProduct() {
		Scanner in = new Scanner(System.in);
		System.out.print("Remove: ");
		int id = in.nextInt();
		products.removeProductByPID(id);

	}

	private int getUserInput() throws NumberFormatException {
		Scanner in = new Scanner(System.in);
		ch = Integer.parseInt(in.nextLine());
		return ch;
	}

	private void displayStoreProducts() {
		List<Product> products = new AllProducts().getProducts();
		System.out.println("ALL PRODUCTS");
		for (Product prod : products) {
			System.out.println(prod.getPid() + ". " + prod.getName() + " " + prod.getPrice());
		}
		System.out.println("________________________________");
	}

	private void addProductToCart() {
		int pid = getUserInput();
		cart.addProductToCartByPID(pid);
	}

	private void showCart() {
		cart.printCartItems();

	}

	private void removeProductFromCart() {
		int pid = getUserInput();
		cart.removeProductByPID(pid);
	}
}