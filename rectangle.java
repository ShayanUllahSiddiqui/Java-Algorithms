public class rectangle {
    
    private int length;
    private int breadth;
    static int value = 0; 


    rectangle() {
        length = 0;
        breadth = 0;
    }

    
    rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

   
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

 
    public void setLength(int newLength) {
        length = newLength;
    }

    public void setBreadth(int newBreadth) {
        breadth = newBreadth;
    }

    static void heading() {
        System.out.println("-----------------------------");
        System.out.println("\t Rectangle \t");
        System.out.println("-----------------------------");
    }

    public void display() {
        System.out.println("Length of Rectangle = " + length);
        System.out.println("Breadth of Rectangle = " + breadth);
    }

    public static void main(String[] args) {
        heading();
        rectangle r1 = new rectangle(19, 7);
        r1.setLength(19);
        r1.setBreadth(7);
        r1.display();

    }
    
}
