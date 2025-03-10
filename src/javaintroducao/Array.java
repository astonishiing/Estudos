package javaintroducao;

public class Array {
    public static void main(String[] args) {
        int [] idades = new  int[3]; //Crie um "objeto" em memória com 3 quadradinhos
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        for(int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }
    }
}
