public class Main {
    public static void main(String[] args) {

    int [] arrey1;
    arrey1 = new int[10];


    int[] arrey2 = {
            10,20,30,40,50,
            60,70,80,90,100
    };


    //Array de Arrays
    String  [][] nomes = {
            { "Senhor", "Senhora" },
            { "João", "Maria", "José" }
    };

        //Senhor João
        System.out.println(nomes[0][0] + " " + nomes[1][0]);

        //Senhora Maria
        System.out.println(nomes[0][1] + " " + nomes[1][1]);

        //Senhor José
        System.out.println(nomes[0][0] + " " + nomes[1][2]);


        int[] números = {
          1,2,3,4,5,
          6,7,8,9,10
        };

        int[] númerosCopiados = new int[5];

        System.arraycopy(números, 2, númerosCopiados,0, 5);

        for (int i =0;i<5;i++){
            System.out.println(númerosCopiados[i]);
        }
    }
}