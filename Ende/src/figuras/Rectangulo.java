package figuras;

import java.awt.Color;

/**
     * La clase Rectangulo hereda de la clase Figura
     * @version Figuras
     * @author Noelia Mancha
     * @since 04/03/2024
     */

    public class Rectangulo extends Figura{
        
        /**
         * Definimos las variables base y altura que son con las que vamos a trabajar en nuestras clases y darles los valores que queramos conforme las vayamos utilizando, como ahora mismo no le hemos definido ningún valor java por defecto lo define como 0.
         */
        private double base;
        private double altura;
        
            /**
             * Cremos un constructor Rectangulo donde definimos variables pero aún no les damos valor, se lo daremos cuando llamemos al constructor.
             * @param x variable "x" a la que daremos valor más adelante.
             * @param y variable "y" a la que daremos valor más adelante.
             * @param color variable "color" a la que daremos valor más adelante.
             * @param base variable "base" a la que daremos valor más adelante , lo que si dejamos especificado es que podemos referirnos a ella también como "this.base"
             * @param altura variable "altura" a la que daremos valor más adelante , lo que si dejamos especificado es que podemos referirnos a ella también como "this.altura"
             */
            public Rectangulo (double x, double y, Color color, double base, double altura){
                super (x, y, color);
                this.base = base;
                this.altura = altura;
            }
            
            /**
             * Creamos un método getBase para poder sacar por consola el valor que especifiquemos para la variable "base" en el método "setBase" más delante.
             * @return para que nos devuelva el valor de "base" por consola.
             */
            public double getBase(){
                return base;
            }
            
            /**
             * Creamos un método getAltura para poder sacar por consola el valor que especifiquemos para la variable "base" en el método "setAltura" más delante.
             * @return para que nos devuelva el valor de "altura" por consola.
             */
            
            public double getAltura(){
                return altura;
            }
            
            /**
             * Creamos un método setBase para poder darle a la variable "base" el valor que nosotros queramos y lo saque por consola a través del método getBase.
             * @param base es la variable a la que le vamos a dar un  valor.
             */
            
            public void setBase(double base){
                this.base = base;
            }
            
            /**
             * Creamos un método setAltura para poder darle a la variable "altura" el valor que nosotros queramos y lo saque por consola a través del método getAltura.
             * @param altura es la variable a la que le vamos a dar un  valor.
             */
            public void setAltura(double altura){
                this.altura = altura;
            }
            
            /**
             * Creamos un método perimetro donde especificamos que lo que tiene que devolvernos por consola es el valor que le hayamos dado a base *2 + el valor que le hayamos dado a altura*2.
             */
            public double perimetro (){
               return 2 * base + 2 * altura;
            }
            
            /**
             * Creamos un método area donde especificamos que lo que nos tiene que devolver por consola es el resultado de multiplicar base * altura.
             */
            public double area (){ 
               return base * altura;
            }
    }