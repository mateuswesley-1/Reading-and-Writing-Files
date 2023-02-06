import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Files{

    public static void main(String[] args) {

        File file = new  File("teste.txt");
        Scanner scan = null;

        try{

            scan = new Scanner(file);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();

        }

        // IOException herda Exception, que precisa ser tratado pois
        // da erro de compilacao
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        // se surgir um erro, o scan nao sera fechado
        // o finally roda mesmo que tiver erro
        finally{
            if(scan != null){
                scan.close();
            }
        }
    }
}
