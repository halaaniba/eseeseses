import java.util.ArrayList;
import java.util.Objects;

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
   public void rimuoviNota(Nota nota){
       note.remove(nota);
   }
   public void modificaNota(Nota nota, String testo){
      nota.setTesto(testo);
   }
   public Nota modificaNotaById(String id, String testo) {

       for (Nota nota : note) {
           if (Objects.equals(id, nota.getId())) {
               nota.setTesto(testo);
               return nota;
           }
       }
       return null;
   }

   public void stampaNote(){
       for (Nota nota : note) {
           System.out.println(nota.getId());
           System.out.println(nota.getTesto());
       }
   }
   public Nota getNoteById (String id ){
       for (Nota nota : note) {
          if (Objects.equals(id, nota.getId())){
              return nota;
          }
       }
       return null;
   }

}
