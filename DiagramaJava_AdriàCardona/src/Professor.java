public class Professor extends Persona {

    private String departament;

    private String carrec;

    public Professor(String departament, String carrec, String nom, String cognoms, String email) {
        super(nom, cognoms, email);
        this.departament = departament;
        this.carrec = carrec;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getCarrec() {
        return carrec;
    }

    public void setCarrec(String carrec) {
        this.carrec = carrec;
    }
    
}
