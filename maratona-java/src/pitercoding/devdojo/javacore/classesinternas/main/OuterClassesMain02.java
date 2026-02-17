package pitercoding.devdojo.javacore.classesinternas.main;

public class OuterClassesMain02 {
    private String name = "Midoriya";

    void print() {
        final String lastName = "Izuku";
        class LocalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesMain02 outerClass = new OuterClassesMain02();
        outerClass.print();
    }
}
