package br.com.alura.desafiospoojava1;

public class MusicaMain {
    public static void main(String[] args) {
        Musica musicaFichaTecnica = new Musica();
        musicaFichaTecnica.artista = "Gustavo Bertoni";
        musicaFichaTecnica.titulo = "Waves";
        musicaFichaTecnica.anoDeLancamento = 2020;
        musicaFichaTecnica.avalia(10);
        musicaFichaTecnica.avalia(8.3);
        musicaFichaTecnica.avalia(5.7);

        musicaFichaTecnica.exibeFichaTecnica();
        System.out.println("Com média de: " + musicaFichaTecnica.media());
    }
}
