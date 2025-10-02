package secao13.aula139.entities;

public class PessoaFisica extends Contribuintes {

	private Double gastosSaude;
	
	public PessoaFisica() {
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double impostoRenda() {
		if(getRendaAnual() < 20000.0) {
			return (getRendaAnual() * 0.15) - (getGastosSaude() * 0.5);
		} else {
			return (getRendaAnual() * 0.25) - (getGastosSaude() * 0.5);
		}
	}
}
