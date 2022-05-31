package OOP_INTERFETE;

public class PersoanaInterfata {

    //abstractizare= concept pe baza caruia se def comportamentul unei clase
    //conceptul se poate face cu interfete sau clase abstracte

    private String Nume;
    private String Prenume;
    private String Meserie;

    public PersoanaInterfata(String nume, String prenume, String meserie) {
        Nume = nume;
        Prenume = prenume;
        Meserie = meserie;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public void setPrenume(String prenume) {
        Prenume = prenume;
    }

    public String getMeserie() {
        return Meserie;
    }

    public void setMeserie(String meserie) {
        Meserie = meserie;
    }
}
