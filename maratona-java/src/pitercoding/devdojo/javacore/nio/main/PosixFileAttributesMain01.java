package pitercoding.devdojo.javacore.nio.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

//Para Ubuntu somente
public class PosixFileAttributesMain01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/piter/dev/file.txt");
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posixFileAttributes.permissions());
        PosixFileAttributeView posixFileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);

        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rw-rw-rw");
        posixFileAttributeView.setPermissions(posixFilePermissions);
        System.out.println(posixFileAttributeView.readAttributes().permissions());
    }
}
