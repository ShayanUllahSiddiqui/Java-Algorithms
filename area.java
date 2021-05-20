public class area {
   
    int AreaA;
    int AreaB;
  
    void printArea(int L)
    {
        AreaA = L*L;
        System.out.println("Area of Square is "+ AreaA);
    }

    void printArea(int L,int B)
    {
        AreaB = L*B;
        System.out.println("Area of Rectangle is "+ AreaB);
    } 

    
public static void main(String args[])
{
    area obj1= new area();
    obj1.printArea(9);
    obj1.printArea(16,6);
}
    
}
