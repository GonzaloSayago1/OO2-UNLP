package ar.info.unlp.TrianguloRectangulo;

public class TrianguloRectangulo {
       private int base;
       private int altura;

       public TrianguloRectangulo(int valorB, int valorA) {
           this.base = valorB;
           this.altura = valorA;
       }

      public int getBase() {
          return this.base;
      }
      public int getAltura() {
          return this.altura;
      }

      public double calcularArea() {
          return this.altura * this.base / 2;
      }
}