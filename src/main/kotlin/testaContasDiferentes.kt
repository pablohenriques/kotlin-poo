fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(titular = "Alex", numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = "Fran", numero = 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Deposita. Corrente: ${contaCorrente.saldo} - Poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saca. Corrente: ${contaCorrente.saldo} - Poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Transfere. Corrente: ${contaCorrente.saldo} - Poupança: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("Transfere. Corrente: ${contaCorrente.saldo} - Poupança: ${contaPoupanca.saldo}")
}
