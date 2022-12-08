package strategy;

import adapter.IAnimalfogo;
import adapter.IAnimalagua;
import adapter.IAnimalterra;
import adapter.IAnimalvento;

public abstract class DragaoAncestral extends AnimaisPre implements IAnimalterra,IAnimalfogo, IAnimalagua,IAnimalvento {

	public DragaoAncestral() {
		this.setNome("J");
        this.setForca(80f);
        this.setDefesa(200f);
        this.setVelocidade(3.3f);
        this.setLife(1500f);
        this.setXp(0);
	}

	

	@Override
	public void ataqueTerra(float forca) {
		System.out.println("quebra ossos " + forca);
		
	}

	@Override
	public void terremoto(float forca) {
		System.out.println("Pulo duplo " + forca);
		
	}

	@Override
	public void ventania(float forca) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void furacao(float forca) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float especial(float forca) {
		return forca + 20;
	}

}