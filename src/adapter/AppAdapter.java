package adapter;
import strategy.AnimaisPre;
import strategy.Megalodon;
import strategy.Raposa;

public class AppAdapter {
	public static void main(String[] args) {
	AnimaisPre raposa = new Raposa();
	AnimaisPre megalodon = new Megalodon();
	
	
	Arenafogo arena1= new Arenafogo();
	arena1.setAnimal(raposa);
	arena1.inciarLuta(raposa);
	arena1.inciarLuta(new RunaFogo(megalodon));       
	}
}
