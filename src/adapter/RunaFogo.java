package adapter;

import strategy.AnimaisPre;

public class RunaFogo implements IAnimalfogo{
    private float decrementoForca;
    private AnimaisPre animal;
    
    public RunaFogo(AnimaisPre animal){
        this.decrementoForca=10f;
	   this.animal = animal;
    }

	@Override
	public void chamasdoexilio(float forca) {
		
		if (animal instanceof IAnimalterra ) {
    			IAnimalterra a = (IAnimalterra) animal;
			a.ataqueTerra(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalraio ) {
    			IAnimalraio a = (IAnimalraio) animal;
			a.chidore(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalvento ) {
    			IAnimalvento a = (IAnimalvento) animal;
			a.ventania(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalagua ) {
    			IAnimalagua a = (IAnimalagua) animal;
			a.furiaPosedon(animal.getForca()- this.decrementoForca);

		}
		
	}

	@Override
	public void ataqueflamenjante(float forca) {
		if (animal instanceof IAnimalterra ) {
    			IAnimalterra b = (IAnimalterra) animal;
			b.terremoto(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalraio ) {
    			IAnimalraio b = (IAnimalraio) animal;
			b.raiosvelozes(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalvento ) {
    			IAnimalvento b = (IAnimalvento) animal;
			b.furacao(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalagua ) {
    			IAnimalagua b = (IAnimalagua) animal;
			b.ataqueElementaragua(animal.getForca()- this.decrementoForca);

		}
		
	}
}