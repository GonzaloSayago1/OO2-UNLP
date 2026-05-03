package ar.edu.info.unlp.ejercicioMonitoreo;

public class MockMixtingTank extends MixingTank {
	private boolean esperado;
	
    public MockMixtingTank(boolean esperado) {
		this.esperado = esperado;
	}
    
	public boolean heatPower(int percentage) { return this.esperado; }
    public boolean mixerPower(int percentage) { return this.esperado; }
    public boolean purge() { return this.esperado; }
    public double upTo() { return 30; }
    public double temperature() { return 30; }
}
