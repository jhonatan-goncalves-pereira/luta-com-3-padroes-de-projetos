package strategy;

public class FurriaTerra implements IAtaqueElementa {

	@Override
	public float atacarEspecial(float forca) {
		System.out.println("Furia de terra");
		return forca+10;
	}

}
