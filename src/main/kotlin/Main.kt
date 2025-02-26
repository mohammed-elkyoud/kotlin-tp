import java.util.Scanner

abstract class Parking {
    abstract fun ajouterVehicule(vehicule: Vehicule)
    abstract fun retirerVehicule()
    abstract fun afficherInfos()
}

open class Vehicule(
    val conducteur: String,
    val marque: String,
    val dateArrivee: String,
    var dateSortie: String? = null
) {
    open fun afficherInfos() {
        println("Conducteur: $conducteur, Marque: $marque, Arrivée: $dateArrivee, Sortie: ${dateSortie ?: "Non définie"}")
    }
}

class Voiture(
    conducteur: String,
    marque: String,
    val modele: String,
    val nombreDePlaces: Int,
    dateArrivee: String
) : Vehicule(conducteur, marque, dateArrivee) {
    override fun afficherInfos() {
        println("Voiture - Modèle: $modele, Places: $nombreDePlaces")
        super.afficherInfos()
    }
}

class Camion(
    conducteur: String,
    marque: String,
    val tonnage: Int,
    dateArrivee: String
) : Vehicule(conducteur, marque, dateArrivee) {
    override fun afficherInfos() {
        println("Camion - Tonnage: $tonnage")
        super.afficherInfos()
    }
}

class Utilisateur(val nomUtilisateur: String, val motDePasse: String)

class ParkingTab(capacite: Int) : Parking() {
    private val vehicules = mutableListOf<Vehicule>()
    private val capaciteMax = capacite

    override fun ajouterVehicule(vehicule: Vehicule) {
        val espaceNecessaire = if (vehicule is Camion) 2 else 1
        if (vehicules.size + espaceNecessaire <= capaciteMax) {
            vehicules.add(vehicule)
            println("Véhicule ajouté au parking.")
        } else {
            println("Parking plein ! Impossible d'ajouter le véhicule.")
        }
    }

    override fun retirerVehicule() {
        if (vehicules.isNotEmpty()) {
            val vehicule = vehicules.removeAt(0)
            println("Véhicule retiré: ")
            vehicule.afficherInfos()
        } else {
            println("Aucun véhicule à retirer.")
        }
    }

    override fun afficherInfos() {
        println("Parking contient ${vehicules.size} véhicules :")
        vehicules.forEach { it.afficherInfos() }
    }
}

fun main() {
    val parking = ParkingTab(5)
    val scanner = Scanner(System.`in`)

    while (true) {
        println("\nMenu de gestion du parking")
        println("1. Ajouter une voiture")
        println("2. Ajouter un camion")
        println("3. Retirer un véhicule")
        println("4. Afficher les véhicules")
        println("5. Quitter")
        print("Votre choix: ")

        when (scanner.nextInt()) {
            1 -> {
                println("Ajout d'une voiture")
                print("Conducteur: ")
                val conducteur = scanner.next()
                print("Marque: ")
                val marque = scanner.next()
                print("Modèle: ")
                val modele = scanner.next()
                print("Nombre de places: ")
                val places = scanner.nextInt()
                print("Date d'arrivée: ")
                val dateArrivee = scanner.next()
                parking.ajouterVehicule(Voiture(conducteur, marque, modele, places, dateArrivee))
            }
            2 -> {
                println("Ajout d'un camion")
                print("Conducteur: ")
                val conducteur = scanner.next()
                print("Marque: ")
                val marque = scanner.next()
                print("Tonnage: ")
                val tonnage = scanner.nextInt()
                print("Date d'arrivée: ")
                val dateArrivee = scanner.next()
                parking.ajouterVehicule(Camion(conducteur, marque, tonnage, dateArrivee))
            }
            3 -> parking.retirerVehicule()
            4 -> parking.afficherInfos()
            5 -> {
                println("Fin du programme.")
                break
            }
            else -> println("Choix invalide, veuillez réessayer.")
        }
    }
}
