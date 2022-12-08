package strategy;

import adapter.IAnimalterra;

public class MachimosaurusRex extends AnimaisPre implements IAnimalterra {

	public MachimosaurusRex() {
	   this.setNome("Rex");
        this.setForca(70f);
        this.setDefesa(100f);
        this.setVelocidade(2.3f);
        this.setLife(1000f);
        this.setXp(0);
	}

	@Override
	public float especial(float forca) {
		System.out.println("Furia de rex " + forca);
		return forca+20;
		
	}

	@Override
	public void ataqueTerra(float forca) {
		System.out.println("Jogo de terra " + forca);
		
	}

	@Override
	public void terremoto(float forca) {
		System.out.println("Pulo do rex " + forca);
		
	}

}
