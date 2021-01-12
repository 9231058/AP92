/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework23;

/**
 *
 * @author Parham Alvani
 */
public class Date {

    private int date;
    private int month;
    private int year;

    /**
     * this method generate Date object with date\month\year you must apply this
     * rule: 0<day<32 0<moth<13
     *
     * @param date
     * @param month
     * @param year
     */
    public Date(int date, int month, int year) throws IllegalArgumentException {
        this.setDate(date);
        this.setMonth(month);
        this.setYear(year);
    }

    /**
     * @return the date
     */
    public int getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public final void setDate(int date) throws IllegalArgumentException {
        if (date > 31 || date < 0) {
            throw new IllegalArgumentException("date must between 0 and 32");
        }
        this.date = date;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public final void setMonth(int month) throws IllegalArgumentException {
        if (month < 0 || month > 12) {
            throw new IllegalArgumentException("month must between 0 and 13");
        }
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public final void setYear(int year) {
        this.year = year;
    }

    /**
     *
     * @return the date format String
     */
    @Override
    public String toString() {
        return String.format("%02d / %02d / 13%2d", this.date, this.month, this.year);
    }

}
