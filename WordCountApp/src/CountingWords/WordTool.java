/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CountingWords;

// Abstract class
abstract class WordTool {
    protected String sentence;

    // Constructor
    public WordTool(String sentence) {
        this.sentence = sentence;
    }

    // Getter & Setter (Encapsulation)
    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    // Abstract method for Polymorphism
    public abstract int countWords();
}