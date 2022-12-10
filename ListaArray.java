public class ListaArray implements EstruturaDeDados{
    private int[] elementos;
    private int contador;
    private int chave;

    public ListaArray()
    {
        elementos = new int[1000];
        contador = 0;
    }

    @Override
    public boolean insert(int chave) {
        this.chave = chave;
        if(contador <= 1000){
            elementos[contador++]= chave;
            return true;
        }
        else
        {
            System.out.println("Array overflow");
            return false;
        }
    }

    @Override
    public boolean delete(int chave) { 
        this.chave = chave;
        int[] arr_old = elementos;
        int[] arr_new = new int[arr_old.length - 1];
        for(int i=  0, k = 0; i < arr_old.length; i++)
        {
            if(arr_old[i] != chave){
                arr_new[k] = arr_old[i];
                k++;
                System.out.println("Elemento apagado.");
                return true;
            }
            else
            {
                System.out.println("Elemento não encontrado.");
                return false;
            }

        }
        return false;
    }

    @Override
    public boolean search(int chave) {
        this.chave = chave;
        for (int i = 0; i < elementos.length; i++)
        {
            if (elementos[i] == chave)
            {
                System.out.println("Elemento encontrado. Está no índice: " + i + " Da lista.");
                return true;
            }
            else
            {
                System.out.println("Elemento não encontrado.");
                return false;
            }
        }
        return false;
    }

    @Override
    public int minimum() {
        int number = 999999;
        for (int i = 0; i < elementos.length; i++)
        {
            if (elementos[i] < number)
            {
                number = elementos[i];
            }
        }
        System.out.println("O menor elemento da lista é o " +  number);
        return 0;
    }

    @Override
    public int maximum() {
        int number = 0;
        for (int i = 0; i < elementos.length; i++)
        {
            if (elementos[i] > number)
            {
                number = elementos[i];
            }
        }
        
        System.out.println("O maior elemento da lista é o " +  number);
        return 0;
    }

    @Override
    public int sucessor(int chave) {
        this.chave = chave;
        for (int i = 0; i < elementos.length; i++)
        {
            if (elementos[i] == chave)
            {
                System.out.println("Elemento encontrado. Seu sucessor é " + elementos[i + 1]);
            }
            else
            {
                System.out.println("Elemento não encontrado.");
            }
        }
        return 0;
    }

    @Override
    public int prodessor(int chave) {
        this.chave = chave;
        for (int i = 0; i < elementos.length; i++)
        {
            if (elementos[i] == chave)
            {
                System.out.println("Elemento encontrado. Seu predecessor é " + elementos[i - 1]);
            }
            else
            {
                System.out.println("Elemento não encontrado.");
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ListaArray r = new ListaArray();
    }
}
