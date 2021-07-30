package baitap.doc_file_csv;

import java.io.*;

public class QuocGia {
    public static final String NAME="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai16_text_file\\src\\baitap\\doc_file_csv\\array.csv";
    public static void main(String[] args) {
        try {
            File file=new File(NAME);
            BufferedReader br=new BufferedReader(new FileReader(NAME));
            String line="";

            while ((line=br.readLine())!=null){
                String[] quocGia=line.split(",");
                System.out.println(quocGia[4]+" "+quocGia[5]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
