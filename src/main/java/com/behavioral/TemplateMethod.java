public class TemplateMethod {

    public static void main(String[] args) {
        String s = "Template method is a behavioral design pattern that defines a general algorithm in a super class and lets subclasses define the step methods"; 
        System.out.printf("%s%n", s);
    }

    class abstract Game {

        public initialise() {
            start();
            play();
            stop()
        }

        public abstract void start();

        public abstract void play();

        public abstract void stop();
    }

    class FootballGame extends Game {
        
    }
} 