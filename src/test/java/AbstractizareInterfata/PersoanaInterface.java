package AbstractizareInterfata;

public class PersoanaInterface {

    //Abstractizare = conceptul prin care definim comportamentul unei clase
    //Abstractizarea se poate realiza cu interfete sau clase abstracte
    //Se foloseste cuvantul cheie "interface"
    //o clasa implementeaza o interfata
    //o clasa poate implementa mai multe interfete
    //o interfata contine doar metode abstracte
    //nu avem constructori intr-o interfata => nu putem crea obiect
    //clasa  care implementeaza interfata, implementeaza toate metodele din interfata



    public String nume;
    public String prenume;
    public Integer varsta;

    public PersoanaInterface(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana (){
        System.out.println("Numele este: " + nume);
        System.out.println("Prenumele este: " + prenume);
        System.out.println("Varsta este: " + varsta);
    }

}
