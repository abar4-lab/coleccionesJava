
/**
 * Write a description of class ModeloHaspMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
package gestionalmacen01.modelo;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class ModeloHashMap implements ModeloAbs {

    private HashMap<Integer, Producto> mapa;

    public ModeloHashMap() {
        mapa = new HashMap<>();
    }

    @Override
    public boolean insertarProducto(Producto p) {

        if (p == null) return false;

        // evitar duplicados
        if (mapa.containsKey(p.getCodigo())) {
            return false;
        }

        mapa.put(p.getCodigo(), p);
        return true;
    }

    @Override
    public boolean borrarProducto(int codigo) {

        if (mapa.containsKey(codigo)) {
            mapa.remove(codigo);
            return true;
        }

        return false;
    }

    @Override
    public Producto buscarProducto(int codigo) {
        return mapa.get(codigo);
    }

    @Override
    public boolean modificarProducto(Producto nuevo) {

        if (nuevo == null) return false;

        if (mapa.containsKey(nuevo.getCodigo())) {
            mapa.put(nuevo.getCodigo(), nuevo);
            return true;
        }

        return false;
    }

    @Override
    public void imprimirProductosTodos() {

        for (Producto p : mapa.values()) {
            System.out.println(p);
        }
    }

    @Override
    public List<Producto> obtenerProductos() {
        return new ArrayList<>(mapa.values());
    }

    @Override
    public List<Producto> obtenerProductosStockMin() {

        List<Producto> resultado = new ArrayList<>();

        for (Producto p : mapa.values()) {
            if (p.getStock() < p.getStock_min()) {
                resultado.add(p);
            }
        }

        return resultado;
    }
}