package javacore.introducao.dominio.Gassociacao.test;

import javacore.introducao.dominio.Gassociacao.dominio.Escola;
import javacore.introducao.dominio.Gassociacao.dominio.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor = new Professor("Girafalles");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
