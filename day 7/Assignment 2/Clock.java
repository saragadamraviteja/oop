/**
 * Clock data type. Write a data type Clock.java that
 * represents time on a 24-hour clock, such as 00:00, 13:30, or
 * 23:59. Time is measured in hours (00–23) and minutes (00–59). 
 * To do so, implement the following public API:
 * 
 * @author Siva Sankar
 */
import java.lang.*;
public class Clock {
    // Creates a clock whose initial time is h hrs and m min.
    /**
     * The parameterised constructor will instatiates the object with the values of
     * the parameters h and m to the respective hrs nad min.
     * @param h
     * @param m
     */
    private int h;
    private int m;
    public Clock(int h, int m) {
        this.h = h;
        this.m = m;
    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.

    private String s;
    public Clock(String s) {
        String [] str = s.split(":");
        h = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]); 

    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        String str = String.format("%02d:%02d",h,m); 
        // String str = h + ":" +m;
        return str;
    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        int h2 = that.h;
        int m2 = that.m;
        if (h == h2) {
            if (m < m2) {
                return true;
            } else {
                return false;
            } 

        } else if (h < h2) {
            return true;
        } else {
            return false;
        }
    }

    private void check() {
        
    }

    // Adds 1 minute to the time on this clock.
    public void tic() {
        if (m == 59) {
            m = 00;
            if (h == 23){
               h = 00;
            } else {
                h = h + 1;
            }
            
        } else {
        m = m +1;
        }
    }

    // Adds Δ min to the time on this clock.
    public void toc(int delta) {
        if (delta > 0){
        int temp = delta/60;
        int temp1 = delta%60;
        m += temp1;
        if(m>=60) {
            m-=60;
            h+=1;
        }
        h += temp;
        while (h>=24){
            h -=24;
        } 
    } 
     }
        

    // Test client (see below).
    public static void main(String[] args) {
        Clock clock = new Clock("13:01");
        clock.toc(660);
        System.out.println(clock);
    }
}