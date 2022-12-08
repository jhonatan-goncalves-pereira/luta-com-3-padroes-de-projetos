package adapter;

import strategy.AnimaisPre;

public class ArenaTerra{
    private String nome;
    private String descricao;
    private AnimaisPre animal;
    
    public void setAnimal(AnimaisPre animal) {
		this.animal = animal;
	}
    
    public ArenaTerra(){
        this.nome="Terra Arena";
        this.descricao="As terra são solidas";
    }
    
    public void inciarLuta(IAnimalterra terra){
        
        terra.ataqueTerra(animal.getForca());
        terra.terremoto(animal.getForca());
   
    }
    
}
