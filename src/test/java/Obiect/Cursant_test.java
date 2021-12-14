package Obiect;

import org.checkerframework.checker.units.qual.C;
import org.junit.Test;

import java.util.Arrays;

public class Cursant_test {

    @Test
    public void testAutomat(){
     //declaram un obiect de tipul cursant

        System.out.println("--- Obiectul Madalina ---");
        Cursant Madalina=new Cursant("Boros", "Madalina", 26,
                false, 5000.0, Arrays.asList("Manual Testing", "Automation Testing", "Java"));
        Madalina.dateCursantCursuri();
        Madalina.prenume="Mara";
        Madalina.dateCursantCursuri();
        Madalina.verificaVarstaCursant();
        Madalina.varsta=17;
        Madalina.dateCursantCursuri();
        Madalina.verificaVarstaCursant();


        System.out.println("--- Obiectul Gabriela ---");
        Cursant Gabriela=new Cursant("Salajan", "Gabriela", 18, false, 5000.0,
                Arrays.asList("Database", "Automation Testing"));
        Gabriela.dateCursantCursuri();
        Gabriela.verificaVarstaCursant();

        System.out.println("---Obiectul Vlad---");
        Cursant Vlad=new Cursant("Domide", "Vlad", 35, true, 5000.0, "Devops");
        Vlad.dateCursantCurs();
        Vlad.verificaVarstaCursant();

        System.out.println("---Obiectul Paul---");
        Cursant Paul=new Cursant("Popescu", "Paul", 73, true, "Devops");
        Paul.dateCursantCurs();
        Paul.verificaVarstaCursant();
    }




}
