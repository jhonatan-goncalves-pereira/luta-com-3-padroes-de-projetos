package decorator;
public class EscudoMadeira extends Componentes{
    public  EscudoMadeira (Armadura armadura){
        super(armadura);
        this.nome="EscudoMadeira";
        this.forca=1f;
        this.defesa=12f;
        this.velocidade=1f;
        this.life=2f;
        this.valor=10f;
    }
}