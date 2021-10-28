package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.agencia = 146;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		
		segundaConta.agencia = 146;
		
		System.out.println("a primeira conta tem " + primeiraConta.saldo);
		System.out.println("a segunda conta tem " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		System.out.println(primeiraConta.titular);

		System.out.println(segundaConta.agencia);
		System.out.println(segundaConta.numero);
		System.out.println(segundaConta.titular);
		
		if(primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		} else {
			System.out.println("contas diferentes");
		}
	}
}
