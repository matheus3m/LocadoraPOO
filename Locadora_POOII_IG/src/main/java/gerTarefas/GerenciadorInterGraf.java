
package gerTarefas;

import intergraf.FrmPrincipal;
import intergraf.DlgCadCliente;
import intergraf.DlgCadFilme;
import intergraf.DlgCadPedido;
import intergraf.DlgPesqCliente;
import intergraf.DlgPesqFilme;

import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class GerenciadorInterGraf {

    private Object lblIcon;

    private FrmPrincipal princ;
    private DlgCadCliente cli;
    private DlgCadPedido ped;
    private DlgCadFilme fil;
    private DlgPesqCliente pesqCli;
    private DlgPesqFilme pesqFil;

    public GerenciadorInterGraf() {
            princ = null;
            cli = null;
            ped = null;
            fil = null;
            pesqCli = null;
            pesqFil = null;
    }
    
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null) {
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class, GerenciadorInterGraf.class).newInstance(parent, true, this);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(princ, "Erro ao abrir a janela " + classe.getName());
            }
        }
        dlg.setVisible(true);
        return dlg;
    }
    
    public void abrirJanPrincipal() {
        // JFRAME
        princ = new FrmPrincipal(this);
        princ.setVisible(true);
    }
    
    public void abrirCadCliente() {
        cli = (DlgCadCliente) abrirJanela(princ, cli, DlgCadCliente.class);
    }
    
    public void abrirCadPedido() {
        ped = (DlgCadPedido) abrirJanela(princ, ped, DlgCadPedido.class);
    }
    
    public void abrirCadFilme() {
        fil = (DlgCadFilme) abrirJanela(princ, fil, DlgCadFilme.class);
    }
    
    public void abrirPesqCliente() {
        pesqCli = (DlgPesqCliente) abrirJanela(princ, pesqCli, DlgPesqCliente.class);
    }
    
    public void abrirPesqFilme() {
        pesqFil = (DlgPesqFilme) abrirJanela(princ, pesqFil, DlgPesqFilme.class);
    }
    
    public static void main(String[] args) {
        GerenciadorInterGraf gerIG = new GerenciadorInterGraf();
        gerIG.abrirJanPrincipal();
    }

}
