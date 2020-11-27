package factoryMethod.groupware;

import java.util.ArrayList;
import java.util.List;

import factoryMethod.framework.Company;
import factoryMethod.framework.Product;

public class ITCompany extends Company{
	
	private List<String> projects = new ArrayList<String>();

	@Override
	protected Product createProduct(String project) {
		return new GroupWare(project);
	}

	@Override
	protected void registerProduct(Product product) {
		projects.add(((GroupWare)product).getProject());
	}
	
	public List<String> getProject() {
		return projects;
	}
}