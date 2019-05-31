import java.io.FileWriter;

public class Ex2 {
    public static void main(String[] args) throws Exception {

        FileWriter nFile = new FileWriter("file2.txt");

        nFile.write("Хокку \nПодобен лучу самурайский клинок \nИ тот затупился \nПроклятая килька в томате!!");

        nFile.close();
    }
}
