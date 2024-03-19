import java.util.ArrayList;
public class BloccoNote {
   ArrayList<Nota>note = new ArrayList<>();
   public static BloccoNote istanza;
   private BloccoNote (){

   }
   public static BloccoNote getInstance(){
       if(istanza==null){
        istanza = new BloccoNote();
       }
       return istanza;
   }
   public void aggiungiNota(Nota nota){
       note.add(nota);
   }
}
