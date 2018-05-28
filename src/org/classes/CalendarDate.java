package org.classes;

public class CalendarDate {
    private int dayInMonth;
    private int month;
    private int year;

    public int getDayInMonth() {
        return dayInMonth;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void set (int dayInMonth, int month, int year) {
        this.year = year;
        this.month = month;
        this.dayInMonth = dayInMonth;
    }

    private int maxDaysOfMonth(int month){
        // TODO maxDaysOfMonth
        int days;
        switch (month) {
            case 1: days = 31;
                break;
            case 2: days = 29;
                break;
            case 3: days = 31;
                break;
            case 4: days = 30;
                break;
            case 5: days = 31;
                break;
            case 6: days = 30;
                break;
            case 7: days = 31;
                break;
            case 8: days = 31;
                break;
            case 9: days = 30;
                break;
            case 10: days = 31;
                break;
            case 11: days = 30;
                break;
            case 12: days = 31;
                break;
            default: days = -1;
                break;
        }
        return days;
    }

    private void setMonthAndDay(int month, int dayInMonth) {
        if (month>=1 && month<=12) {
            int maxDay = maxDaysOfMonth(month);
            if (dayInMonth>1 && dayInMonth<=maxDay) {
                this.month = month;
                this.dayInMonth = dayInMonth;
            }
        }
    }

    public void setDay(int dayInMonth) {
        setMonthAndDay(this.month, dayInMonth);
    }

    public String asText() {
        return dayInMonth + "." + month + "." + year;
    }

}

