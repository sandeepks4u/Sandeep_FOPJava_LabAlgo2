package org.greatLearning.iitr.lab.services;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//MergeSortImplimentation mergeSortImplimentation= new MergeSortImplimentation();
		BubblesortImplimentation bubblesortImplimentation = new BubblesortImplimentation();
		NotesCount notesCount = new NotesCount();
		System.out.println("Enter the size of currency denominations");
		Scanner sc=new Scanner(System.in);
		int size= sc.nextInt();
		int[] notes=new int[size];
		System.out.println("Enter the curency denomination value");
		for (int i = 0; i < size; i++) {
			notes[i]=sc.nextInt();
			
		}
		System.out.println("enter the amount you want to pay");
		int amount=sc.nextInt();
		//mergeSortImplimentation.sort(notes, 0, notes.length-1);
		bubblesortImplimentation.bubbleSort(notes);
		notesCount.notesCount(notes, amount);
	}

}
