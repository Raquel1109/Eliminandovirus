package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Restaurante tradión antigua");
        System.out.println("*****************************");
        System.out.println("Menu del dia:");
        String rojo="\u001B[31m";
        System.out.println(rojo+"Entradas🥗");
        System.out.println("***Empanadas de iglesia---> $18000");
        System.out.println("***Picada antioqueña(Choricitos, morcillitas, pataconcitos---> $33000");
        System.out.println("***Arepa de mote con quesito---> $15000");
        System.out.println("***Salchipapa paisa (papa criolla, papa capira, chicharron carnudo, salchicha ranchera, queso) ---> $35000");
        String azul="\u001B[34m";
        System.out.println(azul+"Sobremesas🍷");
        System.out.println("***Aguapanela con limón---> $6000");
        System.out.println("***Chocolate migao ---> $12500");
        System.out.println("***Shot de tapa roja----> $8000");
        System.out.println("***Shot de tapa azul---> $11000");
        System.out.println("***Shot de tapa verde ---> $12000");
        System.out.println("***Coctel cucaracho ---> $38500");
        System.out.println("***Coctel blodyMary---> $40000");
        System.out.println("***Carvene savugnon ---> $850000");
        String purpura="\u001B[35m";
        System.out.println(purpura+"Platos fuertes🥣");
        System.out.println("***Sancocho trifacico ----> $48000");
        System.out.println("***Bandeja paisa ---> $62000");
        System.out.println("***Mondongo de la abuela ----> $52000");
        System.out.println("***Sopa de obispo ----> $40000");
        System.out.println("***Sopa de la Juanfe ----> $42000");
        String verde="\u001B[32m";
        System.out.println(verde+"***Postres🧁");
        System.out.println("***Arroz con leche ---> $19500");
        System.out.println("***Brevas con arequipe y queso ----> $20000");
        System.out.println("***Dulce de vitoria ----> $18000");
        //Creando un ciclo para seleccionar el pedido
        Scanner leerTeclado = new Scanner(System.in);
        Integer opcionMenu = 0;
        while(opcionMenu != 5){
            System.out.println("Digita una opción");
            opcionMenu=leerTeclado.nextInt();

        }




    }
}