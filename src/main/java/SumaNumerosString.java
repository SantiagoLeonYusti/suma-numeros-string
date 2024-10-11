import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumaNumerosString {

    public static void main(String[] args) {
        String myString = "asfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ew342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345., 34534534ewf342rasfsdalgkjerio435j 342234234nh234o32rnowei23io4h324oi32423o4w., 345.,34534534ewf342r";

        try {
            long sum = sumaNumerosDeString(myString);
            System.out.println("La suma de los números es: " + sum);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Se valida que la entrada no este vacia o sea nula
    public static void validarEntrada(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("El string de entrada está vacío o es nulo.");
        }
    }

    // Método que suma los números encontrados en el string
    public static int sumaNumerosDeString(String input) {
        validarEntrada(input); // Se valida la entrada antes de proceder

        // Compilación del patrón para encontrar números
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        int sum = 0;
        boolean found = false;

        // Ciclo que busca y suma todos los números encontrados
        while (matcher.find()) {
            found = true;
            sum += Integer.parseInt(matcher.group());
        }

        // Excepción para cuando no se encuentran números
        if (!found) {
            throw new IllegalArgumentException("No se encontraron números en la cadena de entrada.");
        }

        return sum; // Retorna el valor de la suma
    }
}
