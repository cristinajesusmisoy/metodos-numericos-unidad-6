package unidad6;

import java.util.ArrayList;


public class MetEuler {

    public ArrayList<clsEuler> MetodoEuler(double y, double x, double e, int iteracion) {

        double valor1 = y;//1
        double valor2 = x;//0
        double valor3 = e;//4
        double valor4 = y/e;

        ArrayList<clsEuler> lista;

        double h = valor3 + valor2;
        lista = new ArrayList<clsEuler>();

        int c = 0;
        for (int i = 0; i < (valor4 + 1); i++) {

            clsEuler fila = new clsEuler();
            fila.setI(c++);

            if (i == 0) {
                fila.setX(valor2);
                fila.setY(y);
            } else {
                fila.setY(valor1 + h * this.Equation(valor2));
                valor1 = fila.getY();
                fila.setX(valor2 + h);
                valor2 = fila.getX();
            }
            lista.add(fila);

        }
        return lista;
    }

    public double Equation(double x) {
        // return -2 * Math.pow(x, 3) + 12 * Math.pow(x, 2) - 20 * x + 8.5;
       return  1 + Math.pow(x, 1) * (0.2);
    }

}
