import java.util.UUID;
public class Nota {
    public String testo;
    public String id;

    public Nota( String testo) {
        this.testo = testo;
       // this.id = id;
        this.id = UUID.randomUUID().toString();
    }

    public String getTesto() {
        return testo;
    }

    public String  getId() {
        return id;
    }
}
