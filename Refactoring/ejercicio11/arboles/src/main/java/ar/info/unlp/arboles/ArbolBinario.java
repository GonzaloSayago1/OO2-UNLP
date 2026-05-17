package ar.info.unlp.arboles;

public class ArbolBinario implements IArbol{
    private int valor;
    private IArbol hijoIzquierdo;
    private IArbol hijoDerecho;

    public ArbolBinario(int valor) {
        this.valor = valor;
        this.hijoIzquierdo = ArbolVacio.getInstance();
        this.hijoDerecho = ArbolVacio.getInstance();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public IArbol getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(IArbol hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public IArbol getHijoDerecho() {
        return hijoDerecho;
    }

    public void setDerecha(IArbol hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

   public String recorrerPreorden() {
        return valor + " - " + this.getHijoIzquierdo().recorrerPreorden() + this.getHijoDerecho().recorrerPreorden();
    }

   public String recorrerInorden() {
        return this.getHijoIzquierdo().recorrerInorden() + valor + " - " + this.getHijoDerecho().recorrerInorden();
    }

   public String recorrerPostorden() {
        return this.getHijoIzquierdo().recorrerPostorden() + this.getHijoDerecho().recorrerPostorden() + valor + " - ";
    }
}

