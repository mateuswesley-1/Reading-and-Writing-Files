import java.io.File;
import java.util.Scanner;

public class Files5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o caminho da pasta: ");
        String strPath = scan.next();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        File[] files = path.listFiles(File::isFile);

        System.out.println("Pastas: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        System.out.println("\n\nFiles: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean folderCreated = new File("mateuswesley").mkdir();
        System.out.println("Pasta foi criada: " + folderCreated);
        
        scan.close();
    }
}
