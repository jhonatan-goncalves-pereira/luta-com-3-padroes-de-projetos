package decorator;
public class ElmoCouro extends Componentes{
    public ElmoCouro(Armadura armadura){
        super(armadura);
        this.nome="ElmoCouro";
        this.forca=1f;
        this.defesa=2f;
        this.velocidade=0f;
        this.life=2f;
        this.valor=10f;
    }
}