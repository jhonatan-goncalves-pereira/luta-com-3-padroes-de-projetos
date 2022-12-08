package decorator;
public abstract class Componentes extends Armadura{
    private Armadura armadura;
    
    public Componentes (Armadura armadura){
        this.armadura = armadura;
    }
    
    public Armadura getArmadura(){
        return armadura;
    }
    
    @Override
    public String getNome(){
        return armadura.getNome() + " ; "+ this.nome;
    }
    @Override
    
    public float getForca() {
		return this.forca + armadura.getForca();
	}
	
	@Override
	public float getDefesa() {
		return this.defesa + armadura.getDefesa();
	}
	
	@Override
	public float getVelocidade() {
		return this.velocidade + armadura.getVelocidade();
	}
	
	@Override
	public float getLife() {
		return this.life + armadura.getLife();
	}
	
	@Override
	public float getValor() {
		return this.valor + armadura.getValor();
	}
}