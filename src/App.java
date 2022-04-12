public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inizio esecuzione");
        System.out.println(Thread.currentThread().getName());
        
        
        //primo thread
        Contatore c1 = new Contatore(10, "T1");
        Thread t1 = new Thread(c1);
        t1.start();
        
        //secondo thread
        Contatore c2 = new Contatore(10, "T2");
        Thread t2 = new Thread(c2);
        t2.start();

        //riunisce
        //c1.join();
        //c2.join();

        System.out.println("fine esecuzione");
    }
 
}
