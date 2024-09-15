package baitap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFile = "c:\\baitap\\dulieu.txt";
        String outputFile = "c:\\baitap\\ketqua.txt";

        try {
            // Đọc tệp đầu vào
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            int number1 = Integer.parseInt(reader.readLine());
            int number2 = Integer.parseInt(reader.readLine());
            reader.close();

            // Tính tổng
            int sum = number1 + number2;

            // Ghi kết quả vào tệp ketqua.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write("Kết quả: " + sum);
            writer.close();

            System.out.println("Đã tính và lưu kết quả vào tệp " + outputFile);
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc hoặc ghi tệp: " + e.getMessage());
        }
    }
}
