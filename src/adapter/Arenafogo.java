package adapter;

import strategy.AnimaisPre;

public class Arenafogo{
    private String nome;
    private String descricao;
    private AnimaisPre animal;
    
    public void setAnimal(AnimaisPre animal) {
		this.animal = animal;
	}
    public Arenafogo(){
        this.nome="Arena Vucanica";
        this.descricao="muito quente cuidado vai derrete";
    }
    
    public void inciarLuta(IAnimalfogo fogo){
        fogo.chamasdoexilio(animal.getForca());
        fogo.ataqueflamenjante(animal.getForca());
    }
    
}


