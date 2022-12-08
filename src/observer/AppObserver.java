package observer;


public class AppObserver {
	public static void main(String[] args) {
		
		SAtaque ataque = new SAtaque();
		SLutador lutador = new SLutador("Megalodon",ataque);
		
		//setar ataque
		MoldeAtaque ataca = new MoldeAtaque();
		ataca.setImpactoAtaque(10);
		ataca.setNome("Ataque do Megalodon");
		
		System.out.println(ataca.getNome()+" = "+ataca.getImpactoAtaque());
		ataque.setAtaque(ataca);
		ataque.notificarAtaque();
	}
}
