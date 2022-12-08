package adapter;

import strategy.AnimaisPre;

public class ArenaRaio{
    private String nome;
    private String descricao;
    private AnimaisPre animal;
    
    public void setAnimal(AnimaisPre animal) {
		this.animal = animal;
	}
    
    public ArenaRaio(AnimaisPre animal){
        this.nome="Arena Raio";
        this.descricao="Cuidado para não ser eletrocutado";
       
    }
    
    public void inciarLuta(IAnimalraio raio){
        raio.chidore(animal.getForca());
        raio.raiosvelozes(animal.getForca());

    }
    
}
