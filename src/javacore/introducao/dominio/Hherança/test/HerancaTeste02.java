package javacore.introducao.dominio.Hherança.test;

import javacore.introducao.dominio.Hherança.dominio.Funcionario;

public class HerancaTeste02 {
    // 0 - Bloco  de inicializacao estático é executado quanto a JVM carregar classes
    // 1 - alocado espaço em memoria pro objeto
    // 2 - Cada atributo de classe é cirado e inicializado com valores default ou o que for passado
    // 3 -Bloco de inicialização é executado
    // 4 - Construtore é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
