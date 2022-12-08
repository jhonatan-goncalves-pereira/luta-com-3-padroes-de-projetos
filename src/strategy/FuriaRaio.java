package strategy;

public class FuriaRaio implements IAtaqueElementa {

	@Override
	public float atacarEspecial(float forca) {
		System.out.println("Furia de raio");
		return forca+10;
	}


	

}
