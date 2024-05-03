package monitor.turista;

public class Main {
    public static void main(String[] args) {
        Museo m = new Museo();
        String[] nomi= {"Turista1", "Turista2", "Turista3", "Turista4", "Turista5", "Turista6", "Turista7", "Turista8", "Turista9", "Turista10", "Turista11", "Turista12", "Turista13", "Turista14", "Turista15", "Turista16", "Turista17", "Turista18", "Turista19", "Turista20"};

        for(int i=0;i<nomi.length;i++){
            Turista t = new Turista(nomi[i], m);
            t.start();
        }
    }
}