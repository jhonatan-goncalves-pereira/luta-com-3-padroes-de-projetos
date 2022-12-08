package strategy;

import adapter.IAnimalfogo;

public class Raposa extends AnimaisPre implements IAnimalfogo {

	public Raposa() {
		this.setNome("Hati");
        this.setForca(70f);
        this.setDefesa(100f);
        this.setVelocidade(2.3f);
        this.setLife(1000f);
        this.setXp(0);
	}

	@Override
	public float especial(float forca) {
		System.out.println("Furias dos irmaos Skoll e Hati");
		return forca+20;
		
	}

	@Override
	public void chamasdoexilio(float forca) {
		System.out.println("Garras de fogo" + forca);
		
	}

	@Override
	public void ataqueflamenjante(float forca) {
		System.out.println("Caça do sol " + forca);
		
	}

}
