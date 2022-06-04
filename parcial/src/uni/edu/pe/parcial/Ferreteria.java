package uni.edu.pe.parcial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ferreteria {
    protected ArrayList<Producto> productos;

    public Ferreteria() {
    }

    public void anhiadirProducto(Producto producto){
        int index = this.productos.indexOf(producto);
        if (index == -1) {
           this.productos.add(producto);
           return;
        }
        producto.setPrecio(this.productos
               .get(index)
               .getPrecio());

        this.productos.set(index, producto);
    }

    public void eliminar(String descripcion){
        Producto producto = new Producto();
        producto.setDescripcion(descripcion);

        this.productos.remove(producto);
    }

    public List<Producto> seleccionar(int minimo, int maximo) {
       return this.productos.stream()
               .filter(producto -> producto.getCantidad() <= maximo && producto.getCantidad() >= minimo)
               .collect(Collectors.toList());
    }

    public double calcSumaPrecio(int minimo,int maximo){
         return seleccionar(minimo, maximo)
                .stream()
                .map(Producto::getPrecio)
                .reduce(0d, Double::sum);
    }

    @Override
    public String toString() {
        return "" + productos;
    }
}
