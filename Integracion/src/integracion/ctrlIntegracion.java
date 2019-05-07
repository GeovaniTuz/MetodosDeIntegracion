package integracion;

/**
 *
 * @author geovani
 */
public class ctrlIntegracion {

    csTrapecio Trapecio;

    public ctrlIntegracion(csTrapecio Trapecio) {
        this.Trapecio = Trapecio;
    }

    public double getTrapecio() {
        double resultado;
        double fa = this.fx(this.Trapecio.getA());
        double fb = this.fx(this.Trapecio.getB());

        double suma = 0;

        for (int i = 1; i <= this.Trapecio.getN() - 1; i++) {
            suma = this.fx(i * this.Trapecio.getH()
                    + this.Trapecio.getA());
        }
        resultado = (this.Trapecio.getH() / 2) * (fa + fb + 2 * suma);
        return resultado;
    }

    public double fx(double x) {
        return Math.PI * (Math.pow((1 + Math.pow(x, 2) / 2), 2));
    }

}
