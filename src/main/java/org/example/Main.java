package org.example;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            String email_init = "qazando_";
            String email_final = "@qazando.com.br";

            Random random = new Random();
            int min = 0;
            int max = 99999999;

            // A lógica (max - min) + min é correta.
            // Como 'min' é 0, você poderia simplificar para apenas:
            // int result = random.nextInt(max);
            int result = random.nextInt(max - min) + min;

            // Aqui você imprime o resultado
            System.out.println(email_init + result + email_final);
        }

}