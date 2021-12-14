package Obiect;

import java.util.List;

public class Cursant {

    //obiect=reprezinta instanta unei clase
    //dintr-o clasa putem declara n obiecte
    //ca sa initializam un obiect folosim cuvantul cheie new
    //structura obiect=nume clasa + nume obiect = new + nume clasa(se va apela constructorul clasei) +(se vor da valori pt variabile daca exista)
    //ex: Cursant Madalina=new Cursant ()
    //constructor= are ca si rol sa initializeze atributele unei clase
    //intr-o clasa putem defini n constructori diferentiati prin parametrii sau numar de parametrii
    //constructorii dintr-o clasa trebuie sa fie publici
    //structura constructor=public nume clasa(definim parametrii daca avem nevoie){}
    //in cazul in care nu declaram un constructor => este 1 by default (constructor implicit)
    //this=pointeza catre variabila din interiorul clasei (se aplica doar daca avem doua variabile cu acelasi nume)


    public String nume;
    public String prenume;
    public Integer varsta;
    public Boolean esteAngajat;
    public Double taxa;
    public List<String> cursuri;
    public String curs;


    public Cursant(String nume, String prenume, Integer varsta, Boolean esteAngajat, Double taxa, List<String> cursuri){
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.esteAngajat=esteAngajat;
        this.taxa=taxa;
        this.cursuri=cursuri;
    }

    public Cursant(String nume, String prenume, Integer varsta, Boolean esteAngajat, Double taxa, String curs){
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.esteAngajat=esteAngajat;
        this.taxa=taxa;
        this.curs=curs;
    }

    public Cursant(String nume, String prenume, Integer varsta, Boolean esteAngajat, String curs){
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.esteAngajat=esteAngajat;
        this.curs=curs;
    }

    public void dateCursantCursuri(){
        System.out.println("Numele cursantului este " + nume);
        System.out.println("Prenumle cursantului este " + prenume);
        System.out.println("Varsta cursantului este? " + varsta);
        System.out.println("Este cursantul angajat? " + esteAngajat);
        System.out.println("Taxa de plata " + taxa);
        System.out.println("Cursurile la care doreste sa participe sunt: ");
        for (String curs: cursuri){
            System.out.println(curs);
        }
    }

    public void dateCursantCurs(){
        System.out.println("Numele cursantului este " + nume);
        System.out.println("Prenumele cursantului este " + prenume);
        System.out.println("Varsta cursantului este? " + varsta);
        System.out.println("Este cursantul angajat? " + esteAngajat);
        System.out.println("Taxa de plata " + taxa);
        System.out.println("Cursul la care doreste sa participe este: " + curs);

    }

    public void verificaVarstaCursant(){
        if (varsta>=65){
            System.out.println("Cursantul este pensionar");
        }
        else if (varsta>=18){
            System.out.println("Cursantul este major");
        }
        else {
            System.out.println("Cursantul nu este major");
        }

    }





}
