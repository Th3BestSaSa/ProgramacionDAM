package MaquinaCafe;

public class Maquina {

	private int depositoCafe;
	private int depositoLeche;
	private int depositoVasos;
	private double monedero;
	private static final double PRECIO_CAFE=1;
	private static final double PRECIO_LECHE=0.8;
	private static final double PRECIO_CAFE_CON_LECHE=1.5;
	private static final int MAXIMO_VASOS=80;
	private static final int MAXIMO_CAFE=50;
	private static final int MAXIMO_LECHE=50;
	
	public Maquina(double monedero) {
		super();
		this.setMonedero(monedero);
		rellenar();
	}
	private void rellenar() {
		this.depositoCafe=MAXIMO_CAFE;
		this.depositoLeche=MAXIMO_LECHE;
		this.depositoVasos=MAXIMO_VASOS;
	}
	public int getDepositoCafe() {
		return depositoCafe;
	}
	public int getDepositoLeche() {
		return depositoLeche;
	}
	public int getDepositoVasos() {
		return depositoVasos;
	}
	public double getMonedero() {
		return monedero;
	}
	public void setMonedero(double monedero) {
//		if (this.monedero<=0) {
//			System.out.println("error");
//		}else {
		//si le pongo el if pinta error sin tenerlo
			this.monedero = monedero;
		//}
	}
	
	public double servirCafe(double dinero) {
		double cambio = 0;

		if (dinero < PRECIO_CAFE) {
			System.out.println("error");
		}

		cambio = dinero - PRECIO_CAFE;
		if (cambio > monedero) {
			System.out.println("error");
		}

		if (depositoVasos == 0 || depositoCafe == 0) {
			System.out.println("error");
		}

		depositoCafe--;
		depositoVasos--;
		monedero = monedero + PRECIO_CAFE;

		return cambio;
	}

	public double servirLeche(double dinero)  {
		double cambio = 0;
		if (dinero < PRECIO_LECHE) {
			System.out.println("error");

		}
		//cambio = dinero - PRECIO_LECHE;
		if (cambio > monedero) {
			System.out.println("error");

		}

		if (depositoVasos == 0 || depositoLeche == 0) {
			System.out.println("error");

		}
		depositoLeche--;
		depositoVasos--;
		monedero = monedero + PRECIO_LECHE;

		return cambio;
	}

	public double servirCafeconLeche(double dinero)  {
		double cambio = 0;

		if (dinero < PRECIO_CAFE_CON_LECHE) {
			System.out.println("error");
		}
	//	cambio = dinero - PRECIO_CAFE_CON_LECHE;
		if (cambio > monedero) {
			System.out.println("error");		}
		if (depositoVasos == 0 || depositoCafe == 0 || depositoLeche == 0) {
			cambio = dinero;
		}
		depositoLeche--;
		depositoCafe--;
		depositoVasos--;
		monedero = monedero + PRECIO_CAFE_CON_LECHE;

		return cambio;
	}

	
	public double vaciarMonedero() {
		double monederoAVaciar;
		monederoAVaciar = this.monedero;
		this.monedero = 0;
		return monederoAVaciar;
	}

	public void incrementarMonedero(double cantidad)  {
		if (cantidad <= 0) {
			System.out.println("error");	
		} 
		
		monedero = monedero + cantidad;
		
	}
	
	@Override
	public String toString() {
		return "MaquinaCafe [depositoCafe=" + depositoCafe + ", depositoLeche=" + depositoLeche + ", depositoVasos="
				+ depositoVasos + ", monedero=" + monedero + "]";
	}
	

	
}

