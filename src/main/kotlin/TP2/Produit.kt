package TP2

class Produit(var ref: String,
              var des: String,
              var quantite: Int,
              var prixUnitaire: Double,
){
    val reference: String = ref.uppercase()
    val designation: String = des.replaceFirstChar { it.uppercase() }
    val total: Double
        get() = quantite * prixUnitaire
    init {
        require(quantite > 0) { "La quantité doit être supérieure à zéro." }
        require(prixUnitaire > 0.0) { "Le prix unitaire doit être supérieur à zéro." }
    }
    fun afficheInfos(){
        println(reference)
        println(designation)
        println(total)
    }
    constructor(ref: String, des: String, prixUnitaire: Double) : this(ref, des, 1, prixUnitaire)
}




