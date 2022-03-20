package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<Lagu> listLagu = new LinkedList<>();
        Scanner inputUser = new Scanner(System.in);
        boolean finish = true;


        while (finish) {
            System.out.println("Apa yg ingin dilakukan?");
            System.out.println("1. Input Lagu");
            System.out.println("2. Hapus Lagu");
            System.out.println("3. Mainkan Lagu");
            System.out.println("4. Keluar");
            System.out.println();
            System.out.print("Masukan Pilihan: ");
            int input = inputUser.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("Input Lagu");
                    System.out.print("Judul Lagu: ");
                    String judulLagu = inputUser.next();
                    System.out.print("Nama Penyanyi: ");
                    String namaPenyanyi = inputUser.next();
                    listLagu.addLast(new Lagu(judulLagu, namaPenyanyi));
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("Hapus Lagu Di Akhir? (y/n)");
                    String cek = inputUser.next();
                    if (cek.equalsIgnoreCase("y")) {
                        listLagu.removeLast();
                        System.out.println();
                    } else if (cek.equalsIgnoreCase("n")) {
                        System.out.print("Silahkan input judul lagu yang ingin dihapus: ");
                        String judul = inputUser.next();
                        ListIterator<Lagu> iter = listLagu.listIterator();
                        while (iter.hasNext()) {
                            Lagu lg = iter.next();
                            if (lg.getJudulLagu().equalsIgnoreCase(judul)) {
                                iter.remove();
                                System.out.println();
                            }
                        }
                    } else {
                        System.out.println("silahkan input y/n");
                        System.out.println();
                    }
                }
                case 3 -> {
                    System.out.println("Mainkan Lagu");
                    ListIterator<Lagu> iterator = listLagu.listIterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    while (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    System.out.println();
                }
                case 4 -> finish = false;
            }
        }
    }
}