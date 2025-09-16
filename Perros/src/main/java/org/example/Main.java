package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Perros coreanos 🌭");
        System.out.println("1. Perro Lobo: Salchicha ranchera doble y papas picantes ---> $20000 ");
        System.out.println("2. Perro hermafrodita: triple tocineta y salchicha XL ---> $30000");
        System.out.println("3. Perro marinero: Salchicha de langosta ---> $40000 ");
        System.out.println("4. Perro Montañero: Platanitos y mayonesa de aguardiente ---> $25000");
        System.out.println("5. Perro caleño: Salchicha con salsa de chontaduro ---> $20000");
        System.out.println("6. Perro barranquillero: Butifarra y suero costeño ---> $18000");
        System.out.println("7. Perro Venezolano: Salchicha empanizada en harina pan y diablito ---> $10000");
        System.out.println("8. Perro infiel: Carne mixta con salsa picante ---> $5000");
        System.out.println("9. Perro vegetariano: Salchicha de carve con salsa de soya ---> $30000");
        System.out.println("10.Perro africano: longaniza antioqueña ---> $15000 ");
        System.out.println("11.Terminar orden ");
        Scanner leerOrden = new Scanner(System.in):
        Integer opcion =0;
        while(opcion != 11){
            System.out.println("Bienvenidos a perritos coreanos 🍢");
            System.out.println("Registro de pedidos: ");
            System.out.println("¿Que perro deseas ordenar?");
            opcion=leerOrden.nextInt();
            System.out.println("Cuantoes desea?");
            Integer cantidadDePerros=leerOrden.nextInt();

            //Evaluando el pedido
            System.out.println("Su perro elegido fue......"+opcion);
            System.out.println("La cantidad de perros fue...."+cantidadDePerros);


        }


        }
    }
}