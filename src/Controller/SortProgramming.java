/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;
/**
 *
 * @author This PC
 */
public class SortProgramming extends Menu<String>{
    static String[] mc = {"Buddle Sort", "Quick Sort", "Exit"};
    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SortProgramming(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();
    }


    
    @Override
    public void execute(int n) {
        System.out.println("Unsorted array: ");
        library.display(array);
        switch (n) {
            case 1:
                algorithm.buddleSort(array);
                System.out.println("\nSorted array by Buddle Sort: ");
                library.display(array);
                System.out.println("");
                break;
            case 2:
                algorithm.quickSort(array, 0, size_array - 1);
                System.out.println("\nSorted array by Quick Sort: ");
                library.display(array);
                System.out.println("");
                break;
            case 3:
                System.exit(0);
                break;
        }
    }            
}

   

    

