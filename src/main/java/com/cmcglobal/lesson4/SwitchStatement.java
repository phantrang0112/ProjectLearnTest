package com.cmcglobal.lesson4;

import java.util.Scanner;

public class SwitchStatement {
    public static Scanner scanner = new Scanner(System.in);

    public static void getRank(int rank) {

        switch (rank) {
            case 1:
                System.out.println("Mien phi su dung phong tong thong tai khach san hoac khu resort");
            case 2:
                System.out.println("Mien phi an uong tai cac nha hang cua khu resort!");
            case 3:
                System.out.println("Giam 20% phi mua sam tai tat ca cua hang trong khu resort");
            case 4:
                System.out.println("Mien phi gui xe trong khu resort");
            case 5:
                System.out.println("Tich luy diem de doi voucher khi su dung dich vu trong khu resort");
        }
    }

    public static void getDiscount(int rank) {
        if (rank == 1 || rank == 2) {
            System.out.println("Giam 50% phi tham gia cua cac khu vui choi cua resort");
        } else if (rank == 3 || rank == 4) {
            System.out.println("Giam 20% phi tham gia cua cac khu vui choi cua resort");
        }
        getRank(rank);
    }

    public static void main(String[] args) {
        System.out.println("Nhap bac: ");
        int rank = scanner.nextInt();
        // checkRank
        getRank(rank);
        // getDiscount
        getDiscount(rank);
    }
}
