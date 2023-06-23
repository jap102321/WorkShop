import Embarcaciones.Capitan;
import Embarcaciones.Embarcacion;
import Embarcaciones.Velero;
import Embarcaciones.Yate;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Capitan cap1 = new Capitan("Calvoniel", "Zidane", 1230202);
        Capitan cap2 = new Capitan("Cabezon", "Torres", 1230202);

        Embarcacion velero1 = new Velero(2500, cap1, 25,
                LocalDate.of(2021, 5, 10), 5);

        Yate yate1 = new Yate(2700, cap2, 25, LocalDate.of(2021, 3, 5), 9);

        yate1.comprarEmbarcacion();

        System.out.println(yate1.toString());

    }
}
