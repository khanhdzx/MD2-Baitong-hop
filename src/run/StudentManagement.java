package run;

import ra.entity.Student;
import ra.entity.StudentClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    static List<StudentClass> listClass = new ArrayList<>();
    static List<Student> listStudent = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("**********************QUẢN LÝ HỌC VIỆN*******************");
            System.out.println("1. Quản lý lớp học ");
            System.out.println("2. Quản lý sinh viên ");
            System.out.println("3.Thoát");
            System.out.println("Sự lựa chọn của bạn :");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                case 2:
                case 3:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn từ 1-3 ");

            }
        }while (true);
    }
    public void getClassManagement(Scanner sc){
        do {
            System.out.println("**********************QUẢN LÝ HỌC VIỆN*******************");
            System.out.println("1. Thêm mới lớp học ");
            System.out.println("2. Cập nhật thông tin lớp học ");
            System.out.println("3.Hiển thị thông tin lớp học");
            System.out.println("4. Thống kê các lớp học đang hoạt động ");
            System.out.println("5.Tìm kiếm lớp học theo tên lớp học");
            System.out.println("6.Thoát");
            System.out.println("Sự lựa chọn của bạn :");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1 :
                case 2 :
                case 3 :
                case 4 :
                case 5 :
                case 6 :


            }
        }while (true);
    }
}
