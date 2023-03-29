package Interfaz;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera implements Juego { 
        private int alfa;
        private String player;
        private int escoge;
        Scanner Lectura=new Scanner(System.in);
        
    public void iniciar(){
        System.out.println("Por favor digita tu nombre ");
        player=Lectura.next();
    }
    public void jugar(){
    System.out.println(player+" Por favor, realiza tu eleccion \n 1.Piedra \n 2.Papel \n 3.Tijera");
      escoge=Lectura.nextInt(); 
      Random aleatorio=new Random();
      alfa=aleatorio.nextInt(3)+1;
      System.out.println("Resultados: ");
    }
    public void finalizar(){
        if(alfa==1 && escoge==1){
            System.out.println("La maquina saco Piedra, Has empatado "+player);
        }
        else if(alfa==2 && escoge==1){
            System.out.println("La maquina saco Papel, Has perdido  "+player);
        }
        else if(alfa==3 && escoge==1){
            System.out.println("La maquina saco Tijera, Has ganado "+player);
        }
        else if(alfa==1 && escoge==2){
            System.out.println("La maquina saco Piedra, Has ganado "+player);
        }
        else if(alfa==2 && escoge==2){
            System.out.println("La maquina Papel, Has empatado "+player);
        }
        else if(alfa==3 && escoge==2){
            System.out.println("La maquina saco Tijera, Has perido "+player);
        }
        else if(alfa==1 && escoge==3){
            System.out.println("La maquina saco Piedra, Has perdido "+player);
        }
        else if(alfa==2 && escoge==3){
            System.out.println("La maquina saco Papel, Has ganado "+player);
        }
        else if(alfa==3 && escoge==3){
            System.out.println("La maquina saco Tijera, Has empatado "+player);
        }
        
    }
    }
