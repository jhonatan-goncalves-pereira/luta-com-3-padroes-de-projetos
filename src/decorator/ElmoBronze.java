package decorator;
public class ElmoBronze extends Componentes{
    public ElmoBronze(Armadura armadura){
        super(armadura);
        this.nome="Elmo de Brose";
        this.forca=12f;
        this.defesa=21f;
        this.velocidade=10f;
        this.life=21f;
        this.valor=10f;
    }
}