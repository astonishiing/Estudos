package javacore.introducao.dominio.Bintroducaometodos.metodos1;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
            //estudante altera os dados do objeto em memoria no ultimo caso apresentado
        System.out.println("----------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "Gohan"; // Nesse caso se pedirmos para imprimir o nome novamente irá substituir os nomes por "Gohan"
    }
}
