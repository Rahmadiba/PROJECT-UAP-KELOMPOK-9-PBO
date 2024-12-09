/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CountingWords;
// Subclass implementing abstract method
class WordCount_1 extends WordTool {

    public WordCount_1 (String sentence) {
        super(sentence);
    }

    // Override method (Polymorphism)
    @Override
    public int countWords() {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        try {
            String[] words = sentence.trim().split("\\s+");
            return words.length;
        } catch (Exception e) {
            System.out.println("Error counting words: " + e.getMessage());
            return 0;
        }
    }

    // Static method for validation
    public static boolean isValidInput(String input) {
        return input != null && !input.trim().isEmpty();
    }
}
