package headFirst.battleship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
<<<<<<< HEAD
    public static void main(String[] args){
        DotCom dot = new DotCom();
        Scanner sc = new Scanner(System.in);

        List<Integer> userGuessList = new ArrayList<>();
        int[] location = new int[3];
        int userGuess;
        int rand = ThreadLocalRandom.current().nextInt(-1,5);

        for(int j = 0; j < 3; j++){
            location[j] = rand++;
        }

        dot.setLocation(location);

        int numOfGuess = 0;
        String result = "miss";
        while(!result.equals("kill")){
            System.out.println("Enter a location by a guess---->");
            userGuess = sc.nextInt();
            if(userGuessList.contains(userGuess)) {
                System.out.println("You have already guessed this position, try something new--->");
                userGuess = sc.nextInt();
                userGuessList.add(userGuess);
            }else {
                userGuessList.add(userGuess);
            }
            result = dot.checkYourself(userGuess);
            System.out.println("Result of userGuess --> " + result);
            numOfGuess++;
            if(result.equals("kill")){
                System.out.print("The dotCom has been killed. Passed in: " + numOfGuess + " guesses");
                break;
            }else{
                System.out.println("Try, again... Currently on guess no: " + numOfGuess);
                int hits = dot.getHits();
                System.out.println("Number of hits: " + hits);
            }
        }
    }
}


=======
	public static void main(String[] args) {
		int[] locationCells = new int[10];
		int numOfHits = 0;
		int x = ThreadLocalRandom.current().nextInt(1, 8);
		String str = String.valueOf(x);
		if(checkYourself(str, locationCells)) {
		}
	}

	static void setLocationCells(int[] locationCells){

	}

	private static String checkYourself(String s, Integer[] locationCell) {
		for(int i : locationCell) {
			if (Integer.parseInt(s) == i) {
				return "Hit";
			} else return "miss";
		}
	}
}

>>>>>>> 7ce338833da34cd40d08bbbe03f244d8c7e6a09c
