package strategy;

import adapter.IAnimalagua;

public class Megalodon extends AnimaisPre implements IAnimalagua {
	public Megalodon() {
		this.setNome("Megalodon");
        this.setForca(70f);
        this.setDefesa(100f);
        this.setVelocidade(2.3f);
        this.setLife(1000f);
	   this.setXp(0);
	}

	@Override
	public float especial(float forca) {
		System.out.println("Furia dos mares " + forca);
		return forca+20;
		
	}

	@Override
	public void furiaPosedon(float forca) {
		System.out.println("Furia dos mares " + forca);
		
	}

	@Override
	public void ataqueElementaragua(float forca) {
		System.out.println("Ataque tubarão " + forca);
		
	}
	
	
}
