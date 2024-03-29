import java.util.Scanner;
import java.lang.Math.*;
public class PlaytowerofHanoi{
  public static void main(String[] args){
    boolean isSolved = false;
    int numOfMoves = 0;
    Scanner towerScan = new Scanner(System.in);
    System.out.println("How many discs would you like to play with? ");
    int numDisc = towerScan.nextInt();
    int maxMoves = (int) Math.pow(numDisc,2)-1;
    TowersofHanoi game = new TowersofHanoi(numDisc);
    game.showTowerStates();
    System.out.println("Would you like to play or see a demo of the game? Enter 0 to play and 1 to see a demo. ");
    int choice = towerScan.nextInt();

    if(choice == 0){
       while(!isSolved){
         if(game.rods[0].size() == 0 && game.rods[1].size() ==0){
           System.out.println("Congratulations! You have solved the puzzle in "+numOfMoves+" moves.");
           isSolved = true;
           break;
         }
         if(numOfMoves == maxMoves){
           System.out.println("You have reached the maximum number of moves allowed and the tower has not been solved. You lose!");
           break;
         }
        	System.out.println("What rod are you moving the disk from? (0,1,2): ");
        	int moveFrom = towerScan.nextInt();
        	System.out.println("What rod are you moving the disk to? (0,1,2): ");
        	int moveTo = towerScan.nextInt();
         	if(game.legalMove(moveFrom,moveTo)){
           	game.move(moveFrom,moveTo);
            numOfMoves++;
         }
         else if(!game.legalMove(moveFrom,moveTo)){
           System.out.println("This is not a legal move. Please try again with a legal move.");
         }
       }
    }
	else if(choice == 1){
      game.solvegame();
  }
 }
}
