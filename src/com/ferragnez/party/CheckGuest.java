package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        String[] invitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome");

        String guestName = scan.nextLine();

        String formattedGuestName = guestName.toLowerCase().replaceAll("\\s", "");

        Boolean isInvited = false;

        // (1) SOLUZIONE CON CICLO FOR

        // for (int i = 0; i < invitati.length; i++) {
        // if
        // (formattedGuestName.equalsIgnoreCase(invitati[i].toLowerCase().replaceAll("\\s",
        // ""))) {
        // System.out.println("Accesso consentito, Nome " + guestName + " presente in
        // lista");
        // isInvited = true;
        // break;
        // }

        // }

        // if (!isInvited) {
        // System.out.println("Spiacente, ma il nome " + guestName + " non è presente in
        // lista.");
        // }

        // (2) SOLUZIONE CON CICLO WHILE

        int index = 0;

        while (index < invitati.length) {
            if (formattedGuestName.equalsIgnoreCase(invitati[index].replaceAll("\\s", ""))) {
                System.out.println("Accesso consentito, Nome " + guestName + " presente in lista");
                isInvited = true;
                break;
            }

            index++;

        }

        if (!isInvited) {
            System.out.println("Spiacente, ma il nome " + guestName + " non è presente in lista.");
        }

        scan.close();

    }

}
