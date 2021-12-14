package AbstractizareInterfata;

import org.junit.Test;

public class InterfaceTest {
    @Test
    public void testAutomat(){

        PersoanaStudentInterface Student = new PersoanaStudentInterface("Boros", "Madalina",21 );
        Student.invata();
        Student.mergeLaCurs();

        PersoanaAngajatInterface Angajat = new PersoanaAngajatInterface("Popescu", "Maria", 85);
        Angajat.munceste();
        Angajat.primesteSalar();

        PersoanaStudentAngajatInterfata AngajatStudent = new PersoanaStudentAngajatInterfata("Pop", "Gabriela", 41);
        AngajatStudent.primesteSalar();
        AngajatStudent.munceste();
        AngajatStudent.invata();
        AngajatStudent.mergeLaCurs();

    }


}
