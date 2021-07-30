package thuchanh.tinh_tong_cac_so_trong_file_text;


import java.io.*;

public class SumTextFile {


    public static void main(String[] args) {

        try {
            File text = new File("E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai16_text_file\\src\\thuchanh\\tinh_tong_cac_so_trong_file_text\\text.txt");
            if (!text.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(text));
            int sum = 0;
            String line = "";
            while ((line = br.readLine()) != null) {
                sum += Integer.parseInt(line);
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println("nhập kiểu number");
        }
    }
}

