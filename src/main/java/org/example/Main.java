package org.example;


import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Worker firstWorker = new Worker("Paweł", "Kowalski", 30, 1);
        Worker secondWorker = new Worker("Katarzyna", "Nowak", 27, 2);

        ArrayList<Worker> workerArrayList = new ArrayList<>();
        workerArrayList.add(firstWorker);
        workerArrayList.add(secondWorker);
        int arrayListSize = workerArrayList.size();

        if (!workerArrayList.isEmpty()) {
            System.out.println("Lista nie jest pusta");
            for (int s = 0; s < workerArrayList.size(); s++) {
                String currentLastName = workerArrayList.get(s).getLastName();
                if (currentLastName.equalsIgnoreCase("Nowak")) {
                    System.out.println("Worker został znaleziony");
                }
            }

        } else {
            System.out.println("Lista jest pusta");
        }

        System.out.println("Podaj nazwisko pracownika:");
        String lastNameScanner = scanner.nextLine();

        System.out.println("Podaj index pracownika:");

        int index = scanner.nextInt();



        try{
            String lastName = workerArrayList.get(index).getLastName();
            System.out.println(lastName);
            if(lastNameScanner.equalsIgnoreCase(lastName)){
            System.out.println("Nowak works in our company");}
            else {System.out.println("Worker is not on the list");}
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Niepoprawny parametr rozmiar tablicy to:"+ arrayListSize);
        } catch (Exception r) {
            System.out.println("Niepoprawny parametr rozmiar tablicy to:" + arrayListSize);
        }


                Worker workerNowak =  workerArrayList.stream()
                        .filter(worker -> worker.getLastName().equalsIgnoreCase("Nowak"))
                        .findFirst()
                .orElseThrow(()->new NoSuchElementException("Nie ma Nowaka"));






        /*boolean isNowak = firstWorker.getLastName().equalsIgnoreCase("Nowak");

        String isNowakString = firstWorker.getLastName().equalsIgnoreCase("Nowak")?"YES":"NO";*/



    }
}