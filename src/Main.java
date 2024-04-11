import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe rzymską aby otrzymac jej zamienik jako liczba arabska");
        String rzymska = scanner.nextLine().toUpperCase();
        int arabska = rzymskaNaLiczbeArabska(rzymska);
      System.out.println("Liczba rzymska " + rzymska + " a jej zamiennik na liczby arabskie to " + arabska );

    }
    public static int rzymskaNaLiczbeArabska(String rzymska){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int liczba = 0;
        int liczbaNaPoczatku = 0;

        for(int i = rzymska.length() - 1; i >= 0; i--){
            int obecnaLiczba = map.get(rzymska.charAt(i));
            if(obecnaLiczba < liczbaNaPoczatku) liczba -= obecnaLiczba;
            else liczba += obecnaLiczba;
            obecnaLiczba = liczbaNaPoczatku;
        }
        return liczba;
    }
}
