package uni.edu.pe.parcial;


import java.util.Objects;

public class Producto {
    private String descripcion;
    private int cantidad;
    private double precio;

    public Producto() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 1) {
            throw new FerreteriaException("El precio no peude ser negativo");
        }
        this.precio = precio;
    }

    public Producto(String descripcion, int cantidad, double precio) {
        if (descripcion == null || cantidad < 1|| precio < 1) {
            throw new FerreteriaException("mensaje descriptivo");
        }

        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "(" +
                descripcion + ";" +
                cantidad + ";" +
                precio + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(descripcion.toLowerCase()
                , producto.descripcion.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion);
    }
}
