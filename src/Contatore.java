public class Contatore implements Runnable{

    private int numero;
    
    public Contatore(int n, String name){
        numero = n;
    }

    public void run(){
        scriviAVideo();
    }

    public void scriviAVideo(){
        for(int i = 0; i < 10; i++){
            System.out.println("Sono" + i);
        }
    }
}
