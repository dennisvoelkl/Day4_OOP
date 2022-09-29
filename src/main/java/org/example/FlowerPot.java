//Klasse liegt im selben Ordner wie Main, darum "org.example"
package org.example;

public class FlowerPot {
    //Wir belegen (initialisieren) z.B. den String color nicht mit einer Farbe
    //Wenn wir 1000 braune FlowerPot erzeugen möchten, aber nur in braun, kann
    //man das initialisieren.
    String color;
    private String size;
    String shape;
    String material;
    double diameter;
    boolean hole;

    //Konstruktor am Ende des Codes. Wenn dieser nicht erstellt wird, passiert das im Hintergrund automatisch
    //Der Konstruktor einer Klasse kann auch mit Informationen befüllt werden.
    FlowerPot(String color){
        System.out.println("initialColor: " + color);
        this.color = "green";
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getSize(){
    return size;
    }
    //get all Elements form Method
    public String toString(){
        return color +"\n" + size+"\n" + shape+"\n" + material+"\n" + diameter+"\n" + hole+"\n";
    }

    // Methode zum Vergleichen von Objekten und ggf. Duplikate entfernen
    // Um die Methode zu schreiben gibt es Hilfe
    // Command + N hilft bei der Auswahlmöglichkeit zum generieren der Methoden





}
