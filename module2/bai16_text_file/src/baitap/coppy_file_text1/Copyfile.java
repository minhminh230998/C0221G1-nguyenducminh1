package baitap.coppy_file_text1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Copyfile {
    private static final String FILENAME = "E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai16_text_file\\src\\baitap\\coppy_file_text\\text.txt";
    private static final String FILENAME1 = "E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai16_text_file\\src\\baitap\\coppy_file_text\\text1.txt";

    public static void main(String[] args) {
        BufferedReader br = null;
        FileWriter fr = null;
        try {
            String currentLine;

            br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileWriter(FILENAME1);
            while ((currentLine = br.readLine()) != null) {
                fr.write(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
