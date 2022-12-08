package strategy;

public class FuriaFogo implements IAtaqueElementa {
	

	@Override
	public float atacarEspecial(float forca) {
		System.out.println("Furia de fogo");
		return forca+10;
	}



}
