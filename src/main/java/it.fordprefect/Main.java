package it.fordprefect;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String testo = s.nextLine();
        System.out.println(testo);
        int tns =0;
        System.out.println(testo.split("/").length);
      String[] accposiz = testo.split("/");
      for (int index = accposiz.length-4; index<accposiz.length; index += 1 ) {
          System.out.println(index);



      }


    }
}
