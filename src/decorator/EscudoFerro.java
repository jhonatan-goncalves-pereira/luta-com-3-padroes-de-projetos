package decorator;
public class EscudoFerro extends Componentes{
    public  EscudoFerro (Armadura armadura){
        super(armadura);
        this.nome="Escudo de Ferro";
        this.forca=18f;
        this.defesa=20f;
        this.velocidade=1f;
        this.life=4f;
        this.valor=10f;
    }
}