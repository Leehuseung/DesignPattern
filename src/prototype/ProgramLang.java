package prototype;

public class ProgramLang implements Product{

    private String lang = "";

    public ProgramLang(String java) {
        this.lang = lang;
    }

    public void use(String a){
        System.out.println(lang+"언어를 사용합니다.");
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
