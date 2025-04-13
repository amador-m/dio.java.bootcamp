package javaBasico.cadastroPessoas;

public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa marcos = new Pessoa("125-45", "Marcos"); //Já criei a classe pessoa e agora adicionei um novo objeto à classe pessoa no sistema
		marcos.setEndereco("RUA DAS MARIAS"); //Definindo o endereço de Marcos
		System.out.println(marcos.getNome() + ": " + marcos.getCpf());
	}
}