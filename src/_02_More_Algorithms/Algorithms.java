package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		return eggs.indexOf("cracked");
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int i=0;
		for (Boolean j : oysters) {
			if (j)
				i++;
		}
		return i;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double i = 0;
		for (double j : peeps) {
			if (j>i)
				i=j;
		}
		return i;
	}

	public static String findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		for (String w : words) {
			if (w.length()>j) {
				j=w.length();
				i=words.indexOf(w);
			}
		}
		return words.get(i);
	}

	public static boolean containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		for (String i : message1) {
			if (i.indexOf("... --- ...")!=-1)
				return true;
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		List<Double> result =results;
		for (int i = 0; i < result.size()-1; i++) {
			for (int j = 0; j < result.size()-i-1; j++) {
				if (result.get(j) > result.get(j+1)) {
					double temp = result.get(j+1);
					result.set(j+1, result.get(j));
					result.set(j, temp);
				} 
			}
		}
		return result;
	}

	public static List<String> sortDNA(List<String> d) {
		// TODO Auto-generated method stub
		List<String> s=d;
		for (int i = 0; i < s.size()-1; i++) {
			for (int j = 0; j < s.size()-i-1; j++) {
				if (s.get(j).length() > s.get(j+1).length()) {
					String temp = s.get(j+1);
					s.set(j+1, s.get(j));
					s.set(j, temp);
				} 
			}
		}
		return s;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		List<String> s=words;
		for (int i = 0; i < s.size()-1; i++) {
			for (int j = 0; j < s.size()-i-1; j++) {
				if (s.get(j).compareTo(s.get(j+1)) > 0) {
					String temp = s.get(j+1);
					s.set(j+1, s.get(j));
					s.set(j, temp);
				} 
			}
		}
		return s;
	}
}
