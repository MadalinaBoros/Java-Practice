package MostenireIncapsulare;

import org.junit.Test;

import java.util.Arrays;

public class MostenireTest {

    @Test
    public void testAutomat(){
    Audi Q5 = new Audi("SUV", 4, 5, "MQB",2.0, "automata",
            "Diesel", "Q5", Arrays.asList("Radio ", "panoramic ", "servo" ), 50000.0);
    Q5.configuratieMasina();


    Audi Q7 = new Audi("SUV", 4, 5, "MQB",3.0, "automata",
                "Plug in Hybrid", "Q7", Arrays.asList("Scaune sport ", "oglinzi incalzite ",
            "volan incalzit", "senzori de parcare", "camera video asistenta parcare", "suspensie sport" ), 100000.0);
    Q7.configuratieMasina();


    vw Golf4 = new vw("Hatchback", 4, 5, "MQB", 1.4, "manuala",
            "benzina", "Germania", 8500.0, Arrays.asList("Servo, Scaune incalzite"), "Golf4");
    Golf4.configuratieMasina();


    Golf4.afiseazaOrigine();

    //la incapsularea din public in private  modificarea se face cu set
    Golf4.setModel("Golf5");

    Golf4.configuratieMasina();


    }


}
