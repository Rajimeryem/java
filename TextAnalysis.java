public class TextAnalysis {
    public static void main(String[] args) {
        String text = "Ceci est un exemple de texte pour analyse.";
        
        int charCount = text.length();
        String[] words = text.split("\\s+"); // Séparation par espaces
        int wordCount = words.length;
        
        System.out.println("Texte: " + text);
        System.out.println("Nombre de caractères: " + charCount);
        System.out.println("Nombre de mots: " + wordCount);
    }
}