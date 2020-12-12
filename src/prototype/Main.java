package prototype;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();

        ProgramLang java = new ProgramLang("java");
        Ide eclipse = new Ide("eclipse");
        Ide intellij = new Ide("intellij");

        programmer.register("java",java);
        programmer.register("eclipse",eclipse);
        programmer.register("intellij",intellij);


        Product p1 = programmer.create("eclipse");
        p1.use("test");
        Product p2 = programmer.create("java");
        p2.use("test");
        Product p3 = programmer.create("intellij");
        p3.use("test");


    }
}
