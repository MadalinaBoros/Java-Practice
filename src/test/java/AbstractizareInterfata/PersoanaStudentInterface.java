package AbstractizareInterfata;

public class PersoanaStudentInterface extends PersoanaInterface implements IStudent {



    public PersoanaStudentInterface(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
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
