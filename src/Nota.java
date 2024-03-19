import java.util.UUID;
public class Nota {
    private String testo;
    private String id;

    public Nota( String testo) {
        this.testo = testo;
       // this.id = id;
        this.id = UUID.randomUUID().toString();
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String getTesto() {
        return testo;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "testo='" + testo + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String  getId() {
        return id;
    }
}

