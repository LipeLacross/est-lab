import java.util.*;
public class ListaArray implements EstruturaDeDados{
    
    private int contador;
    private int[] elementos;
    
    public ListaArray(){
        elementos = new int[1000];
        contador = 0;
    }

    @Override
    public boolean insert(int chave) {
        if(contador < 1000){
            elementos[contador] = chave;
            contador++;
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int chave) {
        for (int i = chave; i <= contador; i++) {
            elementos[i] = elementos[i+1];
        }
        contador--;
        return true;
    }
    

    @Override
    public boolean search(int chave) {
        for (int i = 0; i <= contador; i++) {
            if(elementos[i] == chave){
                return true;
            }
        }
        return false;
    }

    @Override
    public int minimum() {
        int aux = elementos[0];
        for (int i = 0; i <= contador; i++) {
            if(elementos[i] < aux && elementos[i] != 0){
                aux = elementos[i];
            }
        }
        return aux;
    }

    @Override
    public int maximum() {
        int aux = elementos[0];
        for (int i = 0; i <= contador; i++) {
            if(elementos[i] > aux){
                aux = elementos[i];
            }
        }
        return aux;
    }

    @Override
    public int sucessor(int chave) {
        for (int i = 0; i < contador; i++) {
            if(elementos[i] == chave){
                return elementos[i+1];
            }
        }
        return 0;
    }

    @Override
    public int prodessor(int chave) {
        for (int i = 0; i < contador; i++) {
            if(elementos[i] == chave){
                return elementos[i-1];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        r.insert(10);
        r.insert(5);
        r.insert(9);
        System.out.println(r.search(5));
        System.out.println(r.maximum()); 
        System.out.println(r.minimum());
        System.out.println(r.prodessor(9));
        System.out.println(r.sucessor(10));
    }
}