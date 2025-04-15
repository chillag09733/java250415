package szamalk.nezet;

import szamalk.modell.FormModell;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class GUIForm {
    private JFrame form;
    private JPanel pnlMain;
    private JComboBox cmbBox;
    private JList lista;
    private JButton btnFelvetel;
    private JButton btnMasol;

    public GUIForm(){
        ini();

        btnFelvetel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnMasol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void ini() {
        form = new JFrame("Műkincs gyűjtemény");
        form.setSize(320, 240);
        form.setContentPane(pnlMain);
        form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        DefaultListModel<String> dlm = new DefaultListModel<>();
        lista.setModel(dlm);

        JMenuItem beolvasas = new JMenuItem("Beolvasás");
        JMenuItem kilepes = new JMenuItem("Kilépés");
        JMenu menuProgram = new JMenu("Program");
        menuProgram.add(beolvasas);
        menuProgram.add(new JSeparator());
        menuProgram.add(kilepes);
        JMenuBar bar = new JMenuBar();
        bar.add(menuProgram);
        form.setJMenuBar(bar);

        form.setVisible(true);
        form.pack();

        beolvasas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        kilepes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kilep();
            }
        });
        
        form.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                kilep();
            }
        });


    }

    private void kilep() {
        String msg = "Biztos kilépsz?";
        String cim = "KILÉPÉS!";
        int opt = JOptionPane.OK_CANCEL_OPTION;

        int gomb = JOptionPane.showConfirmDialog(null, msg , cim, opt);
        if (gomb == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }
}
