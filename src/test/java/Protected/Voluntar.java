package Protected;

public class Voluntar {

    //Protected= este vizibil in clasa parinte + clasa copil chiar daca se afla in pachete diferite
    //Default este vizibil in clasa parinte + clasa copil cu conditia sa fie in interiorul pachetului
    //Protected = vizibil in momentul in care declaram un obiect intr-o alta clasa si din acelasi pachet
    //Protected = nu este vizibil in momentul in care declaram un obiect intr-o alta clasa dintr-un pachet diferit
    //Default= este vizibil in clasa parinte + clasa copil chiar daca se afla in pachete diferite
    //Default este vizibil in clasa parinte + clasa copil cu conditia sa fie in interiorul pachetului


    public String nume;
    public String prenume;

    public Voluntar(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public void metodaPublica (){
        System.out.println("Public");
    }

    private void metodaPrivata (){
        System.out.println("Privat");
    }
    protected void metodaProtected (){
        System.out.println("Protejat");
    }
    void metodaDefault (){
        System.out.println("Implicit");
    }






}
