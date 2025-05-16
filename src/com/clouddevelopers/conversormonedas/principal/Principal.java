package com.clouddevelopers.conversormonedas.principal;

import com.clouddevelopers.conversormonedas.modelos.ConsultaTasa;
import com.clouddevelopers.conversormonedas.modelos.ConversionRates;
import com.clouddevelopers.conversormonedas.modelos.TasaCambio;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ConsultaTasa consultaTasa = new ConsultaTasa();

        TasaCambio tasaCambio = consultaTasa.tasaCambio();

        String menu =

                """
                   \s
                    Sea bienvenido/a al Conversor de Moneda =)
                   \s
                    1) Dolar =>> Peso argentino
                   \s
                    2) Peso argentino =>> Dolar
                   \s
                    3) Dolar =>> Real brasileño
                   \s
                    4) Real brasileño =>> Dolar
                   \s
                    5) Dolar =>> Peso colombianO
                   \s
                    6) Peso colombiano =>> Dolar
                   \s
                    7) Salir
                   \s
                    Elija una opción válida
                   \s
                    ***********************************************
                   \s

                """;

        while (true) {
            System.out.println(menu);
            int opcion = teclado.nextInt();
            System.out.println("Ingrese el valor que deseas convertir");
            double valor = teclado.nextDouble();
            double tasa = 0.0;

            if (opcion == 1) {
                tasa = tasaCambio.conversion_rates().ARS();
                System.out.println("El valor "+valor+"[USD] corresponde al valor final de =>> "+ valor*tasa+ " [ARS]");
            }

            if (opcion == 2) {
                tasa = tasaCambio.conversion_rates().ARS();
                System.out.println("El valor "+valor+"[ARS] corresponde al valor final de =>> "+ valor/tasa+ " [USD]");
            }

            if (opcion == 3) {
                tasa = tasaCambio.conversion_rates().BRL();
                System.out.println("El valor "+valor+"[USD] corresponde al valor final de =>> "+ valor*tasa+ " [BRL]");
            }

            if (opcion == 4) {
                tasa = tasaCambio.conversion_rates().BRL();
                System.out.println("El valor "+valor+"[BRL] corresponde al valor final de =>> "+ valor/tasa+ " [USD]");
            }

            if (opcion == 5) {
                tasa = tasaCambio.conversion_rates().COP();
                System.out.println("El valor "+valor+"[USD] corresponde al valor final de =>> "+ valor*tasa+ " [COP]");
            }

            if (opcion == 6) {
                tasa = tasaCambio.conversion_rates().COP();
                System.out.println("El valor "+valor+"[COP] corresponde al valor final de =>> "+ valor/tasa+ " [USD]");
            }

            if (opcion == 7) {
                System.out.println("Saliendo del programa");
                break;
            }



        }


    }


}
