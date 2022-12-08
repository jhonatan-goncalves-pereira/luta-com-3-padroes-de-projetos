package strategy;

import adapter.IAnimalterra;

public class Titanoboa extends AnimaisPre implements IAnimalterra {

	public Titanoboa() {
		this.setNome("Jhomante");
        this.setForca(70f);
        this.setDefesa(100f);
        this.setVelocidade(2.3f);
        this.setLife(1000f);
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
	public float especial(float forca) {
		// TODO Auto-generated method stub
		return forca + 20;
	}

}
