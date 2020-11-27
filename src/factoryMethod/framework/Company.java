package factoryMethod.framework;

public abstract class Company {
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	
	protected abstract Product createProduct(String project);
	protected abstract void registerProduct(Product product);

}
