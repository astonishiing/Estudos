package javaintroducao;

public class Aula06EstruturaDeRepeticao {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for(int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                break;
            }
            /*if(valorParcela >= 1000){
                System.out.println("Parcela " + parcela + " R$" + valorParcela);
            }else{
                break;
            }*/
            //As duas formas de codificação dao certo
        }

    }
    //Dado o valor de um carro, desccruva em quantas ele pode ser parcelado
    // Condição valorParcela >= 1000;

}
