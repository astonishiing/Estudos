package javacore.introducao.dominio.Knum.dominio;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagemento tipoPagemento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagemento tipoPagemento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagemento = tipoPagemento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.getValor()+
                ", tipoPagemento=" + tipoPagemento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    /*public static final String PESSOA_FISICA = "PESSOA_FISICA";
    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";*/


    /*public Cliente(String nome, String tipo) {
        if(!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)){
            return;
        }
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }*/
}
