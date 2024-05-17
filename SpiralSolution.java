// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class SpiralSolution {
    public static double masterAngle = 0;
    public static double compassAngleOffset = 0;
    public static void main(String[] args) {
        Finch bird = new Finch();
        
        
    
        bird.pause(5);
        getOutOfBox(bird);
    
        //Heading set to 90 deg right
        bird.setTurn("R", 90,50);
        compassAngleOffset = bird.getCompass();
    
        //Start 
    }

    public static void getOutOfBox(Finch bird){
        double left = bird.getLight("L");
        double right = bird.getLight("R");
        
        while(Math.abs(left-right) == 0 && left > 20){
            left = bird.getLight("L");
            right = bird.getLight("R");
        
        if(left > right){
            bird.setTurn("L",1,80);
        } else {
            bird.setTurn("R",1,80);
        }
        
        left = bird.getLight("L");
        right = bird.getLight("R");
        }
        bird.setMove("F",25,100);
    }

    public static void centerToEdge(Finch bird){
        while(bird.getLine("R") > 80 || bird.getLine("L") > 80){
            bird.setMotors(80,80);
        }
    }

    public static void clear(){
        for(int i = 1; i <= 4; i++){
            while(true){}
        }
    }
}