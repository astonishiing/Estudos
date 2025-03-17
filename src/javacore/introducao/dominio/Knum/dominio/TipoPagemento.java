package javacore.introducao.dominio.Knum.dominio;

public enum TipoPagemento{
        DEBITO{
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public double calcularDesconto(double valor){
            return 0;
    }
}