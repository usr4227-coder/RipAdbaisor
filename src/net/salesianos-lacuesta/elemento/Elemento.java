public class Elemento {
    private String nombre;
    private String categoria;
    private String descripcion;
    private int puntuacion;

 public Elemento (String nombre, String categoria, String descripcion String puntuacion ) {
    this.nombre = nombre;
    this.categoria = categoria;
    this.descripcion = descripcion;
    this.puntuacion = puntuacion;
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nCategoría: " + categoria +
                "\nDescripción: " + descripcion +
                "\nPuntuación: " + puntuacion + "/5";
    }
}}
