package Polimorfism;

public class Student {

    //Polimorfismul este de doua feluri:
    //Dinamic/Overriding
    //Static/Overloading
    //Polimorfism dinamic: intr-o ierarhie de clase obtinute printr-o mostenire, o metoda poate avea implementari diferite
    //Polimorfism static: conceptul prin care putem avea mai multe metode cu acelasi nume si diferentierea se face prin numele de parametrii sau tipul de parametrii


    private String nume;
    private String prenume;
    private String adresa;

    public Student(String nume, String prenume, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    //polimorfism dinamic
    public void afiseazaInfoStudent(){
        System.out.println("Detaliile despre student sunt: " + getNume() + " " + getPrenume() + " " +  getAdresa());
    }





}
