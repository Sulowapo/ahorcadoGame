
package vista;

public class Letra {
    
    private char letra;
    private boolean encontrada;

    public Letra() {
    }

    public Letra(char letra, boolean encontrada) {
        this.letra = letra;
        this.encontrada = encontrada;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public boolean isEncontrada() {
        return encontrada;
    }

    public void setEncontrada(boolean encontrada) {
        this.encontrada = encontrada;
    }
    
    
}
