/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocontobancario;

import javax.swing.JOptionPane;

/**
 *
 * @author alfieri.fabio
 */
public class ContoEsteso extends ContoBancario {

    protected int fido;

    public ContoEsteso(String numeroConto) {
        super(numeroConto);
        this.fido = 1000;
    }

    public ContoEsteso(int bilancio, String numeroConto) {
        super(bilancio, numeroConto);
    }

    public ContoEsteso(int bilancio, int fido, String AlfaNumerico) {
        super(bilancio, AlfaNumerico);
        this.fido = fido;

    }

    public int getFido() {
        return fido;
    }

    public void setFido(int fido) {
    }

    @Override
    public int prelievo() {
        int soldi;
            soldi = Integer.parseInt(JOptionPane.showInputDialog("Inserire i soldi da prelevare"));
            if (bilancio +fido >= soldi) {
                bilancio = bilancio - soldi;
                System.out.println(bilancio);
            } else {
                System.out.println("I soldi da prelevare superano il suo conto.");
            }     
        return bilancio;
    }

}
