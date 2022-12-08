package strategy;

public class CabecadaFatal implements IAtaquebasico {

	@Override
	public float atacar(float forca) {
		System.out.println(" Cabeçada fatal   " + forca);
		return forca+1;
	}

	

}
