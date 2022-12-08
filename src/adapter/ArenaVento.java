package adapter;

import strategy.AnimaisPre;

public class ArenaVento{

    private String nome;
    private String descricao;
    private AnimaisPre animal;
    
    public void setAnimal(AnimaisPre animal) {
		this.animal = animal;
	}
    
    public ArenaVento(){
        this.nome="Desertica Arena";
        this.descricao="Uma ventania";
        
    }
    
    public void inciarLuta(IAnimalvento i){
        i.ventania(animal.getForca());
        i.furacao(animal.getForca());
        
    }
    
}
