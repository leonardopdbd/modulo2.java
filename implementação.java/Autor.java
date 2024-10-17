public class Autor extends Pessoa {
    private String genero;

    public Autor(String nome, int idade, String genero) {
        super(nome, idade);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
