fun testaFuncionarios() {
    val alex = Analista("Alex", "111.111.111-12", salario = 1000.0)

    println("Nome: ${alex.nome} - CPF: ${alex.nome} - Salário: ${alex.salario}")
    println("Bonificação do ${alex.nome}: ${alex.bonificacao()}")

    val fran = Gerente("Fran", "222.222.222-23", salario = 2000.0, senha = 1234)

    println("Nome: ${fran.nome} - CPF: ${fran.nome} - Salário: ${fran.salario}")
    println("Bonificação da ${fran.nome}: ${fran.bonificacao()}")

    if (fran.autentica(12345)) {
        println("Fran autenticou com sucesso")
    } else {
        println("falha na autenticação da Fran")
    }

    val gui = Diretor(nome = "Gui", cpf = "333.333.333.-34", salario = 4000.0, senha = 4000, plr = 200.0)
    println("Nome: ${gui.nome} - CPF: ${gui.nome} - Salário: ${gui.salario}")
    println("Bonificação da ${gui.nome}: ${gui.bonificacao()}")

    if (gui.autentica(12345)) {
        println("Gui autenticou com sucesso")
    } else {
        println("falha na autenticação do Gui")
    }

    val maria = Analista("Maria", "444.444.444-44", 3000.0)

    val calculadora = CalculadoraBonificacao()

    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("total de bonificacao: ${calculadora.total}")
}