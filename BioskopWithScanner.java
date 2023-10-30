import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        boolean exit = false;

        while (!exit) {
            System.out.println("************************");
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                while (true) {
                    System.out.print("Masukkan nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    int baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    int kolom = sc.nextInt();
                    sc.nextLine();
                    
                    penonton[baris - 1] [kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    String next = sc2.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                    break;

                case 2:
                    System.out.println("Daftar Penonton");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.println("Penonton pada baris ke-" + (i+1) + " : " + String.join(",", penonton[i]));
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }
    }
}
