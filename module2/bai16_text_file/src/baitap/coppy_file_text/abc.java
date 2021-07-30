package baitap.coppy_file_text;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class abc {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            FileOutputStream outputStream = new FileOutputStream("E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai16_text_file\\src\\baitap\\coppy_file_text\\text.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            bufferedWriter.write(sc.nextLine());
            bufferedWriter.newLine();
            bufferedWriter.write(sc.nextLine());

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
