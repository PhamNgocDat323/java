package baitap;

public class File {
    public static void main(String[] args) {
        Product test = new Product();

        Product pr1 = test.nhapThongTin("computer", 200, 0.1);
        test.xuatThongtin(pr1);
        System.out.println(" tax = " + test.getTaxpRice(pr1.getPrice(), pr1.getTax()));
    }
}
