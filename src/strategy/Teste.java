package strategy;

public class Teste {

	public static void main(String[] args) {
		AnimaisPre r1 = new Raposa();
		r1.especial(10);
	    r1.setAtaqueBasico(new CabecadaFatal());
	    r1.especial(10);
		r1.setAtaqueBasico(new MordidaFatal());
	    r1.setAtaqueElemento(new FuriaFogo());
	    r1.setAtaqueBasico(new CabecadaFatal());
	    r1.ataqueBasico(10);
	    r1.ataqueElementar(10);

	}

}
