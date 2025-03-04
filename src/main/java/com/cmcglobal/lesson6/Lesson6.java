package com.cmcglobal.lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        int binhNuoc = 0;
        RobotHutBui robotHutBui1 = new RobotHutBui("R1", 30);
        System.out.println("Hoàn tất tạo 1 robot hút bụi đặt tên là" + robotHutBui1.getClass().getName());
        RobotHutBui robotHutBui2 = new RobotHutBui("R1", 30);
        System.out.println("Hoàn tất tạo 1 robot hút bụi đặt tên là" + robotHutBui2.getClass().getName());
        System.out.println("Trọng lượng của robot1:" + robotHutBui1.getTrongLuong());
        System.out.println("Trọng lượng của robot2" + robotHutBui2.getTrongLuong());
        System.out.println("Lượng nước của robot1:" + robotHutBui1.getLuongNuoc());
        binhNuoc += robotHutBui1.chamNuoc();
        System.out.println("Lượng nước của  robot1 sau khi châm nước" + robotHutBui1.getLuongNuoc());
        System.out.println("Lượng nước của  robot2:" + robotHutBui2.getLuongNuoc());
        binhNuoc += robotHutBui2.chamNuoc();
        System.out.println("Lượng nước của  robot2 sau khi châm nước" + robotHutBui2.getLuongNuoc());
        System.out.println("Lượng nước trong bình:" + binhNuoc);
    }
}
