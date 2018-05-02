import java.nio.file.*;
import java.net.URI;
import java.io.File;
import java.io.IOException;

public class FileAndDir {
    static void show(String id, Object p) {
        System.out.println(id + ": " + p);
    }
    static void info(Path p) {
        show("toString", p);
        show("Exists", Files.exists(p));
        show("RegularFile", Files.isRegularFile(p));
        show("Directory", Files.isDirectory(p));
        show("Absolute", p.isAbsolute());
        show("FileName", p.getFileName());
        show("Parent", p.getParent());
        show("Root", p.getRoot());
        System.out.println("******************");
    }
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        info(Paths.get(
                "$Home", "path", "to", "nowhere", "NoFile.txt"));
        Path p = Paths.get("FileAndDir.java");
        info(p);
        Path ap = p.toAbsolutePath();
        info(ap);
        info(ap.getParent());
        try {
            info(p.toRealPath());
        } catch(IOException e) {
            System.out.println(e);
        }
        URI u = p.toUri();
        System.out.println("URI: " + u);
        Path hmm = Paths.get(u);
        System.out.println(Files.exists(hmm));
    }
}