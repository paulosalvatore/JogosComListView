package paulosalvatore.com.br.jogoscomlistview.model;

/**
 * Created by paulo on 07/04/2017.
 */

public class Jogo
{
	private int id;
	private String nome;
	private int anoLancamento;
	private int resourceIdImagem;

	public Jogo()
	{
	}

	public Jogo(int id, String nome, int anoLancamento, int resourceIdImagem)
	{
		this.id = id;
		this.nome = nome;
		this.anoLancamento = anoLancamento;
		this.resourceIdImagem = resourceIdImagem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public int getResourceIdImagem() {
		return resourceIdImagem;
	}

	public void setResourceIdImagem(int resourceIdImagem) {
		this.resourceIdImagem = resourceIdImagem;
	}
}
