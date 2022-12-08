package observer;

import java.util.ArrayList;
import java.util.List;

public class SAtaque implements IAtaque {
	private List<ILutador> ataques = new ArrayList<>();
	private MoldeAtaque ataque = new MoldeAtaque();

	@Override
	public void addAtaque(ILutador ataque) {
		ataques.add(ataque);
		
	}
	
	@Override
	public void rmAtaque(ILutador cli) {
		ataques.remove(cli);
		
	}

	@Override
	public void notificarAtaque() {
		for(ILutador cliete : ataques) {
			cliete.update(ataque);
		}	
	}
	
	public void setAtaque(MoldeAtaque ataq) {
		this.ataque = ataq;
	}

	

}