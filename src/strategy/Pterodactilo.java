package strategy;

import adapter.IAnimalvento;

public class Pterodactilo extends AnimaisPre implements IAnimalvento {

	public Pterodactilo() {
		this.setNome("Ruban");
        this.setForca(70f);
        this.setDefesa(100f);
        this.setVelocidade(2.3f);
        this.setLife(1000f);
	   this.setXp(0);
	}

	public float especial(Float forca) {
		System.out.println("Garras de vento ");
		return forca+20;
		
	}

	@Override
	public void ventania(float forca) {
		System.out.println("ventania" + forca);
		
	}

	@Override
	public void furacao(float forca) {
		System.out.println("Furacao razante" + forca);
		
	}

	@Override
	public float especial(float forca) {
		// TODO Auto-generated method stub
		return 0;
	}

}
