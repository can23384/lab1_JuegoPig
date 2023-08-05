/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Laboratorio #1. Juego Pig
Eliazar Canastuj
carnet: 23384
*/

import java.util.*;


public class main{

    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int hola = 1;
        int puntaje1 = 0;
        int puntaje2 = 0;


        dado dado1, dado2;

        dado1 = new dado(0, 0);
        dado2 = new dado(0, 0);

        Random random = new Random();

        System.out.println("Bienvenidos a el juego Pig");
        while (hola != 2)
        {   
            int p1 = 1;
            int p2 = 1;
            int comprobador = 0;
            int comprobador2 = 0;

            System.out.println("=============================");
            System.out.println("Jugador 1: ");
            while (p1 != 2)
            {
                int random1 = random.nextInt(6) + 1;
                int random2 = random.nextInt(6) + 1;
                System.out.println("Dado 1: ");
                System.out.println(random1);
                System.out.println("Dado 2: ");
                System.out.println(random2);
                System.out.println(" ");

                dado1.setValor(random1);
                dado1.setValor2(random2);

                if (dado1.getValor() != 1 && dado1.getValor2() != 1)
                {
                    int suma = dado1.getValor() + dado1.getValor2();
                    puntaje1 += suma;
                    comprobador += suma;
                    System.out.println("Su puntaje actual es de: ");
                    System.out.println(puntaje1);
                    System.out.println(" ");

                    if (puntaje1 >= 100)
                    {
                        System.out.println("***");
                        System.out.println("Jugador 1 gano");
                        System.out.println("***");
                        hola = 2;
                        p1 = 2;
                        p2 = 2;
                    }

                    else
                    {
                        if (comprobador >= 20)
                        {
                            System.out.println("Su ronda termino, ya obtuvo mas de 20 puntos");
                            p1 = 2;
                        }

                        else
                        {
                            System.out.println("Desea tirar otra vez?, 1.si  2.no");
                            int opcion = teclado.nextInt();
                            if (opcion == 2)
                            {
                                p1 = 2;
                            }
                        }

                    }
                    
                    
                }
                else
                {
                    System.out.println(" ");
                    System.out.println("saco un 1, pierde sus puntos");
                    System.out.println(":C");
                    puntaje1 -= comprobador;
                    p1 = 2;
                }

            }
            

            System.out.println("=============================");
            System.out.println("Jugador 2:");
            while (p2 != 2)
            {
                int random1 = random.nextInt(6) + 1;
                int random2 = random.nextInt(6) + 1;
                System.out.println("Dado 1: ");
                System.out.println(random1);
                System.out.println("Dado 2: ");
                System.out.println(random2);

                dado2.setValor(random1);
                dado2.setValor2(random2);

                if (dado2.getValor() != 1 && dado2.getValor2() != 1)
                {
                    int suma = dado2.getValor() + dado2.getValor2();
                    puntaje2 += suma;
                    comprobador2 += suma;
                    System.out.println("Su puntaje actual es de: ");
                    System.out.println(puntaje2);
                    System.out.println(" ");

                     if (puntaje2 >= 100)
                    {
                        System.out.println("***");
                        System.out.println("Jugador 2 gano");
                        System.out.println("***");
                        hola = 2;
                        p1 = 2;
                        p2 = 2;
                    }

                    else
                    {
                        if (comprobador2 >= 20)
                        {
                            System.out.println("Su ronda termino, ya obtuvo mas de 20 puntos");
                            p2 = 2;
                        }

                        else
                        {
                        System.out.println("Desea tirar otra vez?, 1.si  2.no");
                        int opcion = teclado.nextInt();
                        if (opcion == 2)
                        {
                            p2 = 2;
                        }
                        }

                    }

                    
                }
                else
                {
                    System.out.println(" ");
                    System.out.println("saco un 1, pierde sus puntos");
                    System.out.println(":c");
                    puntaje2 -= comprobador2;
                    p2 = 2;
                }


            }
        }
        System.out.println("Gracias por jugar");
    }
    
}