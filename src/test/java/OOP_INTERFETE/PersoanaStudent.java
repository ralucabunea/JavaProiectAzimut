package OOP_INTERFETE;

public class PersoanaStudent extends PersoanaInterfata implements Student{

    //click dr pentru a apela la super

    public PersoanaStudent(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void Invata(){
        System.out.println("Studentul " + getNume() +" " + getPrenume() + "invata");
    }

    @Override
    public void PrimesteBursa() {
        System.out.println("Studentul " + getNume() +" " + getPrenume() + "primeste bursa");

    }
}
