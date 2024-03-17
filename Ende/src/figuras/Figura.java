package figuras;
import java.awt.Color;
    /**
     * La clase Figura es una súperclase del paquete figuras
     * @version Figuras
     * @author Noelia Mancha
     * @since 04/03/2024
     */

    public abstract class Figura{
        
        private Color color;

        /**
         * definimos la variable "Punto Centro" que es con la que vamos a trabajar en nuestras clases y darle los valores que queramos conforme las vayamos utilizando, como ahora mismo no le hemos definido ningún valor java por defecto lo define como 0.
         * definimos la variable "Color Color" que es con la que vamos a trabajar en nuestras clases y darle los valores que queramos conforme las vayamos utilizando, como ahora mismo no le hemos definido ningún valor java por defecto lo define como 0.
         *
        private Punto centro;
        private Color color;
        
        /**
         * Aquí realizamos un constructor "Figura" dónde podemos introducir el valor de "x", "y", "color" cuando llamemos a este constructor en esta clase o en cualquiera de las que tenga derivadas.
         * @param x variable para poder introducir la posición "x" de la figura
         * @param y variable para poder introducir la posición "y" de la figura
         * @param color variable para poder introducir el "color" de la figura
         */
        
            public Figura(double x, double y, Color color){
                Punto centro = new Punto (x, y);
                this.color = color;
            }
            
            /**
             * Aquí realizamos un método getXCentro para que nos devuelda el valor de "x".
             * @return es para que nos devuelva el valor de "x" por consola que introduzcamos en el método setXcentro.
             */
            public double getXCentro(){
                Punto centro = null;
                return centro.getX();
            }
            
            /**
             * Aquí realizamos un método getYCentro para que nos devuelda el valor de "y".
             * @return es para que nos devuelva el valor de "y" por consola que hemos introducido en el método setYcentro.
             */
            
            public double getYCentro(){
                Punto centro = null;
                return centro.getY();
            }
            
            /**
             * Aquí realizamos un método getColor para que nos devuelva el "color".
             * @return es para que nos devuelva por consola el color que hemos definido para nuestra figura a través del método setColor.
             */
            public Color getColor(){
                return color;
            }
            
            /**
             * Aquí creamos un método setXCentro para poder darle a la variable "x" el valor que queramos y mostrar ese valor a través del método getXCentro por consola.
             * @param x es la variable a la que le vamos a dar el valor.
             */
            public void setXCentro(double x){
                Punto centro = null;
                centro.setX (x);
            }
            
            /**
             * Aquí creamos un método setYCentro para poder darle a la variable "y" el valor que queramos y mostrar ese valor a través del método getYCentro por consola.
             * @param y es la variable a la que le vamos a dar el valor.
             */
            
            public void setYCentro(double y){
                Punto centro = null;
                centro.setY (y);
            }
            
            /**
             * Aquí creamos un método setColor para poder darle a la variable "color" el valor que queramos y mostrar ese valor a través del método getColor por consola.
             * @param color es la variable a la que vamos a dar el valor.
             */
            public void setColor(Color color){
                this.color = color;
            }
            
            /**
             * Aquí definimos un método perimetro pero lo realizaremos en otra clase.
             */
            public abstract double perimetro();  
            /**
             * Aquí definimos un método area pero lo realizaremos en otra clase.
             */
            public abstract double area();  
            
            /**
             * Aquí creamos el método esMayorQue para comparar el tamaño de 2 figuras y ver cual es la mayor
             * @param otraFigura es la variable que creamos para la figura con la que queremos hacer la comparación.
             * @return si el area de nuestra figura es mayor al de la otra nos devolvera 1 por la consola y si el area de la otra figura es mayor que el de la nuestra nos devolverá -1 y si es igual nos devolverá 0.
             */
            public int esMayorQue (Figura otraFigura) {
                if (this.area() > otraFigura.area())
                    return 1;
                else
            		if (this.area() < otraFigura.area())
            		    return -1;
            		else
            			return 0;
            	}

}