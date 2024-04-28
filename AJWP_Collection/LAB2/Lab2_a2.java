import java.util.LinkedList;
import java.util.Queue;

public class Lab2_a2 {
    public static void main(String[] args) {
        Queue<String> playersQueue = new LinkedList<>();

   
        playersQueue.offer("Vaibhav");
        playersQueue.offer("Yash");
        playersQueue.offer("Chetan");
        playersQueue.offer("Yogesh");
        playersQueue.offer("Shiv");
        playersQueue.offer("Varun");

      
        final int roundsBeforeStop = 5;
        int roundCount = 0;

               while (playersQueue.size() > 1) {
            roundCount++;

            
            String currentPlayer = playersQueue.poll();
            playersQueue.offer(currentPlayer);

           
            if (roundCount == roundsBeforeStop) {
                String eliminatedPlayer = playersQueue.poll();
                System.out.println("Music stopped! Player " + eliminatedPlayer + " is out.");
                roundCount = 0; 
            }
        }

        
        String winner = playersQueue.poll();
        System.out.println("Winner: " + winner);
    }
}
