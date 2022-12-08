package adapter;

import strategy.AnimaisPre;

public class RunaVento implements IAnimalvento{
     private float decrementoForca;
     private AnimaisPre animal;

     public RunaVento(AnimaisPre animal){
        this.decrementoForca=10f;
	   this.animal = animal;
     }

	@Override
	public void ventania(float forca) {
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

		}else if (animal instanceof IAnimalagua ) {
    			IAnimalagua a = (IAnimalagua) animal;
			a.furiaPosedon(animal.getForca()- this.decrementoForca);

		}
		
	}

	@Override
	public void furacao(float forca) {
		if(animal instanceof IAnimalfogo ) {
    			IAnimalfogo b = (IAnimalfogo) animal;
			b.ataqueflamenjante(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalterra ) {
    			IAnimalterra b = (IAnimalterra) animal;
			b.terremoto(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalraio ) {
    			IAnimalraio b = (IAnimalraio) animal;
			b.raiosvelozes(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalagua ) {
    			IAnimalagua b = (IAnimalagua) animal;
			b.ataqueElementaragua(animal.getForca()- this.decrementoForca);

		}
		
	}
    
   
}