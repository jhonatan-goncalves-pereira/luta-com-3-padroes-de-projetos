package decorator;
public class ElmoOuro extends Componentes{
    public ElmoOuro(Armadura armadura){
        super(armadura);
        this.nome="Elmo de Ouro";
        this.forca=11f;
        this.defesa=45f;
        this.velocidade=1f;
        this.life=21f;
        this.valor=20f;
    }
}