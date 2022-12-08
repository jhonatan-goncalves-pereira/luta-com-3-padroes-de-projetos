package observer;

public interface IAtaque {
	 void addAtaque(ILutador ataque);
	 void rmAtaque(ILutador ataque);
	 void notificarAtaque();
}
