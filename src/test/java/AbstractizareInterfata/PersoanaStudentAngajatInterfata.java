package AbstractizareInterfata;

public class PersoanaStudentAngajatInterfata extends PersoanaInterface implements IAngajat, IStudent{


    public PersoanaStudentAngajatInterfata(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul " + nume + " " + prenume + " " + "munceste");
    }

    @Override
    public void primesteSalar() {
        System.out.println("Angajatul " + nume + " " + prenume + " primeste salar.");
    }

    @Override
    public void invata() {
        System.out.println("Studentul " + nume + " " + prenume + " invata.");
    }

    @Override
    public void mergeLaCurs() {
        System.out.println("Studentul " + nume + " " + prenume + " merge la curs.");
    }
}
