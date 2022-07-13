fun testaAutenticacao() {
    val gerente = Gerente("Alex", "111.1111.111.11", 1000.0, 1000)
    val diretora = Diretor("Fran", "222.222.222.22", 2000.0, 2000, 200.0)
    val sistema = SistemaInterno()

    sistema.entra(gerente, 3000)
    sistema.entra(diretora, 3000)

    val cliente = Cliente(nome="Gui", cpf="333.333.333.33", senha=1234)
    sistema.entra(cliente, 1234)
}