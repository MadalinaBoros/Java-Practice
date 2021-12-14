package AbstractizareInterfata;

public class PersoanaAngajatInterface extends PersoanaInterface implements IAngajat {


    public PersoanaAngajatInterface(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul " + nume + " " + prenume + " " + "munceste");
    }

    @Override
    public void primesteSalar() {
        System.out.println("Angajatul " + nume + " " + prenume + " " + "primeste salar");
    }
}
