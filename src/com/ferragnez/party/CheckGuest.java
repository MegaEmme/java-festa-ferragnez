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

        for (int i = 0; i < invitati.length; i++) {
            if (formattedGuestName.equalsIgnoreCase(invitati[i].toLowerCase().replaceAll("\\s", ""))) {
                System.out.println("Accesso consentito, Nome " + guestName + " presente in lista");
                isInvited = true;
                break;
            }

        }

        if (!isInvited) {
            System.out.println("Spiacente, ma il nome " + guestName + " non è presente in lista.");
        }

        scan.close();

    }

}
