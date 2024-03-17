package figuras;

import java.util.Scanner;
import java.awt.Color;

    /**
     * Creamos una clase Prueba figura donde vamosa probar todos los métodos de las clases anteriores
     */
    public class PruebaFigura {
        /**
         * Definimos la variable mostrarOpcion que es con la que vamos a trabajar en nuestra clase y darle el valor que queramos conforme las vayamos utilizando, como ahora mismo no le hemos definido ningún valor java por defecto lo define como 0.
         */
        private static int mostrarOpcion;
        /**
         * Llamamos al método main
         * @param args predefinido en la llamada al método main
         */
        public static void main(String[] args) {
            /**
             * Le indicamos a java con el Scanner que tiene que tomar los valores que indiquemos por consola.
             */
            Scanner teclado = new Scanner (System.in);
            /**
             * Con el do creamos un bucle en el cual estamos igualando la variable mostrarOpcion al método definido más abajo mostrarMenu();.
             */
            do { 
               mostrarOpcion = mostrarMenu();
            /**
             * Aquí le indicamos con la sentencia del if que si mostrarOpcion es distinto de 4 tiene que sacarnos las 2 frases que aparecen entre paréntesis para que podamos darle valores a "x" y a "y".   
             */
            if (mostrarOpcion != 4){
                /**
                 * Aquí le indicamos que nos saque por consola la frase "Introduzca la coordenada x del centro;" para poder así darle un valor a "x".
                 */
                System.out.print ("Introduzca la coordenada x del centro: ");
                /**
                 * con double x = teclado.nextDouble(); le indicamos que queremos que tome el valor que le damos a "x" por consola para más adelante poder realizar operaciones con dicho valor.
                 */
                double x = teclado.nextDouble();
                /**
                 * Aquí le indicamos que nos saque por consola la frase "Introduzca la coordenada y del centro;" para poder así darle un valor a "y".
                 */
                System.out.print ("Introduzca la coordenada y del centro: ");
                /**
                 * con double y = teclado.nextDouble(); le indicamos que queremos que tome el valor que le damos a "y" por consola para más adelante poder realizar operaciones con dicho valor.
                 */
                double y = teclado.nextDouble();
            /**
             * Definimos las variables "textoperimetro" y "textoarea" que utilizaremos más adelante.    
             */
            String textoperimetro = "El perímetro es ";
            String textoarea = "El área es ";
            
            /**
             * Con Switch vamos a definir diferentes casos para la variable mostrarOpcion.
             */
            switch (mostrarOpcion) {
            /**
             * En el caso 1 vamos a trabajar con los lados del triángulo para que nos devuelva el perímetro y el área.
             */
            case 1:
                /**
                 * Aquí decimos que nos saque por consola la frase "Introduzca el lado 1 del triángulo: " para que así podamos darle el valor que queramos a la variable "lado1".
                 */
                System.out.print ("Introduzca el lado 1 del triángulo: ");
                /**
                 * con double lado1 = teclado.nextDouble(); le indicamos que queremos que tome el valor que le damos a "lado1" por consola para que más adelante realice operaciones con ese valor.
                 */
                double lado1 = teclado.nextDouble();
                /**
                 * Aquí decimos que nos saque por consola la frase "Introduzca el lado 2 del triángulo: " para que así podamos darle el valor que queramos a la variable "lado2".
                 */
            	System.out.print ("Introduzca el lado 2 del triángulo: ");
            	/**
            	 *  con double lado2 = teclado.nextDouble(); le indicamos que queremos que tome el valor que le damos a "lado2" por consola para que más adelante realice operaciones con ese valor.
            	 */
                double lado2 = teclado.nextDouble();
                /**
                 * Aquí decimos que nos saque por consola la frase "Introduzca el lado 3 del triángulo: " para que así podamos darle el valor que queramos a la variable "lado3".
                 */
                System.out.print ("Introduzca el lado 3 del triángulo: ");
                /**
                 * con double lado3 = teclado.nextDouble(); le indicamos que queremos que tome el valor que le damos a "lado3" por consola para que más adelante realice operaciones con ese valor.
                 */
                double lado3 = teclado.nextDouble();
                /**
                 * Aquí le estoy indicando que para la clase Triangulo quiero que llame al constructor triangulo y tome los valores que le he ido dando a cada una de las variables en los apartados anteriores por consola. 
                 */
                Triangulo t = triangulo(x, y, lado1, lado2, lado3);
                /**
                 * Aquí le indico que una vez que tome los valores que le he indicado, quiero que me saque por consola la variable "textoperimetro" + el resultado de operar con las variables de los lados a través del método perimetro de la clase triangulo.
                 */
                System.out.println (textoperimetro + t.perimetro());
                /**
                 * Aquí le indico que una vez que tome los valores que le he indicado, quiero que me saque por consola la variable "textoarea" + el resultado de operar con las variables de los lados a través del método area de la clase triangulo.
                 * Con la sentencia break indicamos que una vez haya hecho todo lo anterior pare.
                 */
                System.out.println (textoarea + t.area());break;           
            /**
             * En el caso 2 vamos a trabajar con la base y la altura del rectangulo para que nos devuelva el perimetro y el area.    
             */
            case 2:
                /**
                 * Aquí decimos que nos saque por consola la frase "Introduzca la base del rectangulo: " para que así podamos darle el valor que queramos a la variable "base".
                 */
            	System.out.print ("Introduzca la base del rectángulo: ");
            	/**
            	 *  con double base = teclado.nextDouble(); le indicamos que queremos que tome el valor que le damos a "base" por consola para que más adelante realice operaciones con ese valor.
            	 */
                double base = teclado.nextDouble();
                /**
                 * Aquí decimos que nos saque por consola la frase "Introduzca la altura del rectangulo: " para que así podamos darle el valor que queramos a la variable "altura".
                 */
            	System.out.print ("Introduzca la altura del rectángulo: ");
            	/**
            	 * con double altura = teclado.nextDouble(); le indicamos que queremos que tome el valor que le damos a "altura" por consola para que más adelante realice operaciones con ese valor.
            	 */
                double altura = teclado.nextDouble();
                /**
                 * Aquí le estoy indicando que para la clase Rectangulo quiero que llame al constructor rectangulo y tome los valores que le he ido dando a cada una de las variables en los apartados anteriores por consola.
                 */
                Rectangulo r = rectangulo(x, y, base, altura);
                /**
                 * Aquí le indico que una vez que tome los valores que le he indicado, quiero que me saque por consola la variable "textoperimetro" + el resultado de operar con las variables "base" y "altura" a través del método perimetro de la clase rectangulo.
                 */
                System.out.println (textoperimetro + r.perimetro());
                /**
                 * Aquí le indico que una vez que tome los valores que le he indicado, quiero que me saque por consola la variable "textoarea" + el resultado de operar con las variables "base" y "altura" a través del método area de la clase rectangulo.
                 * Con la sentencia break indicamos que una vez haya hecho todo lo anterior pare.
                 */
                System.out.println (textoarea + r.area());break;
            /**
             * En el caso 3 vamos a trabajar con los lados del cuadrado para que nos devuelva el perimetro y el area.
             */
            case 3:
                /**
                 * Aquí decimos que nos saque por consola la frase "Introduzca el lado del cuadrado: " para que así podamos darle el valor que queramos a la variable "lado".
                 */
            	 System.out.print ("Introduzca el lado del cuadrado: ");
            	 /**
            	  * con double lado = teclado.nextDouble(); le indicamos que queremos que tome el valor que le damos a "lado" por consola para que más adelante realice operaciones con ese valor.
            	  */
                 double lado = teclado.nextDouble();
                 /**
                  * Aquí le estoy indicando que para la clase Cuadrado quiero que llame al constructor cuadrado y tome los valores que le he ido dando a cada una de las variables en los apartados anteriores por consola.
                  */
            	 Cuadrado c = cuadrado(x, y, lado);
            	 /**
            	  * Aquí le indico que una vez que tome los valores que le he indicado, quiero que me saque por consola la variable "textoperimetro" + el resultado de operar con la variable "lado" a través del método perimetro de la clase cuadrado.
            	  */
            	 System.out.println (textoperimetro + c.perimetro());
            	 /**
            	  * Aquí le indico que una vez que tome los valores que le he indicado, quiero que me saque por consola la variable "textoarea" + el resultado de operar con la variable "lado" a través del método area de la clase cuadrado.
            	  * Con la sentencia break indicamos que una vez haya hecho todo lo anterior pare.
            	  */
            	 System.out.println (textoarea + c.area());break;            	         
            }
            }
            /**
             * Aquí con while le indicamos que si mostrarOpcion es diferente de 4 deje ya de coger datos por consola.
             */
            }while (mostrarOpcion != 4); 
                teclado.close();
            }
        /**
         * Aquí para la clase Cuadrado hemos creado el método cuadrado para poder darles a las variables especificadas en el método los valores que queramos a traves de la consola en el switch caso 3.
         * @param x variable para que le demos el valor de la coordenada "x".
         * @param y variable para que le demos el valor de la coordenada "y".
         * @param lado variable para que le demos el valor del lado del cuadrado.
         * @return que nos devuelva el valor de todas estas variables
         */
        private static Cuadrado cuadrado(double x, double y, double lado) {
            Cuadrado c = new Cuadrado(x, y, Color.red, lado);
            return c;
        }
        /**
         * Aquí para la clase Rectangulo hemos creado el método rectangulo para poder darles a las variables especificadas en el método los valores que queramos a traves de la consola en el switch caso 2.
         * @param x variable para que le demos el valor de la coordenada "x".
         * @param y variable para que le demos el valor de la coordenada "y".
         * @param base variable para que le demos el valor de la base del rectangulo.
         * @param altura variable para que le demos el valor de la altura del rectangulo.
         * @return que nos devuelva el valor de todas estas variables
         */
        private static Rectangulo rectangulo(double x, double y, double base, double altura) {
            Rectangulo r = new Rectangulo(x, y, Color.red, base, altura);
            return r;
        }
        /**
         * Aquí para la clase Triangulo hemos creado el método triangulo para poder darles a las variables especificadas en el método los valores que queramos a traves de la consola en el switch caso 1.
         * @param x variable para que le demos el valor de la coordenada "x".
         * @param y variable para que le demos el valor de la coordenada "y".
         * @param lado1 variable para que le demos el valor del lado 1 del triangulo.
         * @param lado2 variable para que le demos el valor del lado 2 del triangulo.
         * @param lado3 variable para que le demos el valor del lado 3 del triangulo.
         * @returnl que nos devuelva el valor de todas estas variables
         */
        private static Triangulo triangulo(double x, double y, double lado1, double lado2, double lado3) {
            Triangulo t = new Triangulo(x, y, Color.red, lado1, lado2, lado3);
            return t;
        }
        /**
         * Creamos un método MostrarMenu para que nos devuelva por consola la opción del menu que hemos selecionado.
         * @return con esta sentencia indicamos que queremos que nos devuelva la opción seleccionada.
         */
        public static int mostrarMenu(){
            /**
             * Definimos la variable opcion que es con la que vamos a trabajar en nuestra clase y darle el valor que queramos conforme las vayamos utilizando, como ahora mismo no le hemos definido ningún valor java por defecto lo define como 0.
             */
            int opcion;
            /**
             * Aquí lo que indicamos es que cuando nos refiramos a este método queremos que nos saque por consola estas 4 opciones para que posteriormente podamos elegir la que queramos.
             */
            System.out.println ("1) Triángulo");
            System.out.println ("2) Rectángulo");
            System.out.println ("3) Cuadrado");
            System.out.println ("4) Salir");
            /**
             * Con la opción de Scanner le estamos indicando que tome el valor que hemos seleccionado a través de la consola para que se meta en la opción del menú correcta.
             */
            Scanner teclado = new Scanner (System.in);
            /**
             * Con do le decimos que saque por pantalla el mensaje "Introduzca una opción (1-4): " para que así podamos introducir el número que nosotros queramos en función de la opción del menú que hayamos elegido.
             */
            do {
                System.out.print ("Introduzca una opción (1-4): ");
                /**
                 * con opcion = teclado.nextInt(); coge el valor que hayamos introducido por teclado.
                 */
                opcion = teclado.nextInt();
            /**
             * con la sentencia del if le indicamos que si opcion es menor que 1 o mayor que 4 tiene que sacarnos el mensaje especificado entre paréntesis.    
             */
            if (opcion < 1 || opcion > 4)                   
            	   System.out.println ("Debe introducir un número entre 1 y 4");
            /**
             * y con la sentencia del while le indicamos que si opcion es mayor que 1 pero menor que 4 tiene que devolvernos el valor que le hayamos indicado a opción.
             */
            } while (opcion > 1 || opcion < 4);
                return opcion;
        }
    }