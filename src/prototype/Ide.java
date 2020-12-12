package prototype;

public class Ide implements Product{
    private String ide = "";

    public Ide(String ide) {
        this.ide = ide;
    }

    public void use(String a){
        System.out.println("개발툴은 "+ide+"를 사용합니다.");
    }

    public Product createClone(){
        Product p = null;
        try{
            p = (Product)clone();
        }catch(Exception e){
            e.printStackTrace();
        }
        return p;
    }
}
