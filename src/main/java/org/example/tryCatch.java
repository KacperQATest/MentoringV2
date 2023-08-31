package org.example;
import org.junit.Assert;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class tryCatch {

    public static void main(String[] args){
            int tab[] = {1,2,3,4,5};
            Scanner odczyt = new Scanner(System.in);
            int index= -1;

            System.out.println("Podaj indeks tablicy, który chcesz zobaczyć: ");
            index = odczyt.nextInt();

            try {
                System.out.println(tab[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);

            } catch (InputMismatchException o) {
                System.out.println("Wpisz poprawny format");
            }

        String[] array = {"foo", "bar"};
        List<String> list = Arrays.asList(array);

        Assert.assertTrue(list.contains("fa1212oo"));
        }





    }

