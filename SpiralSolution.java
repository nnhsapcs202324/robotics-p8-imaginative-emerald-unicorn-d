// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class SpiralSolution {
    public static double masterAngle = 0;
    public static double compassAngleOffset = 0;
    public static void main(String[] args) {
        Finch bird = new Finch();
        
        
    
        bird.pause(5);
        getOutOfBox(bird);
        centerToEdge(bird);
    
        //Heading set to 90 deg right
        //bird.setTurn("R", 90,50);
        compassAngleOffset = bird.getCompass();
    
        //Start 
    }

    public static void getOutOfBox(Finch bird){
        while(bird.getDistance() < 50){
            bird.setTurn("L",3,100);
        }
        bird.setTurn("L",45,50);
        bird.setMotors(0,0);
    }

    public static void centerToEdge(Finch bird){
        bird.setMotors(50,50);
        bird.pause(1);
        bird.setMotors(0,0);
        bird.pause(1);
        while(bird.getLine("R") > 98 || bird.getLine("L") > 98){
            bird.setMotors(20,20);
            System.out.println(bird.getLine("R"));
        }
        bird.setMotors(0,0);
    }
    
    public static void alignSpiral(Finch bird){
        bird.setMove("B",15,20);
        bird.setTurn("R",80,10);
        //while()
        //bird.setMotors(60,55);
        //bird.setMotors
    }
    
}