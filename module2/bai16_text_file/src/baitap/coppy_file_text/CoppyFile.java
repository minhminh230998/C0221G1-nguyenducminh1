package baitap.coppy_file_text;


import java.io.*;

public class CoppyFile {
    public static void coppyFile(File source, File target) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(target);
            byte[] buffer = new byte[1024];
            int length;

            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }catch (IOException e){
            System.out.println("lỗi");
        }catch (Exception e){
            System.out.println("lỗi");
        } finally{
            try {
                is.close();
                os.close();
            }catch (Exception e){
                System.out.println("lỗi không tồn tại file");
            }

        }
    }
    public static void main(String[] args) throws IOException {
        File source = new File("E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai16_text_file\\src\\baitap\\coppy_file_text\\text.txt");
        File target = new File("E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai16_text_file\\src\\baitap\\coppy_file_text\\text1.txt");
        coppyFile(source, target);
        System.out.println("a");
    }
}
