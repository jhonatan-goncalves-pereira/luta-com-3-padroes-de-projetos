package adapter;

import strategy.AnimaisPre;

public class RunaTerra implements IAnimalterra{
   	private float decrementoForca;
	private AnimaisPre animal;

    	
   	public RunaTerra(AnimaisPre animal){
        this.decrementoForca=10f;
	   this.animal = animal;
    	}

	@Override
	public void ataqueTerra(float forca) {
		if(animal instanceof IAnimalfogo ) {
    			IAnimalfogo a = (IAnimalfogo) animal;
			a.chamasdoexilio(animal.getForca()- this.decrementoForca);
	
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
	public void terremoto(float forca) {
		if(animal instanceof IAnimalfogo ) {
    			IAnimalfogo b = (IAnimalfogo) animal;
			b.ataqueflamenjante(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalraio ) {
    			IAnimalraio b = (IAnimalraio) animal;
			b.raiosvelozes(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalvento ) {
    			IAnimalvento b = (IAnimalvento) animal;
			b.furacao(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalagua ) {
    			IAnimalagua b = (IAnimalagua) animal;
			b.ataqueElementaragua(animal.getForca()- - this.decrementoForca);

		}
		
	}
    
   
}