package javacore.introducao.dominio.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pastaWnio/subpasta1/file.bkp");
        Path path2 = Paths.get("pastaWnio/subpasta1/file.txt");
        Path path3 = Paths.get("pastaWnio/subpasta1/file.java");

        matches(path1, "glob:*.bkp");
        matches(path1, "glob:**.bkp");
        matches(path1, "glob:**/*.bkp");

        matches(path1, "glob:**/*.{bkp,txt,java}");
        matches(path2, "glob:**/*.{bkp,txt,java}");
        matches(path3, "glob:**/*.{bkp,txt,java}");

        matches(path1, "glob:**/*.???");
        matches(path2, "glob:**/*.???");
        matches(path3, "glob:**/*.????");

        matches(path3, "glob:**/file.????");
        matches(path2, "glob:**/file.???");
        matches(path1, "glob:**/file.???");
    }

    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
