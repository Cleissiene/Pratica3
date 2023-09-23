package Questao2;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FilaShow {

    public static void main(String[] args) throws IOException{

            List<String> fila = new ArrayList<>();
            String ler = "C:\\Users\\11513288\\Desktop\\ListaPessoasIngresso.txt";

            try(Scanner read = new Scanner(new File(ler))){

                while (read.hasNextLine()){
                    fila.add(read.nextLine());
                }

            }


        // Mostrar os 10 primeiros ingressos VIP
            System.out.println("Ingressos VIP (primeiros 10):");
            for (int i = 0; i < 10; i++) {
                System.out.println(fila.remove(0));
            }

          int sorteado = new Random().nextInt(fila.size());
        System.out.println("A pessoa sorteada é: " + fila.remove(sorteado));

        }
    }

