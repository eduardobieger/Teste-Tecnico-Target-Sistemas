public class Main {
    public static void main(String[] args) {
        String texto = "Olá Mundo!";

        for(int i = texto.length(); i > 0; i--) {
            System.out.print(texto.charAt(i-1));
        }
    }
}