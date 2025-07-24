package random;

import java.security.SecureRandom;// Import der Klasse SecureRandom, die für kryptografisch sichere Zufallszahlen verwendet wird.
import java.util.Random;// Klassenimport für die Random-Klasse, die Zufallszahlen generiert
public class RandomBenchmark{// Diese Klasse führt einen Benchmark-Test für die Klassen Random und SecureRandom durch, um die Leistung zu vergleichen
    public static void main(String[] args) {
        Random random = new Random();// Erzeugung einer Instanz der Random-Klasse, die Zufallszahlen generiert mit einem Standard-Seed
        long Startzeit = System.nanoTime();// Abruf und Speicherung der aktuellen Zeit in Nanosekunden, um die Startzeit der Schleife zu kennen
        for (int i = 0; i < 1000000; i++) {// Schleife zur Ausführung von 1.000.000 Iterationen zur Messung der Laufzeit und des Speicherverbrauchs der Random-Klasse
            random.nextInt();// In jeder Iteration wird mittels der Methode nextInt() eine neue Zufallszahl generiert
        }
        long Endzeit = System.nanoTime();// Erneuter Abruf und Speicherung der aktuellen Zeit in Nanosekunden, um die Endzeit der  Schleife zu kennen
        long Dauer = Endzeit - Startzeit;// Berecdhnung der Laufzeit des Schleifenblocks, indem die Endzeit von der Startzeit subtrahiert wird
        System.out.println(" Random Dauer: " + Dauer + " Nanosekunden");// Ausgabe des Ergebnisses der Laufzeit in Nanosekunden auf der Konsole

        SecureRandom secureRandom = new SecureRandom();// Erzeugung einer Instanz der SecureRandom-Klasse, 
        //die kryptografisch sichere Zufallszahlen generiert
        Startzeit = System.nanoTime();// Abruf der Startzeit für die SecureRandom-Schleife in Nanosekunden
        for (int i = 0; i < 1000000; i++) {// Schleife zur Ausführung von 1.000.000 Iterationen zur Messung der Laufzeit 
            //und des Speicherverbrauchs der SecureRandom-Klasse
            secureRandom.nextInt();// In jeder Iteration wird mittels der Methode nextInt() eine neue kryptografisch sichere Zufallszahl generiert
        }
        Endzeit = System.nanoTime();// Erneuter Abruf und Speicherung der aktuellen Zeit in Nanosekunden, um die Endzeit der der Schleife zu kennen
        Dauer = Endzeit - Startzeit;// Berechnung der Laufzeit des Schleifenblocks, indem die Endzeit von der Startzeit subtrahiert wird
        System.out.println(" SecureRandom Dauer: " + Dauer + " Nanosekunden");// Ausgabe des Ergebnisses der Laufzeit in Nanosekunden auf der Konsole
    }
}

