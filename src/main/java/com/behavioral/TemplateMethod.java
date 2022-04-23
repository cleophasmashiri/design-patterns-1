public class TemplateMethod {

    public static void main(String[] args) {
        String s = "Template method is a behavioral design pattern that defines a general algorithm in a super class and lets subclasses define the step methods"; 
        System.out.printf("%s%n", s);

        Game football = new FootballGame();
        football.initialise();
    }

    
} 

abstract class Game {

        public final void initialise() {
            start();
            play();
            stop();
        }

        public abstract void start();

        public abstract void play();

        public abstract void stop();
    }

    class FootballGame extends Game {
        
         @Override
         public void start() {
             System.out.println("Start football game");
         }

          @Override
         public void play() {
             System.out.println("Play football game");
         }

          @Override
         public void stop() {
             System.out.println("Stop football game");
         }

    }