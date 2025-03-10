package javaintroducao;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[6];

        //int[][] arrayInt2 = {{1,2}, {1,2,3}, {1,2,3,4,5,6}};
        for (int[] arrayBase : arrayInt) {
            System.out.println("\n------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }





        /*
        PRIMEIRA PARTE E SEGUNDA PARTE DA AULA (NÃO APAGAR)

        int[][] dias = new int[2][2];
        dias [0][0] = 21;
        dias [0][1] = 19;


        dias[1][0] = 29;
        dias[1][1] = 13;

        for(int i = 0; i < dias.length; i++){
            for(int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-------------------------");
        for(int[] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }*/
    }
}
