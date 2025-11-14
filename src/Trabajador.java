public class Trabajador {
    private String nombre;
    private int horas;
    private char sexo;
    public Trabajador(String nombre, int horas, char sexo) {
        this.nombre = nombre;
        this.horas = horas;
        this.sexo = sexo;
    }
    public int getHoras() {
        return this.horas;
    
}
public String getNombre() {
        return this.nombre;
    }
    public char getSexo() {
        return this.sexo;
    }
    @Override
    public String toString() {
        return nombre+"\t"+horas;
    }
}
