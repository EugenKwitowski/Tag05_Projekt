fun main () {
    // In dieser Datei bitte erst ab dem ersten TODO arbeiten!
    var unserInteger : Int = 15
    var unserDouble : Double = 23.2

    println("Hier kann der User etwas Eingeben:")
    var eingabe : String = readln()

    /* TODO: In dieser Datei sind einige Code Passagen auskommentiert. Sollten die Kommentar-Striche
     *  am Anfang einer Zeile stehen, so ist diese Zeile zum Bearbeiten einzukommentieren.
     *  Nutze hierfür die Tastenkombination zum Kommentieren, um etwas wieder einzukommentieren!
     *  Nun soll unsere Eingabe in unsere bereits erstellten Variablen gespeichert werden.
     *  Wandle hierfür die Eingabe in entsprechende Datentypen um und speichere diese in den Variablen.
     */

    var eingegebenerDouble : Double = 23.2         //eingabe.toDouble()
    var eingegebenerInt : Int = 15

    /* TODO: Nun wollen wir ein paar Rechenoperationen machen mit unseren Zahlen. Dafür müssen wir
     *  darauf achten, die Variablen in die richtigen Datentypen zu konvertieren.
     */

    var ergebnisDoubleAlsInt : Int = (eingegebenerDouble * eingegebenerDouble).toInt()
    var ergebnisIntAlsDouble : Double = (eingegebenerInt * eingegebenerInt).toDouble()
    var ergebnisBeider : Double = (ergebnisIntAlsDouble / (ergebnisDoubleAlsInt.toDouble()))
    var ergebnisString : String = ergebnisBeider.toString()

    // Hier werden dann einmal alle Daten auf der Konsole ausgegeben.
    println(unserInteger)
    println(unserDouble)
    println(ergebnisDoubleAlsInt)
    println(ergebnisIntAlsDouble)
    println(ergebnisBeider)
    println(ergebnisString)

    /* TODO: Was für ein Fehler kann hierbei auftreten, wenn wir den Wert, den wir von der Konsole bekommen,
     *  direkt in eine Zahl umwandeln wollen? Schreibe die Lösung hierunter.
     *
     *
     */


}