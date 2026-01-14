package pitercoding.devdojo.introducao;

public class A008ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{9, 8};
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[]{6, 5, 4, 3, 2, 1};

        int[][] arratInt2 = {{9, 8}, {1, 2, 3}, {6, 5, 4, 3, 2, 1}};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n---------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

    }

}
