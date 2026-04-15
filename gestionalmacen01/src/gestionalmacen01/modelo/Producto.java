
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
package gestionalmacen01.modelo;
public class Producto {

    int codigo;
    String nombre;
    int stock;
    int stock_min;
    float precio;

    // Constructor completo (EL IMPORTANTE)
    public Producto(int codigo, String nombre, int stock, int stock_min, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.stock_min = stock_min;
        this.precio = precio;
    }

    // Constructor opcional básico
    public Producto(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        nombre = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int valor) {
        codigo = valor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int valor) {
        if (valor >= 0) {
            stock = valor;
        }
    }

    public int getStock_min() {
        return stock_min;
    }

    public void setStock_min(int valor) {
        if (valor >= 0) {
            stock_min = valor;
        }
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float valor) {
        if (valor > 0) {
            precio = valor;
        }
    }

    @Override
    public String toString() {
        return String.format("| %5d | %-20.20s | %5d | min: %5d | %10.2f |",
                codigo, nombre, stock, stock_min, precio);
    }
}