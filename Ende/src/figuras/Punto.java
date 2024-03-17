package figuras;

    /**
     * La clase punto es una superclase del paquete figuras
     * @version Figuras
     * @author Noelia Mancha
     * @since 04/03/2024
     */
    public class Punto {
        /**
         * @variable x, definimos la variable "x" que es con la que vamos a trabajar en nuestras clases y darle los valores que queramos conforme las vayamos utilizando, como ahora mismo no le hemos definido ningún valor java por defecto lo define como 0.
         * @variable y, definimos la variable "y" que es con la que vamos a trabajar en nuestrasa clases y darle los valores que queramos conforme las vayamos utilizando, como ahora mismo no le hemos definido ningún valor java por defecto lo define como 0.
         * Tanto la variable "x" como la "y" son las coordenadas con las que vamos a trabajar en nuestra clase punto.
         */
        private double x;
        private double y;
        
            /**
             * Creamos el constructor Punto dónde definimos tanto para la variable "x" como la variable "y" con el valor 0 cuando vayamos a iniciarlas.
             */
            public Punto(){
                x = 0;
                y= 0;
            }
            
            /**
             *  Creamos el constructor Punto para indicar que "x" es lo mismo que "this.x" y que "y" es lo mismo que "this.y".
             * @param x una de las variables con las que vamos a trabajar y es lo mismo que escribir "this.x"
             * @param y una de las variables con las que vamos a trabajar y es lo mismo que escribir "this.y"
             */
            public Punto(double x, double y){
                this.x = x;
                this.y = y;
            }
            
            /**
             * Creamos un constructor para igualar la variable "punto" a las posiciones de "x" y de "y".
             * @param p la variable "punto" que es la que vamos a igualar.
             */
            public Punto(Punto p){
                x = p.x;
                y = p.y;
            }
            
            /**
             * Creamos un método getX para que nos devuelva el valor de "x" que vamos a especificar en el método setX más adelante.
             * @return es para especificar que nos devuelva el valor de "x" por consola.
             */
            public double getX(){
                return x;
            }
            
            /**
             * Creamos un método getY para que nos devuelva el valor de "y" que vamos a especificar en el método setY más adelante.
             * @return es para especificar que nos devuelva el valor de "y"por consola.
             */
            public double getY(){
                return y;
            }
            
            /**
             * Creamos el método setX para poder darle un valor a "x" y que nos devuelva con el método getX ese valor.
             * @param x es la variable para la que vamos a definir el valor.
             */
            public void setX(double x){
                this.x = x;
            }
            
            /**
             * Creamos el método setY para poder darle un valor a "y", y que nos devuelva con el método getY ese valor.
             * @param y es la variable para la que vamos a definir el valor.
             */
            public void setY(double y){
                this.y = y;
            }
            
            /**
             * 
             * Creamos un método distancia 
             * @param p punto de la coordenada con el que estamos trabajando
             * @return Con Math.sqrt le estamamos indicando que lo que queremos que nos devuelva es la raíz cuadrada del número resultante de hacer las operaciones que hay entre paréntesis.
             */
            public double distancia(Punto p){
                return Math.sqrt (Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
            }
            
            /**
             * Creamos un método simetrico dónde llamamos al constructor Punto indicándole entre paréntesis que el valor de "x" lo tiene que multiplicar por -1 y el valor de "y" dejarlo tal cual.
             * @return que nos devuelva el valor de nuevoP.
             */
            public Punto simetrico(){
                Punto nuevoP = new Punto (this.x * -1, this.y);	
                   return nuevoP ;
            }
            
            /**
             * Aquí lo que realizamos es un método de comparación.
             * @param p estamos comparando que el punto de "x" sea igual a la variable "x" y que además el punto de "y" sea igual a la variable "y".
             * @return le damos una condición para que nos devuelva true y si no se cumple nos tiene que devolver false.
             */
            public boolean compara(Punto p){
                if (p.x == x && p.y == y)
                   return true;
                else
                   return false;
                }
            
            /**
             * Creamos un método toString para que nos devuelva lo que hay entre comillas más los valores que hemos definido en setX y setY a través de getXy getY por consola.
             */
            public String toString() {
            	return "(" + getX() + "," + getY() + ")";
            }
    }