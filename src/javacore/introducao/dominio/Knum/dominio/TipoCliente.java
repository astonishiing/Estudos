package javacore.introducao.dominio.Knum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");
    private int valor;
    private String nomeRelatorio;



    TipoCliente(int valor, String nomeRelatorio){
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
    public int getValor(){
        return valor;
    }
}
