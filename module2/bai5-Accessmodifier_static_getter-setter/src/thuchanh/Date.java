package thuchanh;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {

        this.month = month;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        this.year = year;

    }

    public void isLeapYear() {
        if (year % 4 == 0 && year != 100 || year % 400 == 0) {
            System.out.println("Đây là năm nhuận");
        }
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public void checkNgay() {

        if (this.day < 32 && this.month < 13 && this.year < 2022) {
            System.out.println("day=" + day + "month=" + month + "year=" + year);
        } else {
            System.out.println("không tồn tại");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day1 = 0;
        int month1 = 0;
        int year1 = 0;
        do {
            System.out.println("nhập ngày");
            day1 = sc.nextInt();
            System.out.println("nhập tháng");
            month1 = sc.nextInt();
            System.out.println("nhập năm");
            year1 = sc.nextInt();
        } while (day1 > 31 || month1 > 12 || year1 > 2022);
        Date date1 = new Date(day1, month1, year1);
        date1.checkNgay();
    }
}
