/**
 * Write a description of class FinchLessons here.
 *
 * @author Brayden, Izel, Anne Maria, Aj
 * @version (a version number or a date)
 */
public class FinchLessons
{ 
    public static void main(String[] args)
    {
        Finch bird = new Finch();
        double time = 0;
        double gap = 0.5;
        
        //lesson1_Movement(bird)
        // for(int i = 0; i< 1000 ; i++){
            // System.out.println("Time: " + time);
            // bird.pause(gap);
            // lesson2_Sensors(bird);
            // time += gap;
        // }
        
        //lesson4_MotorControl(bird);
        boolean run = true;
        while(run){
           lesson5(bird);
           if(bird.getButton("A")){
               run = false;
           }
        }
        bird.disconnect();
        
    } 
    
    public static void lesson1_Movement(Finch bird)
    {
        
    }
    
    public static void lesson2_Sensors(Finch bird)
    {    
        System.out.println("Light level left: " + bird.getLight("L"));
        System.out.println("Light level right: " + bird.getLight("R"));
        System.out.println("Button (?): " + bird.getButton("A"));
        System.out.println("Orientation: " + bird.getOrientation());
        System.out.println("Encoder: " + bird.getEncoder("R"));
        
        double l = bird.getLight("L");
        double r = bird.getLight("R"); 
        
        double diff = Math.abs(l -r);
        System.out.println("Difference: " + diff);
        System.out.println();
    }
    
    public static void lesson4_MotorControl(Finch bird)
    {
        // bird.setMotors(-100,100);
        // bird.pause(1);
        // bird.stop();
        int rightm;
        bird.setMotors(50,25);
        bird.pause(5.5);
        bird.setMotors(25,50);
        bird.pause(5.5);
        bird.stop();
    }
    
    public static void lesson5(Finch bird){
        // if (bird.getButton("A")){
            // bird.setBeak(0,100,0);
        // } else {
            // bird.setBeak(100,0,0);
        // }
        // bird.pause(1);
        // bird.stop();
        
        // System.out.println(bird.getDistance());
        // if(bird.getDistance() < 30)
        // {
            // bird.setTail(1,0,0,100);
            // bird.setTail(4,0,0,100);
        // }
        // else
        // {
            // bird.setTail(1,100,0,0);
            // bird.setTail(4,100,0,0);
        // }
        // bird.pause(.5);
        // bird.stop();
        
        // if(bird.getDistance()<30)
        // {
            // bird.setMotors(-25,-25);
        // }
        // else
        // {
            // bird.setMotors(25,25);
        // }
        // bird.pause(.5);
        // bird.stopAll();
        
        // while(bird.getDistance() > 20)
        // {
            // bird.setBeak(0,0,100);
            // bird.pause(3);
            // bird.setBeak(100,0,100);
            // bird.pause(3);
        // }
        // bird.stopAll();
        
        while (!bird.getButton("A"))
        {

            if(bird.getDistance()>30)
            {
                bird.setMotors(50,50);
                bird.setTail("all",0,100,0);
            }
            else{
                bird.setTail("all",100,0,0);
                bird.setMotors(-50,-50);
                bird.pause(2);
                bird.setTurn("R",90,50);
                
                bird.pause(1);               
            }
        }
        bird.stopAll();
    }
}
