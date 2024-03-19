//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Nota nota1 = new Nota("nota numero 1");
        Nota nota2 = new Nota("nota numero 2");
        Nota nota3 = new Nota("nota numero 3");
        Nota nota4 = new Nota("nota numero 4");

        BloccoNote blocconote1 = BloccoNote.getInstance();
        blocconote1.aggiungiNota(nota1);
        blocconote1.aggiungiNota(nota2);
        blocconote1.aggiungiNota(nota3);
        blocconote1.aggiungiNota(nota4);
        blocconote1.rimuoviNota(nota1);
        //blocconote1.modificaNota(nota2,"nota numero 8");
        nota2.setTesto("nota num 8");

        blocconote1.stampaNote();
        System.out.println(blocconote1.modificaNotaById(nota2.getId(),"nota 100"));

        }
    }
