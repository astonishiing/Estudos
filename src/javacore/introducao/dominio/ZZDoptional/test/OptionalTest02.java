package javacore.introducao.dominio.ZZDoptional.test;

import javacore.introducao.dominio.ZZDoptional.dominio.Manga;
import javacore.introducao.dominio.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.finalByTitle("Boku no Hero");

        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2).
                orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        Manga newManga = MangaRepository.finalByTitle("Drifters").
                orElseGet(() -> new Manga(3, "Drifters", 20));

        System.out.println(newManga);
    }
}
