package MostenireIncapsulare;

import java.util.List;

public class Audi extends Masina {

    private String model;
    private List<String> dotari;
    private Double pret;


    public Audi(String caroserie, Integer roti, Integer usi, String sasiu, Double motorizare, String transmisie, String combustibil, String model, List<String> dotari, Double pret) {
        super(caroserie, roti, usi, sasiu, motorizare, transmisie, combustibil);
        this.model=model;
        this.dotari=dotari;
        this.pret=pret;

    }

    // get si set se poate genera cu click dreapta getter and setter

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<String> getDotari() {
        return dotari;
    }

    public void setDotari(List<String> dotari) {
        this.dotari = dotari;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }



    public void configuratieMasina(){
        System.out.println("Masina Audi cu modelul: " + getModel()+ " are urmatoarea configuratie: ");
        System.out.println(toString());

    }
    //cand modificam o clasa din public in private adaugam get in fata datelor
    //intr-o ierarhie de clase
    @Override
    public String toString() {
        return "Audi{" +
                "model='" + getModel() + '\'' +
                ", dotari=" + getDotari() +
                ", pret=" + getPret() +
                ", caroserie='" + getCaroserie() + '\'' +
                ", roti=" + getRoti() +
                ", usi=" + getUsi() +
                ", sasiu='" + getSasiu() + '\'' +
                ", motorizare=" + getMotorizare() +
                ", transmisie='" + getTransmisie() + '\'' +
                ", combustibil='" + getCombustibil() + '\'' +
                '}';
    }

}


//String integeer se numesc parametrii