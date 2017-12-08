package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int index = 0;
		int num = 0;
		for (int i = 0; i < eggs.size(); i++) {
			String egg = eggs.get(index);
			if (egg.equals("cracked")) {
				return index;

			}
			index++;
		}
		return index;
		// <- this needs changing
	}

	public static int countPearls(List<Boolean> oysters) {
		int indexPearl = 0;
		int numPearl = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(indexPearl)) {
				numPearl += 1;
			}
			indexPearl++;
		}
		return numPearl;
	}

	public static double findTallest(List<Double> peeps) {
		double currentPeep = 0;
		double myTallestPeep = 0;
		for (int i = 0; i < peeps.size(); i++) {
			currentPeep = peeps.get(i);
			if (currentPeep > myTallestPeep) {
				myTallestPeep = currentPeep;
			}
		}
		return myTallestPeep;
	}

	public static String findLongestWord(List<String> words) {
		String currentWord = "";
		String longestWord = "";
		for (int i = 0; i < words.size(); i++) {
			currentWord = words.get(i);
			if (currentWord.length() > longestWord.length()) {
				longestWord = currentWord;
			}
		}
		return longestWord;
	}

	public static boolean containsSOS(List<String> message1) {
		String sos = " ... --- ... ";
		for (int i = 0; i < message1.size(); i++) {
			if (sos.equals(message1.get(i))) {

				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		Double currentScore = 0.0;
		for (int i = 0; i < results.size(); i++) {
			for (int j = i; j < results.size(); j++) {
				if (results.get(j) < results.get(i)) {
					currentScore = results.get(i);
					results.set(i, results.get(j));
					results.set(j, currentScore);
				}
			}
		}
		return results;
	}
	public static List<String> sortDNA(List<String> unsortedSequences) {
		String CurrentDNA = "";
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = i; j < unsortedSequences.size(); j++) {
				if (unsortedSequences.get(j).length() < unsortedSequences.get(i).length()) {
					
				}
			}
		}
		return unsortedSequences;
	}
}