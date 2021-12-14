package ClasaAbstracta;

public class PersoanaStudentAbstract extends PersoanaAbstract {

    public String nume;
    public String prenume;
    public Integer varsta;

    public PersoanaStudentAbstract(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana (){
        System.out.println("Numele este: " + nume);
        System.out.println("Prenumele este: " + prenume);
        System.out.println("Varsta este: " + varsta);
    }

    @Override
    public void invata() {
        System.out.println("Studentul" + nume + " " + prenume + " invata" );
    }

    @Override
    public void mergeLaCurs() {
        System.out.println("Studentul" + nume + " " + prenume + " mergeLaCurs" );
    }

    @Override
    public void munceste() {

    }

    @Override
    public void primesteSalar() {

    }

}
