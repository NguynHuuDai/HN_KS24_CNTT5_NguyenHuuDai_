import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int count = 0;
        int choice;
        do{
            System.out.println("===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo Học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.println("==================================");
            System.out.print("Chọn chức năng: ");

            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Nhập số lượng sinh viên: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên thứ " + (count + 1));

                        String id;
                        while (true) {
                            System.out.print("Nhập mã sinh viên: ");
                            id = scanner.nextLine();
                            if (id.matches("SV\\d{3}")) {
                                break;
                            }
                        }
                        System.out.print("Nhập họ và tên: ");
                        String name = scanner.nextLine();
                        double score;
                        while (true) {
                            System.out.print("Nhập điểm: ");
                             score = scanner.nextDouble();
                            if (score > 0 && score <= 10) {
                                break;
                            }
                        }
                        scanner.nextLine();

                        students[count++] = new Student(id, name, score);
                    }
                    break;
                case 2:
                    if (count == 0){
                        System.out.println("Hiện tại chưa có sinh viên nào trong danh sách");
                    }
                    for (int i = 0; i < count; i++) {
                        System.out.println(students[i]);
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("Hiện tại chưa có sinh viên nào trong danh sách");
                        break;
                    }

                    System.out.print("Nhập học lực cần tìm (Gioi / Kha / Trung Binh): ");
                    String rank = scanner.nextLine().trim();

                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].getRank().equalsIgnoreCase(rank)) {
                            System.out.println(students[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Không tìm thấy sinh viên có học lực: " + rank);
                    }
                    break;

                case 4:
                    if (count == 0){
                        System.out.println("Hiện tại chưa có sinh viên nào trong danh sách");
                        break;
                    }
                    for (int i = 0; i < count - 1; i++) {
                        for (int j = i + 1; j < count; j++) {
                            if (students[i].getScore() < students[j].getScore()) {
                                Student temp = students[i];
                                students[i] = students[j];
                                students[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp xong");
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    break;
            }

        }while (choice != 5);
    }
}