package _00_Sorting_Algorithms;

import javax.swing.JOptionPane;

/*
 * INSTRUCTIONS
 * Run the demo VisualSorter.jar to see the finished product. 
 * Then complete the steps in the classes in the following order:
 * 
 * BubbleSorter
 * SelectionSorter
 * InsertionSorter
 * QuickSorter
 * MergeSorter
 * HeapSorter
 * BogoSorter
 */

public class _02_SortingAlgorithms {
	public static void main(String[] args) {
		String[] options = new String[] {"Bogo", "Quick","Insertion", "Bubble"};
		int input = JOptionPane.showOptionDialog(null, "Choose a sorting algorithm to visualize", "Sorting Algorithms", 0, 
				-1, null, options, 0);
		
		String choice = options[input];
		
		switch(choice) {
		case "Bubble":{
			new SortingVisualizer(new BubbleSorter());
			break;
		}
		case "Insertion":{
			new SortingVisualizer(new InsertionSorter());
			break;
		}
		case "Quick":{
			new SortingVisualizer(new QuickSorter());
			break;
		}
		case "Bogo":{
			new SortingVisualizer(new BogoSorter());
			break;
		}
		}
	}
}
