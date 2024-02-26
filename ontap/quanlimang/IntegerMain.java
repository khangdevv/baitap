package quanlimang;

import java.util.Scanner;

class IntegerMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyInteger ob = new MyInteger();
        ob.initialization();
        do {
            System.out.println("------------MENU-----------");
            System.out.println("1. Nhap kich thuoc ");
            System.out.println("2. Them moi mot so nguyen ");
            System.out.println("3. In ra so luong phan tu ");
            System.out.println("4. Kiem tra rong ");
            System.out.println("5. Kiem tra day ");
            System.out.println("6. Xoa mot so nguyen o vi tri bat ki ");
            System.out.println("7. Xoa mot so nguyen bat ki ");
            System.out.println("8. Xuat thong tin cua day ");
            System.out.println("9. Them moi mot so nguyen o vi tri bat ki ");
            System.out.println("10. Thoat chuong trinh ");
            System.out.println("---------------------------");
            System.out.println("Nhap lua chon cua ban : ");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    int Max = 0;
                    do {
                        System.out.println("Nhap do dai toi da mang : ");
                        Max = input.nextInt();
                        if (ob.setMax(Max) == 0) {
                            System.out.println("Khong hop le !");
                            System.out.println("Nhap lai do dai toi da mang : ");
                            Max = input.nextInt();
                        }
                        ob.setMax(Max);
                        if (ob.setMax(Max) != 0) {
                            ob.setArray(Max);
                        }
                    } while (ob.setMax(Max) == 0);
                    break;
                case "2":
                    int quantity = 0;
                    System.out.println("Nhap so ban muon them : ");
                    int local = input.nextInt();
                    ob.addValue(local);
                    ob.setQuantity(quantity++);
                    break;
                case "3":
                    System.out.println("So luong phan tu : " + ob.arraySize());
                    break;
                case "4":
                    if (ob.empty() == 0) {
                        System.out.println("Danh sach rong");
                    } else {
                        System.out.println("Danh sach nay khong rong");
                    }
                    break;
                case "5":
                    if (ob.full() == 0) {
                        System.out.println("Danh sach day");
                    } else {
                        System.out.println("Danh sach nay chua day");
                    }
                    break;
                case "6":
                    System.out.println("Nhap vi tri de xoa");
                    int position = input.nextInt();
                    ob.deleteValueAtPosition(position);
                    break;
                case "7":
                    System.out.println("Nhap so can xoa : ");
                    int number = input.nextInt();
                    ob.deleteValue(number);
                    break;
                case "8":
                    ob.showInformation();
                    break;
                case "9":
                    System.out.println("Nhap so de chen vao ");
                    int value = input.nextInt();
                    System.out.println("Nhap vi tri de chen : ");
                    int merit = input.nextInt();
                    ob.insertValueAtPosition(value, merit);
                    break;
                case "10":
                    input.close();
                    System.out.println("Thoat !");
                    System.exit(0);
                    break;
            }
            input.nextLine();
        } while (true);
    }
}