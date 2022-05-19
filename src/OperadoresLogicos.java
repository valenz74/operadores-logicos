public class OperadoresLogicos {
    public static void main(String[] args) {
        /*
        OPERADORES LOGICOS
        Permiten realizar comparaciones de dos sentencias para saber si son
        VERDADERAS o FALSAS

        Los operadores lógicos son: Y, O
        TABLA DE VERDAD - Y (&&)
        A       B       Resultado
        true    true    true
        true    false   false
        false   true    false
        false   false   false
         */
        int edad = 15;
        boolean ninez = edad >= 0 && edad <= 11;
        System.out.println(ninez);
        /*
        TABLA DE VERDAD - O (||)
        A       B       Resultado
        true    true    true
        true    false   true
        false   true    true
        false   false   false

         */
    }
}

