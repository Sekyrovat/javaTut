package app;

import java.util.Scanner;

/**
 * myMethods
 */
public class myMethods {
    public static void main(String[] args) {
        Boolean bStatus = true;
        Integer iScore = 19;
        Byte bLvlCompleted = 1;
        Short sBonus = 2;

		System.out.println(calculateScore(bStatus, iScore, bLvlCompleted, sBonus));
		bStatus = quit();
		System.out.println(bStatus);
    }

    public static int calculateScore(Boolean bStatus, int iScore, Byte bLvlCompleted, Short sBonus) {
        if(bStatus){
            return (iScore + (bLvlCompleted * sBonus));
        }else{
            return -1;
        }
	}
	
	public static Boolean quit() {
		Scanner scannerObj = new Scanner(System.in);
		Boolean bStatus = null;
		char cUserDecision = ' ';
		do {
			System.out.println("Are you sure you want to exit?[Y/n]");
			cUserDecision = scannerObj.next().charAt(0);
			if (cUserDecision == 'Y' || cUserDecision == 'y') {
				bStatus = true;
			} else if (cUserDecision == 'N' || cUserDecision == 'n'){
				bStatus = false;
			}
		} while (bStatus!=true || bStatus!=false);
		scannerObj.close();
		return bStatus;
	}
}