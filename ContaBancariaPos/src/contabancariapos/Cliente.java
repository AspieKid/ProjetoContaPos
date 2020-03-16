package contabancariapos;

/**
 *
 * @author belinatti
 */
 
class Cliente {
	private String nome;
	private String endereco;
	private String cpf;
	private int idade;
	public void mudaCPF(String cpf) {
		validaCPF(cpf);
		this.cpf = cpf;
	}
}
