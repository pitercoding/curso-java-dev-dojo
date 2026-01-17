package pitercoding.devdojo.javacore.heranca.main;

import pitercoding.devdojo.javacore.heranca.dominio.Funcionario;

public class HerancaMain02 {
    // ============== ORDEM DE EXECUÇÃO ============== //
    // 0. [SUPERCLASSE] Bloco de inicialização estático da superclasse é executado quando a JVM carregar a superclasse
    // 1. [Subclasse] Bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filha
    // 2. [SUPERCLASSE] Alocado espaço em memória pro objeto da superclasse
    // 3. [SUPERCLASSE] Cada atributo da superclasse é criado e inicializado com valores default ou que for passado da superclasse
    // 4. [SUPERCLASSE] Bloco de inicialização da superclasse é executado na ordem que aparece
    // 5. [SUPERCLASSE] Construtor da superclasse é executado
    // 2. [Subclasse] Alocado espaço em memória pro objeto da subclasse
    // 3. [Subclasse] Cada atributo da subclasse é criado e inicializado com valores default ou que for passado
    // 4. [Subclasse] Bloco de inicialização da subclasse é executado na ordem que aparece
    // 5. [Subclasse] Construtor da subclasse é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Racha Cuca");
    }
}
