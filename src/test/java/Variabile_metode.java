import org.junit.Test;

public class Variabile_metode {


    //println=rand nou
    //sout=prescurtare pentru System.out.print

    //Clasa, Variabila, Metoda, Constructor, Obiect
    //1.Clasa=este un sablon ce contine variabile, metode, constructor, obiect.
    //2.Variabila=atributul unei clase.
    //3.Metoda=actiunile unei clase.
    //1.Structura clasa=access control class nume clasa {}
    //1.Un fisier Java poate sa contina mai multe clase
    //1.Numele clasei trebuie sa fie unic
    //2.Tipuri variabile=global si local
    //2.Variabila globala=este vizibila peste tot in clasa declarata
    //2.Structura variabila globala=access control tip variabila nume variabila;
    //2.O variabila poate sau nu sa primeasca o valoare
    //2.Structura variabila locala=tip variabila nume variabila
    //Exemplu: declaram variablie in interiorul clasei
    //3.Tipuri de metode=Void, return
    //3.In Java exista doar metode(declarate in interiorul unei clase) nu si functii
    //3.Metodele pot avea sau nu parametrii
    //3.Structura metoda void=access control void nume metoda(){}
    //la metoda return este de preferat sa punem get in fata
    //returnam salarul unui angajat
    //structura metoda return: public tipul de returnare, nume(){return}
    //daca vrem sa returnam anumite date punem get in fata !!

    public String nume;
    public String prenume;
    public Integer varsta;
    public Double inaltime;
    public String adresa;
    public Boolean esteAngajat;
    public Double greutate;


    @Test
    public void atribuiValori(){
        nume="Boros";
        prenume="Madalina";
        varsta=26;
        inaltime=1.69;
        adresa="Aurel Vlaicu nr. 36";
        esteAngajat=false;
        greutate=52.00;


        System.out.print(nume+" ");
        System.out.print(prenume);
        System.out.println(" "+esteAngajat+" ");

        System.out.println(varsta+" "+inaltime+" "+adresa);

        System.out.println(nume);
        System.out.println(nume+System.lineSeparator()+prenume);

        //Afisati pe tastatura mesajul:Cursantul <nume> <prenume> a trimis proiectul la manual.
        System.out.println("Cursantul "+nume+ " "+prenume+ " a trimis proiectul la manual.");

        //Definim cate zecimale sa ne afiseze pentru o valoare cu punct.
        System.out.println(String.format("%.2f",greutate));

        System.out.println(getSalarAngajat());

    }


    public Double getSalarAngajat(){
        Double salar = 10000.0;
        Double bonus = 5000.0;
        Double calcul = salar * bonus;
        return calcul;

    }



}
