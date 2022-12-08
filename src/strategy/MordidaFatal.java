package strategy;

public class MordidaFatal implements IAtaquebasico {
	@Override
	public float atacar(float forca) {
		System.out.println("Mordida fatal " + forca);
		return forca+2;
	}

}
