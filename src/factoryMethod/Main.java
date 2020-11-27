package factoryMethod;

import factoryMethod.framework.Company;
import factoryMethod.framework.Product;
import factoryMethod.groupware.ITCompany;

public class Main {
	public static void main(String[] args) {
		Company itcompany = new ITCompany();
		Product projectA = itcompany.create("ProjectA");
		Product projectB = itcompany.create("ProjectB");
		Product projectC = itcompany.create("ProjectC");
		
		projectA.start();
		projectB.start();
		projectC.start();
		
		
		
		
	}
}
