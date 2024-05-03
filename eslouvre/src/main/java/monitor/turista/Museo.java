package monitor.turista;

public class Museo {
    private int persMax =5;

    public synchronized int guarda(){
        String nome = Thread.currentThread().getName();

        try {
            while(persMax==0){
                //System.out.println("Museo pieno");
                wait();
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        persMax--;
        return 1000 + (int) (Math.random()*5000);
    }

    public synchronized void esci(){
        String nome = Thread.currentThread().getName();
        persMax++;
        notifyAll();
    }
    
}
