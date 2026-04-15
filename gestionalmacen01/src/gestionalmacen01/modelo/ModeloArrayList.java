/** Implementa la parte de Modelo de Datos
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
package gestionalmacen01.modelo;

import java.util.ArrayList;
import java.util.List;

public class ModeloArrayList implements ModeloAbs {

    protected ArrayList<Producto> lista;

    public ModeloArrayList() {
        lista = new ArrayList<>();
    }

    @Override
    public boolean insertarProducto(Producto p) {
        if (p == null) return false;

        // evitar duplicados por código
        if (buscarProducto(p.getCodigo()) != null) {
            return false;
        }

        return lista.add(p);
    }

    @Override
    public boolean borrarProducto(int codigo) {
        Producto p = buscarProducto(codigo);
        if (p != null) {
            return lista.remove(p);
        }
        return false;
    }

    @Override
    public Producto buscarProducto(int codigo) {
        for (Producto p : lista) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean modificarProducto(Producto nuevo) {
        if (nuevo == null) return false;

        Producto existente = buscarProducto(nuevo.getCodigo());
        if (existente != null) {
            existente.setNombre(nuevo.getNombre());
            existente.setStock(nuevo.getStock());
            existente.setStock_min(nuevo.getStock_min());
            existente.setPrecio(nuevo.getPrecio());
            return true;
        }
        return false;
    }

    @Override
    public void imprimirProductosTodos() {
        for (Producto p : lista) {
            System.out.println(p);
        }
    }

    @Override
    public List<Producto> obtenerProductos() {
        return lista;
    }

    @Override
    public List<Producto> obtenerProductosStockMin() {
        List<Producto> resultado = new ArrayList<>();

        for (Producto p : lista) {
            if (p.getStock() < p.getStock_min()) {
                resultado.add(p);
            }
        }

        return resultado;
    }
}