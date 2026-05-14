package ar.edu.info.unlp.ejercicioPlanesMedicos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlanMedicoTest {

    private Afiliado pedro;

    @BeforeEach
    void setUp() {
        pedro = new Afiliado("Pedro", 2, 100000, LocalDate.of(1997, 1, 1));
    }

    @Test
    void testPlanObligatorioSinCoseguro() {
        PlanMedico plan = new PlanObligatorio(LocalDate.now(), 15000, 3500);
        pedro.setPlanMedico(plan);

        assertEquals(23000, plan.calcularMonto(pedro));
    }
}
