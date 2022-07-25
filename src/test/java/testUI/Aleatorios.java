package testUI;

import java.util.Random;
public class Aleatorios {
    Random random = new Random();
    public String nombreAleatori() {

        String nombre = "maty_";
        String setOfCharacters = "abcdefghxyz1234567-/@";

        int randomInt = random.nextInt(setOfCharacters.length());
        char randomChar = setOfCharacters.charAt(randomInt);

        nombre = nombre.concat(String.valueOf(randomChar));
        return(nombre);
    }

    public String emailAleatorio(String nomAleatorio) {

        String email = nomAleatorio.concat("@hotmail.com");
        return(email);
    }
}
