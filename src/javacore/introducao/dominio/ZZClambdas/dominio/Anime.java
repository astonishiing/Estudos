package javacore.introducao.dominio.ZZClambdas.dominio;

public class Anime {
    private String title;
    private int episodes;

    public Anime(String title, int episodes) {
        this.title = title;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", quantity=" + episodes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodes() {
        return episodes;
    }
}
