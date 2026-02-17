package pitercoding.devdojo.javacore.classesinternas.main;

public class OuterClassesMain03 {
    private String name = "Racha";

    static class Nested {
        private String lastName = "Cuca";
        void print() {
            System.out.println(new OuterClassesMain03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
