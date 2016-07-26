
package roboWars;

/**
 *
 * @author KLAYDEJR
 */
public class RobotTest1 {
    
    private int x;
    
    public RobotTest1()
    {
        System.out.println("RobotTest1 constructor");
        x = 25;
    }
    
    public void move(int howFar)
    {
        x += howFar;
    }
    
    public void show()
    {
        System.out.println("x is: "+x);
    }
    
    public static void main(String args[]) 
    {
        System.out.println("start RobotTest1 test using 'main'");
        
        
        RobotTest1 robotTest1 = new RobotTest1();
        robotTest1.move(3);
        robotTest1.show();
        robotTest1.move(123);
        robotTest1.show();
        
        System.out.println("end RobotTest1 test using 'main'");
        
    }
    
}
