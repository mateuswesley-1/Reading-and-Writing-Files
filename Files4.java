import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Files4 {
    public static void main(String[] args) {

        List<String> lines = new ArrayList<>();
        String path = "paramore.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null){
                lines.add(line);
                line = br.readLine();
            }
        }

        catch(IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("letraFiltrada.txt"))){
            int i = 0;
            for (String string : lines) {

                if(string.contains("C'est comme Ã§a")){
                    i += 1;
                    bw.write(i + "->" + string + "\n");
                }else{
                    bw.write(string + "\n");
                }

            }
        }

        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
