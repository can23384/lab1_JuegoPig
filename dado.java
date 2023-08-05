/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Laboratorio #1. Juego Pig
Eliazar Canastuj
carnet: 23384
*/


public class dado{
    int valor_dado;
    int valor_dado2;

    public dado(int valor, int valor2){
        this.valor_dado = valor;
        this.valor_dado2 = valor2;
    }

    public int getValor(){
        return this.valor_dado;
    }

    public int getValor2(){
        return this.valor_dado2;
    }


    public void setValor(int valor){
        this.valor_dado = valor; 
    }

    public void setValor2(int valor2){
        this.valor_dado2 = valor2; 
    }

    
}


