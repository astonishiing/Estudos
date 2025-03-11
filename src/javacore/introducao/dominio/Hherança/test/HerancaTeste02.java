package javacore.introducao.dominio.Hherança.test;

import javacore.introducao.dominio.Hherança.dominio.Funcionario;

public class HerancaTeste02 {
    // 0 - Bloco de inicializacao estático da superclasse é executado quanto a JVM carregar classes pai
    // 1 - Bloco de inicializacao estático da subclasse é executado quanto a JVM carregar classes filhas
    // 2 - alocado espaço em memoria para o objeto da superclasse
    // 3 - Cada atributo de superclasse é cirado e inicializado com valores default ou o que for passado
    // 4 -Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Construtore é executado da superclasse

    // 6 - alocado espaço em memoria para o objeto da subclasse
    // 7 - Cada atributo de subclasse é cirado e inicializado com valores default ou o que for passado
    // 8 -Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Construtore é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
