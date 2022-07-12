class Gerente(
    val nome: String,
    val cpf: String,
    val salario: Double,
    var senha: Int
) {
    fun autentica(senha: Int): Boolean {
        if(senha == this.senha) {
            return true
        }
        return false
    }

    fun bonificacao(): Double {
        return salario * 0.1
    }
}