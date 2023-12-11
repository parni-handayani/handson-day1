import java.io.Console;

public class TugasPertama {
    public static void main(String[] args){
        String text;
        Console inputText = System.console();

        System.out.print("Ketik kata/kalimat, lalu tekan enter: ");
        text = inputText.readLine();
        System.out.println("================================================");

        System.out.println("String penuh: " + text);
        System.out.println("================================================");

        System.out.println("Process memecahkan kata/kalimat menjadi karakter.....................");
        System.out.println("Done.");
        System.out.println("================================================");

        for (int i = 0; i < text.length(); i++){
            System.out.println("Karakter[" + (i+1) + "]: " + text.charAt(i));
        }
        System.out.println("================================================");
    }
}