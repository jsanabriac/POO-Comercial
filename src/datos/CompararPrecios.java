package datos;

import java.util.Comparator;


public class CompararPrecios implements Comparator<Producto>{

    @Override
    public int compare(Producto producto1, Producto producto2) {
        if(producto1.getPrecio() > producto2.getPrecio()){
        return -1;
        }else if(producto1.getPrecio() > producto2.getPrecio()){
        return 0;
        }else{
        return 1;
        }
    }
    
}
