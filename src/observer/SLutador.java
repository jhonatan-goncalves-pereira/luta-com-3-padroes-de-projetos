package observer;

public class SLutador implements ILutador{
	private String nomeAtacante;
	
	public SLutador(String nomeA, IAtaque pedido) {
		this.nomeAtacante=nomeA;
		pedido.addAtaque(this);
	}
	
	@Override
	public void update(MoldeAtaque pe) {
		System.out.println("Observer");
		System.out.println(nomeAtacante + " bateu ");	
	}

}
