package uni.edu.pe.parcial;

import java.util.ArrayList;
import java.util.List;

public class FerreteriaOfertaConRestriccion extends Ferreteria{
    private ArrayList<String> productosOferta;
    private TipoRestriccion tipoRestriccion;

    public FerreteriaOfertaConRestriccion(TipoRestriccion tipoRestriccion, List<String> prodctosOferta) {
        this.tipoRestriccion = tipoRestriccion;
        this.productosOferta = (ArrayList<String>) prodctosOferta;
    }

    @Override
    public double calcSumaPrecio(int minimo, int maximo) {
         super.productos.forEach(producto -> {
             double precio = producto.getPrecio() / 2;
             if (this.productosOferta.contains(producto.getDescripcion())) {
                 producto.setPrecio(precio);
             }
         });


        return super.calcSumaPrecio(minimo, maximo);
    }
}
