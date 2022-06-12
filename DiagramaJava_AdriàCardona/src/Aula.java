public class Aula {

    private String nom;

    private int capacidadMaximaAlumnes;

    private int quantitatOrdinadors;

    public void comprobarOrdinadorsAula() {
    }

    public void comprobarAlumnesAula() {
    }

    public Aula(String nom, int capacidadMaximaAlumnes, int quantitatOrdinadors) {
        this.nom = nom;
        this.capacidadMaximaAlumnes = capacidadMaximaAlumnes;
        this.quantitatOrdinadors = quantitatOrdinadors;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacidadMaximaAlumnes() {
        return capacidadMaximaAlumnes;
    }

    public void setCapacidadMaximaAlumnes(int capacidadMaximaAlumnes) {
        this.capacidadMaximaAlumnes = capacidadMaximaAlumnes;
    }

    public int getQuantitatOrdinadors() {
        return quantitatOrdinadors;
    }

    public void setQuantitatOrdinadors(int quantitatOrdinadors) {
        this.quantitatOrdinadors = quantitatOrdinadors;
    }
    
}
