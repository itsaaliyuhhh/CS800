package assignment1.composition;
import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<File> files;
    private List<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void removeSubFolder(String folderName) {
        subFolders.removeIf(folder -> folder.getName().equals(folderName));
    }

    public void print() {
        System.out.println("Folder: " + name);
        for (Folder subFolder : subFolders) {
            subFolder.print();
        }
        for (File file : files) {
            file.print();
        }
    }
}

