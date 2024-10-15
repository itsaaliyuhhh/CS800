package assignment1.composition;

public class FolderDriver {
    public static void main(String[] args) {
        Folder phpDemo1 = new Folder("php_demo1");

        Folder sourceFiles = new Folder("Source Files");
        phpDemo1.addSubFolder(sourceFiles);

        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");

        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);

        app.addSubFolder(new Folder("config"));
        app.addSubFolder(new Folder("controllers"));
        app.addSubFolder(new Folder("library"));
        app.addSubFolder(new Folder("migrations"));
        app.addSubFolder(new Folder("model"));
        app.addSubFolder(new Folder("views"));

        publicFolder.addFile(new File(".htaccess"));
        publicFolder.addFile(new File(".htrouter.php"));
        publicFolder.addFile(new File("index.html"));

        // step 1
        //System.out.println("Original Structure:");
        //phpDemo1.print();

        // step 2
        //sourceFiles.removeSubFolder("app");
        //System.out.println("\nAfter deleting 'app' folder:");
        //phpDemo1.print();

        sourceFiles.removeSubFolder("public");
        System.out.println("\nAfter deleting 'public' folder:");
        phpDemo1.print();
    }

}
