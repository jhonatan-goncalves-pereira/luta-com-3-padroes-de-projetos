package decorator;
// Online IDE - Code Editor, Compiler, Interpreter

public class AppDecorator{
    public static void main(String[] args) {
        ArmaduraCouro a1= new ArmaduraCouro();
        Componentes c = new ElmoCouro(a1);
        c=new CouracaCouro(a1);
        c= new EscudoMadeira(a1);
        
        System.out.println(c.getNome());
        System.out.println(c.getForca());
        System.out.println(c.getDefesa());
        System.out.println(c.getVelocidade());
    }
}
