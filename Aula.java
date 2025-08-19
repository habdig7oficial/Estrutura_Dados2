import java.util.Scanner;

public class Aula {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double[] consumos = new double[5];


        for(int i = 0; i < consumos.length; i++){
            System.out.printf("%d) Consumo: \n", i + 1);
            consumos[i] = entrada.nextDouble();
        }

        int x = 0;
        int[] vec = new int[3];
        System.out.println(vec);

        int qtde = 0;
        for(double consumo : consumos){
            if(consumo > 5000){
                System.out.printf("Consumo anomalo: %.1f\n", consumo);
                qtde++;
            }
            else {
                System.out.printf("Consumo ok\n");
            }

        }
    }
}
