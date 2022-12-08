package strategy;


import adapter.*;


import adapter.IAnimalfogo;

public abstract  class AnimaisPre implements IAnimalagua,IAnimalterra,IAnimalfogo {
    private String nome;
    private float forca;
    private float defesa;
    private float velocidade;
    private float life;
    private int xp;
    
    private IAtaquebasico ataqueBasico; 
    private IAtaqueElementa ataqueElemento;
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public float getLife() {
		return life;
	}
	public void setLife(float life) {
		this.life = life;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}
	
	public float ataqueBasico(float forca) {
		return this.ataqueBasico.atacar(forca);
	}
	
	public float ataqueElementar(float forca) {
		return this.ataqueElemento.atacarEspecial(forca);
	}
	
	public  abstract float especial(float forca);

	
	public void setAtaqueBasico(IAtaquebasico ataqueBasico) {
		this.ataqueBasico = ataqueBasico;
	}
	public void setAtaqueElemento(IAtaqueElementa ataqueElemento) {
		this.ataqueElemento = ataqueElemento;
	}

	@Override
	public void furiaPosedon(float forca) {
		
	}

     @Override
	public void ataqueElementaragua(float forca) {
     }
	@Override
	public void chamasdoexilio(float forca) {
		
	}

	@Override
     public void ataqueflamenjante(float forca) {
		
	}

	@Override
	public void ataqueTerra(float forca) {
		
	}
	
	@Override
    	public void terremoto(float forca) {
		
	}
}

