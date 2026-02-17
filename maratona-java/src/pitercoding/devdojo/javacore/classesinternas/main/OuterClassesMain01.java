package pitercoding.devdojo.javacore.classesinternas.main;

public class OuterClassesMain01 {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesMain01.this);
        }
    }
    public static void main(String[] args) {
        OuterClassesMain01 outerClass = new OuterClassesMain01();
        outerClass.new Inner().printOuterClassAttribute();
    }
}
