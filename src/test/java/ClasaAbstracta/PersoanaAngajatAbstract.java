package ClasaAbstracta;

public class PersoanaAngajatAbstract extends PersoanaAbstract {

    public abstract class PersoanaAbstract {

        //Clasa abstracta poate sau nu sa contina metode abstracte
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
