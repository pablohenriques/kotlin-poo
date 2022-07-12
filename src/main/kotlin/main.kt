fun main() {
    println("Bem vindo ao bytebank")

    val alex = Funcionario("Alex", "111.111.111-12", salario = 1000.0)

    println("Nome: ${alex.nome} - CPF: ${alex.nome} - Salário: ${alex.salario}")
    println("Bonificação do ${alex.nome}: ${alex.bonificacao()}")

    val fran = Gerente("Fran", "222.222.222-23", salario = 2000.0, senha = 1234)

    println("Nome: ${fran.nome} - CPF: ${fran.nome} - Salário: ${fran.salario}")
    println("Bonificação da ${fran.nome}: ${fran.bonificacao()}")

    if(fran.autentica(12345)){
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }
}


