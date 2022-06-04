package uni.edu.pe.parcial;

import java.util.ArrayList;

public class RestriccionTipoProducto implements TipoRestriccion{

    private ArrayList<String> nombreProdRestringidos;

    public RestriccionTipoProducto(ArrayList<String> nombreProdRestringidos) {
        this.nombreProdRestringidos = nombreProdRestringidos;
    }

    @Override
    public boolean valida(Producto producto) {
        return this.nombreProdRestringidos
                .contains(producto.getDescripcion());
    }
}
