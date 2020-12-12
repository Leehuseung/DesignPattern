package prototype;

import java.util.HashMap;

public class Programmer {

    private HashMap<String,Object> productCase = new HashMap();

    public void register(String name, Product proto){
        productCase.put(name,proto);
    }

    public Product create(String protoname){
        Product p = (Product)productCase.get(protoname);
        return p.createClone();
    }




}
