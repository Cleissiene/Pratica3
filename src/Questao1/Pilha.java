package Questao1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;
        Stack pilha = new Stack();

        scanner = new Scanner(new File("C:\\Users\\11513288\\Desktop\\Frases.txt"));
        while(scanner.hasNextLine()){
            pilha.push(scanner.nextLine());
        }
    for(int i=0; i<10; i++ ){
        System.out.println(pilha.pop());
    }

    }
}
