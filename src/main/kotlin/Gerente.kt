class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    var senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    fun autentica(senha: Int): Boolean {
        if(senha == this.senha) {
            return true
        }
        return false
    }

    override fun bonificacao(): Double {
        return salario
    }
}
