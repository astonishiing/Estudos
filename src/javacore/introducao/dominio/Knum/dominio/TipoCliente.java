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

    public static TipoCliente TipoClienteForNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {// Retornar um array de todos os TiposClientes e irei iterar sobre ele
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
    public int getValor(){
        return valor;
    }
}
