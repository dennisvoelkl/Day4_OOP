package org.example;
//Das was wir bisher kannten, die Main, ist ebenfalls eine KLASSE
public class Main {
    public static void main(String[] args) {
        /*
        referenzieren der Klasse mit dem Aufruf FlowerPot zu Beginn
        anasPot ist das Objekt
        */
        FlowerPot anasPot;
        //, welches mit "new" generiert wird
        anasPot = new FlowerPot("green");
        //Es ist auch möglich das in einer Zeile zu schreiben:
        // FlowerPot anasPot = new FlowerPot();
        /*
         Das erstellte Objekt "anasPot" wird jetzt mit Werten befüllt.
         Dies geschieht mit dem Punktoperator "."
         Die konkreten Werte wurden zunächst auf Papier festgehalten
        */
        anasPot.color = "braun";
        //Wenn Eigenschaft in Klasse auf "private" ist
        anasPot.setSize("mittel");
        anasPot.shape = "rund";
        anasPot.material = "Ton";
        anasPot.diameter = 30;
        anasPot.hole = true;

        //Neuer FlowerPot aus derselben Klasse erstellen!
        FlowerPot stevenPot = new FlowerPot("red");
        stevenPot.color = "silber";

        System.out.println("Farbe von Anas Pot: " + anasPot.color);
        System.out.println("Farbe von Stevens Pot: " + stevenPot.color);

        // Abfragen einer private Eigenschaft der Klasse
        // Man kann aber nicht auf die Eigenschaften zugreifen und nicht verändern, wenn die Eigenschaften auf private stehen
        // Dafür benötigen wir in der Klasse eine get Methode mit return
        System.out.println("Größe von Anas Pot: " +anasPot.toString());
        //Mit der toString Methode in einer Klasse, wird auch bei "einfacher Ausgabe" von anasPot alle Werte ausgegeben
        System.out.println(anasPot);

    }
}