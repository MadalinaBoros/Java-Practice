package ClasaAbstracta;

import org.junit.Test;

public class AbstractTest {

    @Test
    public void TestAutomat(){
        PersoanaStudentAbstract Student = new PersoanaStudentAbstract("Boros", "Madalina",21 );
        Student.invata();
        Student.mergeLaCurs();

        PersoanaAngajatAbstract Angajat = new PersoanaAngajatAbstract("Popescu", "Maria", 85);
        Angajat.munceste();
        Angajat.primesteSalar();

        PersoanaStudentAbstract AngajatStudent = new PersoanaStudentAngajatAbstract("Pop", "Gabriela", 41);
        AngajatStudent.primesteSalar();
        AngajatStudent.munceste();
        AngajatStudent.invata();
        AngajatStudent.mergeLaCurs();

        AngajatStudent.detaliiVarsta(21);
    }


}
