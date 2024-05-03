package monitor.turista;

public class Turista extends Thread{
    private Museo m;

    public Turista(String name, Museo m) {
        super(name);
        this.m = m;
    }
    
    public void run(){
        String nome = Thread.currentThread().getName();
        try {
            int ta = 2000 +(int) (Math.random()*1000);
            Thread.sleep(ta);
            //System.out.println(nome + "dopo un tempo di: " + ta/1000 + " secondi");
            int t = m.guarda();
            Thread.sleep(t);
            System.out.println(nome + " guarda il quadro per: " + t/1000 + " secondi");
            m.esci();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
