fun main(args: Array<String>) {


    // Exercice 1 : Mois
 /*println("Entrez un nombre entre 1 et 12 :")
    val mois = readLine()!!.toInt()
    when (mois) {
        1 -> println("Janvier")
        2 -> println("Février")
        3 -> println("Mars")
        4 -> println("Avril")
        5 -> println("Mai")
        6 -> println("Juin")
        7 -> println("Juillet")
        8 -> println("Août")
        9 -> println("Septembre")
        10 -> println("Octobre")
        11 -> println("Novembre")
        12 -> println("Décembre")
        else -> println("Nombre invalide, entrez un nombre entre 1 et 12.")
    }
 */




    // Exercice 2 : Mois
  /*
 println("Entrez entier 1 ")
    val entier1 = readLine()!!.toInt()
    println("Entrez une opération (+,-,x ou /) ")
    val opertaion = readLine()
    println("Entrez entier 2 ")
    val entier2 = readLine()!!.toInt()
    if (entier1 != null && entier2 != null && opertaion != null) {
     val resultat = when (opertaion) {
        "+" -> entier1 + entier2
        "-" -> entier1 - entier2
        "x" -> entier1 * entier2
        "/" -> if (entier2 != 0) entier1 / entier2 else "Erreur : Division par zéro."
        else -> "Opération invalide."
    }
    println("Résultat : $resultat")
} else {
    println("Entrée invalide.")
}
*/




    // Exercice 3 : Conversion de durées
/*  println("Entrez un nombre de secondes :")
    val secondes = readLine()?.toIntOrNull()
    if (secondes != null && secondes >= 0) {
        val jours = secondes / 86400
        val heures = (secondes % 86400) / 3600
        val minutes = (secondes % 3600) / 60
        val sec = secondes % 60
        println("Cette durée équivaut à $jours jours $heures heures $minutes minutes $sec secondes")
    } else {
        println("Entrée invalide. Veuillez entrer un nombre de secondes positif.")
    }  */

/*
    // Exercice 4 : Classement de 3 nombres
    println("Entrez trois nombres :")
    val n1 = readLine()?.toIntOrNull()
    val n2 = readLine()?.toIntOrNull()
    val n3 = readLine()?.toIntOrNull()

    if (n1 != null && n2 != null && n3 != null) {
        var min = n1
        var mid = n2
        var max = n3

        if (n2 < min) {
            min = n2
            mid = n1
        }
        if (n3 < min) {
            min = n3
            mid = n2
            max = n1
        }
        if (n3 < mid) {
            min = n2
            mid = n3
            max = n1
        }

        println("Nombres triés : $min $mid $max")
    } else {
        println("Entrée invalide.")
    }
*/
/*
 //Exercice 5 : Affichage de motifs.
    print("Donnez la taille du motif : ")
    val size = readLine()?.toIntOrNull() ?: return

    print("Donnez le symbole du motif : ")
    val symbol = readLine()?.firstOrNull() ?: return

    for (i in 1..size step 2) {
        print(" ".repeat((size - i) / 2))
        for (j in 1..i) {
            print("$symbol ")
        }
        println()
    }

    for (i in size - 2 downTo 1 step 2) {
        print(" ".repeat((size - i) / 2))
        for (j in 1..i) {
            print("$symbol ")
        }
        println()
    }
*/







}