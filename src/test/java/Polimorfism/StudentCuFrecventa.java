package Polimorfism;

public class StudentCuFrecventa extends Student {

    public StudentCuFrecventa(String nume, String prenume, String adresa) {
        super(nume, prenume, adresa);
    }

    //in cazul de fata avem doua metode cu acelasi nume dar cu parametrii diferiti !!!!!

    public void mediaStudentului (Integer notaUnu, Integer notaDoi){
        Integer medie=(notaUnu+notaDoi)/ 2;
        System.out.println("Media studentului cu frecventa este: " + medie);
    }

    public void mediaStudentului (Integer notaUnu, Integer notaDoi, Integer notaTrei){
        Integer medie=(notaUnu + notaDoi + notaTrei)/ 3;
        System.out.println("Media studentului cu frecventa este: " + medie);
    }

    @Override

    //Override face referire la continut
    // Expl: ("Detalii despre student sunt: " + getNume() + " " + getPrenume() + " " +  getAdresa()

    public void afiseazaInfoStudent(){
        System.out.println("Detaliile despre studentul cu frecventa sunt: " + getNume() + " " + getPrenume() + " " +  getAdresa());
    }

    public void afiseazaInfoInitial(){
        super.afiseazaInfoStudent();
    }
}


