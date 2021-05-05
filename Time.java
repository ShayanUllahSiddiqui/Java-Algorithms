public class Time {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int newHour) {
        hour = newHour;
    }

    public void setMinute(int newMinute) {
        minute = newMinute;
    }

    public void setSecond(int newSecond) {
        second = newSecond;
    }

    public static void main(String[] args) {
        Time t1 = new Time(10, 55, 34);
        t1.setHour(10);
        t1.setMinute(55);
        t1.setSecond(34);
        System.out.print("TIME:" + t1.getHour());
        System.out.print(":" + t1.getMinute());
        System.out.println(":" + t1.getSecond());

    }
    
}
