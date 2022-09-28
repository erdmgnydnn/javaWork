package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(int id, String name, String description, double price, int stockAmount,String renk);

		product.name = "Laptop";
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockamount(3);
		product.setRenk(null);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getKod());

	}
}
