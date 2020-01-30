import java.io.*;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        String path = "resources2/inputLineNumbers.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        PrintWriter writer = new PrintWriter("resources2/output2.txt");
        String input = reader.readLine();
        int counter = 1;
        while (input!=null){
            writer.append(String.format("%d. %s%n",counter,input));
            counter++;
            input= reader.readLine();
        }
        writer.close();
        reader.close();
    }
}
