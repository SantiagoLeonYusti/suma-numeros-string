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
    public static int sumaNumerosDeString(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("El string de entrada está vacío o es nulo.");
        }

        // Compilacion del patron para encontrar numeros
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        int sum = 0;
        boolean found = false;


        // Ciclo que busca y suma todos los numeros encontrado
        while (matcher.find()) {
            found = true;
            sum += Integer.parseInt(matcher.group());
        }

        // Excepcion para cuando no ecneuntra numeros
        if (!found) {
            throw new IllegalArgumentException("No se encontraron números en la cadena de entrada.");
        }

        // Retorna el valor de la suma
        return sum;
    }
}