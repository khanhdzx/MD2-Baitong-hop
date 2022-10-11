package ra.entity;

import java.util.Scanner;

public class StudentClass implements IStudentManagement {
    private String classId;
    private String className;
    private String descriptions;
    private int classStatus;

    public StudentClass() {
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public int getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(int classStatus) {
        this.classStatus = classStatus;
    }

    @Override
    public void inputData(Scanner sc) {
        System.out.println("Nhập vào mã lớp");
        do {
            this.classId = sc.nextLine();
            if (this.classId.trim().length() == 5) {
                if (this.classId.charAt(0) == 'J') {
                    break;
                } else {
                    System.err.println("Vui lòng nhập mã lớp bắt đầu là ký tự J ");
                }
            } else {
                System.err.println("Vui lòng nhập lại mã lớp gồm 5 ký tự ");
            }
        } while (true);
        System.out.println("Nhập vào tên lớp: ");
        do {
            this.className= sc.nextLine();
            if (this.className.trim().length()<=10){
                break;
            }else {
                System.err.println("Vui lòng nhập tên lớp tối đa 10 ký tự ");
            }
        }while (true);
        System.out.println("Nhập vào mô tả lớp: ");
        this.descriptions= sc.nextLine();
        System.out.println("Nhập vào trạng thái của lớp: ");
        this.classStatus =Integer.parseInt(sc.nextLine());
    }

    @Override
    public void displayData() {
        System.out.printf("Mã lớp : %s - Tên lớp: %s- Mô tả lớp: %s - Trạng thái lớp: %d\n",this.classId,this.className,this.descriptions,this.classStatus);
    }

}
