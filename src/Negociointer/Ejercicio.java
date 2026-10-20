package Negociointer;

public class Ejercicio {
    private String nombre;
    private double precio;
    private String categoria;
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);}
    void mostrarCategoria() {
        System.out.println("Categoria: "+categoria);
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {

        return nombre;
    }
    /*
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    public String getprecio() {
        return precio;
    }
    */
    /*
        public void setCaregoria(String categoria) {
        this.categoria = categoria;
    }
    public String getprecio() {
        return categoria;
    }
     */
}
