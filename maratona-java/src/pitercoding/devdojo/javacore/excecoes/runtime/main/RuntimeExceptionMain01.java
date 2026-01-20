package pitercoding.devdojo.javacore.excecoes.runtime.main;

public class RuntimeExceptionMain01 {
    // Exceções:
    // 1. Checked -> Filha da classe Exception - Código não compila
    // 2. Unchecked -> Neta da classe Exception, filha de RuntimeException - Eu desenvolvi errado. Ex: pede número mas eu passo uma string

    public static void main(String[] args) {
        Object object = null;
        System.out.println(object.toString()); // NullPointerException

        int[] nums = {1,2};
        System.out.println(nums[2]); // ArrayIndexOutOfBoundsException
    }
}
