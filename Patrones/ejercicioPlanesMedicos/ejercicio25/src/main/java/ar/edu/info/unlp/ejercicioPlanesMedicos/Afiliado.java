package ar.edu.info.unlp.ejercicioPlanesMedicos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Afiliado {
	private String nombre;
	private int familiaresACargo;
	private double salario;
	private LocalDate fechaNacimiento;
	private PlanMedico plan;
	private List<PlanMedico> previos;
	private Coseguro coseguro;
	
	public Afiliado(String nombre, int familiaresACargo, double salario, LocalDate fechaNacimiento, PlanMedico plan) {
		this.nombre = nombre;
		this.familiaresACargo = familiaresACargo;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
		this.previos = new ArrayList<PlanMedico>();
		this.plan = plan;
	}
	
	public void agregarCoseguro(Coseguro coseguro)
	{
		this.coseguro = coseguro;
	}
	
	private boolean tieneCoseguro()
	{
		return this.coseguro != null;
	}
	
	public void setPlanMedico(PlanMedico plan)
	{
		this.previos.add(this.plan);//Agrego el actual a los planes previos
		this.plan = plan;
	}
	
	public double descontarCoseguro(double monto)
	{
		if(this.tieneCoseguro())
			monto = this.coseguro.realizarDescuento(monto);
		return monto;
	}
	
	protected int getFamiliares()
	{
		return this.familiaresACargo; 
	}
	
	protected double porcentajeSalario(int cantidad)
	{
		return this.salario * (cantidad / 100.0);
	}
	
	protected double descontarViaje(double monto)
	{
		if(this.tieneCoseguro())
			monto = this.coseguro.descontarViaje(monto);
		return monto;
	}
	
	protected double descontarAntiguedad(double monto, double descuento)
	{
		if(this.tieneCoseguro())
			monto -= this.coseguro.descontarAntiguedad(descuento);
		return monto;
	}
}
