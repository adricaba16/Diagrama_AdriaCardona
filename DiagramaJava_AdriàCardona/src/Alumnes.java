public class Alumnes extends Persona {

    private String dataNaixement;

    private int codiCicle;

    public Alumnes(String dataNaixement, int codiCicle, String nom, String cognoms, String email) {
        super(nom, cognoms, email);
        this.dataNaixement = dataNaixement;
        this.codiCicle = codiCicle;
    }

    public String getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(String dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public int getCodiCicle() {
        return codiCicle;
    }

    public void setCodiCicle(int codiCicle) {
        this.codiCicle = codiCicle;
    }
    
}
