package adapter;

import strategy.AnimaisPre;

public class RunaRaio implements IAnimalraio{
    private float decrementoForca;
    private AnimaisPre animal;

    	public RunaRaio(AnimaisPre animal){
        this.decrementoForca=10f;
	   this.animal = animal;
        
    }

	@Override
	public void chidore(float forca) {
		if(animal instanceof IAnimalfogo ) {
    			IAnimalfogo a = (IAnimalfogo) animal;
			a.chamasdoexilio(animal.getForca()- this.decrementoForca);
		}
		else if (animal instanceof IAnimalterra ) {
    			IAnimalterra a = (IAnimalterra) animal;
			a.ataqueTerra(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalvento ) {
    			IAnimalvento a = (IAnimalvento) animal;
			a.ventania(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalagua ) {
    			IAnimalagua a = (IAnimalagua) animal;
			a.furiaPosedon(animal.getForca()- this.decrementoForca);

		}
		
	}

	@Override
	public void raiosvelozes(float forca) {
		if(animal instanceof IAnimalfogo ) {
    			IAnimalfogo b = (IAnimalfogo) animal;
			b.ataqueflamenjante(animal.getForca()- this.decrementoForca);
		}
		else if (animal instanceof IAnimalterra ) {
    			IAnimalterra b = (IAnimalterra) animal;
			b.terremoto(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalvento ) {
    			IAnimalvento b = (IAnimalvento) animal;
			b.furacao(animal.getForca()- this.decrementoForca);

		}else if (animal instanceof IAnimalagua ) {
    			IAnimalagua b = (IAnimalagua) animal;
			b.ataqueElementaragua(animal.getForca()- this.decrementoForca);

		}
		
	}
    
   
}