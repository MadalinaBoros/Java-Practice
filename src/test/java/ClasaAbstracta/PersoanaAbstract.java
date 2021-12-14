package ClasaAbstracta;

public abstract class PersoanaAbstract {
    //Clasa abstracta poate sau nu sa contina metode abstracte
    //Clasa care extinde o clasa abstracta trebuie sa implementeze toate metodele abstracte
    //Intr-o clasa abstracta poti sa declari un constructor, insa nu poti sa faci un obiect dintr=o clasa abstracta
    //Putem mosteni o singura clasa
    //O clasa abtrscta poate sa implementeze o interfata insa o interfata nu poate sa extinda o clasa abstracta
    //O interfata poate sa extinda o alta interfata
    //O clasa abstracta poate sa extinda o alta clasa abstracta



   public abstract void invata ();
   public abstract void mergeLaCurs();

   public abstract void munceste ();
   public abstract void primesteSalar();

   public void detaliiVarsta (Integer varsta){
       if (varsta > 18){
           System.out.println("Persoana este majora");
       }
   }






}
