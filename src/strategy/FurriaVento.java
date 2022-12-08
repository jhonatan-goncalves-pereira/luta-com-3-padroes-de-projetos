package strategy;

public class FurriaVento implements IAtaqueElementa {

	@Override
	public float atacarEspecial(float forca) {
		System.out.println("Furia de Vento" );
		return forca+10;
	}

	

}
