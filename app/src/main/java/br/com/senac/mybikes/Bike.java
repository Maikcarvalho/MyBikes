package br.com.senac.mybikes;

public class Bike {
    //Atributos globais
    private String titulo;
    private String preco;
    private int disponivel;
    private int imagemBike;

    //Construtores da classe


    public Bike() {
    }
    public Bike(String titulo, String preco, int disponivel, int imagemBike) {
        this.titulo = titulo;
        this.preco = preco;
        this.disponivel = disponivel;
        this.imagemBike = imagemBike;
    }

    //Métodos de acesso - getters and setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public int getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(int disponivel) {
        this.disponivel = disponivel;
    }

    public int getImagemBike() {
        return imagemBike;
    }

    public void setImagemBike(int imagemBike) {
        this.imagemBike = imagemBike;
    }
}
