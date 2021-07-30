package baitap.copy_file_nhi_phan;

import java.io.*;

public class CopyFileNhiPhan {
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
        File source = new File("E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai17_binaryfile_serialization\\src\\baitap\\copy_file_nhi_phan\\text1.txt");
        File target = new File("E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\bai17_binaryfile_serialization\\src\\baitap\\copy_file_nhi_phan\\text2.txt");
        coppyFile(source, target);
        System.out.println("a");
    }
}
