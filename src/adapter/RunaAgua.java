package adapter;

import strategy.AnimaisPre;

public class RunaAgua implements IAnimalagua{
   	private float decrementoForca;
    	private AnimaisPre animal;

	public RunaAgua(AnimaisPre animal){
		this.decrementoForca=10f;
		this.animal = animal;
	}

	@Override
	public void furiaPosedon(float forca) {

		if(animal instanceof IAnimalfogo ) {
    			IAnimalfogo a = (IAnimalfogo) animal;
			a.chamasdoexilio(animal.getForca()- this.decrementoForca);
		}
		else if (animal instanceof IAnimalterra ) {
    			IAnimalterra a = (IAnimalterra) animal;
			a.ataqueTerra(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalraio ) {
    			IAnimalraio a = (IAnimalraio) animal;
			a.chidore(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalvento ) {
    			IAnimalvento a = (IAnimalvento) animal;
			a.ventania(animal.getForca()- this.decrementoForca);

		}
    	}
		
	

	@Override
	public void ataqueElementaragua(float forca) {
		if(animal instanceof IAnimalfogo ) {
    			IAnimalfogo b = (IAnimalfogo) animal;
			b.ataqueflamenjante(animal.getForca()- this.decrementoForca);
		}
		else if (animal instanceof IAnimalterra ) {
    			IAnimalterra b = (IAnimalterra) animal;
			b.terremoto(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalraio ) {
    			IAnimalraio b = (IAnimalraio) animal;
			b.raiosvelozes(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalvento ) {
    			IAnimalvento b = (IAnimalvento) animal;
			b.furacao(animal.getForca()- this.decrementoForca);

		}
		
	}
   
}
