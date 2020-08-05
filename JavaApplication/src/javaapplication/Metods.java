/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Metods {
    Scanner go = new Scanner(System.in);
    int arr[];
    int numbersOfElements = 0;
    int byThree [];
    int bySeven [];
    int byTwentyOne [];
    
    
    public void howElements() {
        System.out.print("Введите колличество элементов массива: ");
        numbersOfElements = go.nextInt();
        initArray();
    }
    
    public int[] initArray () {
        System.out.print("Введите элементы массива через пробел: ");
        arr = new int[numbersOfElements];
        for(int count = 0; count < numbersOfElements; count++) {
            int elem = go.nextInt();
            arr[count] = elem;
        }
        byThree =  divilibleBy(3);
        bySeven = divilibleBy(7);
        byTwentyOne = divilibleBy(21);
        return arr;
    }
    
    public int[] divilibleBy(int num) {
        int bufferVar = 0;
        int sizeNewArr = 0;
        int number = 0;
        for(int count = 0; count < arr.length; count++) {
            if(arr[count] % num == 0) {
                sizeNewArr++;
            }
        }
        int [] by = new int[sizeNewArr];
        for(int count = 0; count < arr.length; count++) {
            if(arr[count] % num == 0) {
                by[number] = arr[count];
                number++;
            }
        }
        for(int count = 0; count < by.length; count++) {
            for(int i = 0; i < by.length; i++) {
                if(by[count] < by[i]) {
                    bufferVar = by[i];
                    by[i] = by[count];
                    by[count] = bufferVar;
                }
            }
        }
        
        return by;
    }
    
    
    /*public int[] divilibleBySeven() {
        int bufferVar = 0;
        int sizeNewArr = 0;
        int number = 0;
        for(int count = 0; count < arr.length; count++) {
            if(arr[count] % 7 == 0) {
                sizeNewArr++;
            }
        }
        int [] bySeven = new int[sizeNewArr];
        for(int count = 0; count < arr.length; count++) {
            if(arr[count] % 7 == 0) {
                bySeven[number] = arr[count];
                number++;
            }
        }
        for(int count = 0; count < bySeven.length; count++) {
            for(int i = 0; i < bySeven.length; i++) {
                if(bySeven[count] < bySeven[i]) {
                    bufferVar = bySeven[i];
                    bySeven[i] = bySeven[count];
                    bySeven[count] = bufferVar;
                }
            }
        }
        
        return bySeven;
    }
    
    public int[] divilibleByTwentyOne() {
        int bufferVar = 0;
        int sizeNewArr = 0;
        int number = 0;
        for(int count = 0; count < arr.length; count++) {
            if(arr[count] % 21 == 0) {
                sizeNewArr++;
            }
        }
        int [] byTwentyOne = new int[sizeNewArr];
        for(int count = 0; count < arr.length; count++) {
            if(arr[count] % 21 == 0) {
                byTwentyOne[number] = arr[count];
                number++;
            }
        }
        for(int count = 0; count < byTwentyOne.length; count++) {
            for(int i = 0; i < byTwentyOne.length; i++) {
                if(byTwentyOne[count] < byTwentyOne[i]) {
                    bufferVar = byTwentyOne[i];
                    byTwentyOne[i] = byTwentyOne[count];
                    byTwentyOne[count] = bufferVar;
                }
            }
        }
        
        return byTwentyOne;
    } */
    
    int anymore[];
    public int[] more() {
        int bufferVar = 0;
        int sizeNewArr = 0;
        int number = 0;
        for(int count = 0; count < arr.length; count++) {
            if((arr[count] % 3 != 0) && (arr[count] % 7 != 0) && (arr[count] % 21 != 0)) {
                sizeNewArr++;
            }
        }
        anymore = new int[sizeNewArr];
        for(int count = 0; count < arr.length; count++) {
            if((arr[count] % 3 != 0) && (arr[count] % 7 != 0) && (arr[count] % 21 != 0)) {
                anymore[number] = arr[count];
                number++;
            }
        }
        for(int count = 0; count < anymore.length; count++) {
            for(int i = 0; i < anymore.length; i++) {
                if(anymore[count] < anymore[i]) {
                    bufferVar = anymore[i];
                    anymore[i] = anymore[count];
                    anymore[count] = bufferVar;
                }
            }
        }
        
        return anymore;
    }
    
   /* public void printArrays() {
        for(int i = 0; i < arr.length; i++) {
            if(i + 1 == arr.length) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        
        if(divilibleBy(3).length == 0) {
                System.out.println("Нет элементов делимых на 3");
        } else {
            for(int i = 0; i < divilibleBy(3).length; i++) {
                if(i + 1 == divilibleBy(3).length) {
                    System.out.println(divilibleBy(3)[i]);
                } else {
                    System.out.print(divilibleBy(3)[i] + " ");
                }
            }
        }
        if(divilibleBy(7).length == 0) {
                System.out.println("Нет элементов делимых на 7");
        } else {
            for(int i = 0; i < divilibleBy(7).length; i++) {
                if(i + 1 == divilibleBy(7).length) {
                    System.out.println(divilibleBy(7)[i]);
                } else {
                    System.out.print(divilibleBy(7)[i] + " ");
                }
            }
        } 
            
        if(divilibleBy(21).length == 0) {
                System.out.println("Нет элементов делимых на 21");
        } else {
            for(int i = 0; i < divilibleBy(21).length; i++) {
                if(i + 1 == divilibleBy(21).length) {
                    System.out.println(divilibleBy(21)[i]);
                } else {
                    System.out.print(divilibleBy(21)[i] + " ");
                }
            }
        }
    }*/
    
    
    public void printBy(int x[], String y) {
        if(x.length == 0) {
            if(y.equals("not")) {
                System.out.println("Нет элементов не вошедших ни в один список");
            } else {
                System.out.println("Список " + y + " пуст");
            }
        } else {
            for(int i = 0; i < x.length; i++) {
                if(i + 1 == x.length) {
                    System.out.println(x[i]);
                } else {
                    System.out.print(x[i] + " ");
                }
            }
        }
    }
    
    public int[] clear(int array[]) {
        array = new int [0];
        //array[0] = 0;
        return array;
    }
    
    int allArrays [];
    public int[] merge() {
        int arrayLangth = (byThree.length + bySeven.length + byTwentyOne.length);
        int array[] = new int[arrayLangth];
        int count = 0;
            if(byThree.length > 0) {
                for(int i = 0; i < byThree.length; i++) {
                    array[count] = byThree[i];
                    count++;
                }
            } 
            if (bySeven.length > 0) {
                for(int i = 0; i < bySeven.length; i++) {
                    array[count] = bySeven[i];
                    count++;
                }
            } 
            if(byTwentyOne.length > 0) {
                for(int i = 0; i < byTwentyOne.length; i++) {
                    array[count] = byTwentyOne[i];
                    count++;
                }
            }
        return array;
    }
    
    public void comands(){
        System.out.print("Введите команду: ");
        String com;
        com = go.nextLine();
        if(com.equals("print")) {
            printBy(arr, "");
            printBy(byThree, "x");
            printBy(bySeven, "s");
            printBy(byTwentyOne, "m");
        } else if (com.equals("print x")) {
            printBy(byThree, "x");
        } else if (com.equals("print s")) {
            printBy(bySeven, "s");
        } else if (com.equals("print m")) {
            printBy(byTwentyOne, "m");
        } else if (com.equals("anyMore")) {
            printBy(anymore, "not");
        } else if (com.equals("help")) {
            System.out.println("Список команд: print - вывод всех списков" + "\n"
                    + "print (x, s или m) - выводит один из 3 списков" + "\n"
                    + "anyMore - вывод элементов не вошедших ни в одни из списков" + "\n"
                    + "merge - слить все списки в один, вывести на экран и очистить все списки" + "\n"
                    + "clear (x, s или m) - очистка выбраного списка" + "\n"
                    + "help - вывод списка команд" + "\n"); 
        } else if (com.equals("init array")) {
            howElements();
            divilibleBy(3);
            divilibleBy(7);
            divilibleBy(21);
            more();
        } else if (com.equals("clear x")) {
            byThree = clear(byThree);
        } else if (com.equals("clear s")) {
            bySeven = clear(bySeven);
        } else if (com.equals("clear m")) {
            byTwentyOne = clear(byTwentyOne);
        } else if (com.equals("merge")) {
           allArrays = merge();
           printBy(allArrays, "");
           byThree = clear(byThree);
           bySeven = clear(bySeven);
           byTwentyOne = clear(byTwentyOne);
        }
        comands();
    }
}


