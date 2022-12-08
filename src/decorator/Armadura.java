package decorator;
public abstract class Armadura{
    protected String nome;
    protected String descricao;
    protected float forca;
    protected float defesa;
    protected float velocidade;
    protected float valor;
    protected float life;
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getForca() {
		return forca;
	}
	public void setForca(float forca) {
		this.forca = forca;
	}
	public float getDefesa() {
		return defesa;
	}
	public void setDefesa(float defesa) {
		this.defesa = defesa;
	}
	public float getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public float getLife() {
		return life;
	}
	public void setLife(float life) {
		this.life = life;
	}	
}