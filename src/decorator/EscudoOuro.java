package decorator;
public class EscudoOuro extends Componentes{
    public  EscudoOuro (Armadura armadura){
        super(armadura);
        this.nome="Escudo de Ouro dos irmão ruda";
        this.forca=31f;
        this.defesa=21f;
        this.velocidade=2f;
        this.life=32f;
        this.valor=32f;
    }
}