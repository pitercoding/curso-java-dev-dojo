package pitercoding.devdojo.introducao;

public class A008ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // Meses: 1,2,3,4,5,6...
        // Dias: 31, 28, 31, 30...
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 31;

        System.out.println("========= USANDO FOR ===========");
        for (int i = 0; i < dias.length; i++) {
            // System.out.println(dias[i]); // referencia
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("========= USANDO FOREACH ===========");
        for (int[] arrBase : dias){
            for (int num: arrBase) {
                System.out.println(num);
            }
        }
    }
}
