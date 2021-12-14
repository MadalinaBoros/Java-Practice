package Polimorfism;

import org.junit.Test;

public class PolimorfismTest {


    @Test
    public void testAutomat(){

        StudentFaraFrecventa Alex = new StudentFaraFrecventa("Dorha", "Alex", "Cluj, Aurel Vlaicu 100");
        Alex.mediaStudentului(5,5,5);
        Alex.mediaStudentului(6,6);
        Alex.afiseazaInfoStudent();
        Alex.afiseazaInfoInitial();

        StudentCuFrecventa Vlad = new StudentCuFrecventa("Domide", "Vlad-Calin", "Cluj, Brancusi");
        Vlad.mediaStudentului(7,4,9);
        Vlad.mediaStudentului(10,9);
        Vlad.afiseazaInfoStudent();
        Vlad.afiseazaInfoInitial();
    }








}
