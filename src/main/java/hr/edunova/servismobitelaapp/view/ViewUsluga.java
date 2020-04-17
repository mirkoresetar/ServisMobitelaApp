package hr.edunova.servismobitelaapp.view;

import hr.edunova.servismobitelaapp.controller.ObradaKorisnik;
import hr.edunova.servismobitelaapp.controller.ObradaPoslovnica;
import hr.edunova.servismobitelaapp.controller.ObradaServis;
import hr.edunova.servismobitelaapp.controller.ObradaServiser;
import hr.edunova.servismobitelaapp.controller.ObradaUsluga;
import hr.edunova.servismobitelaapp.model.Clan;
import hr.edunova.servismobitelaapp.model.Korisnik;
import hr.edunova.servismobitelaapp.model.Poslovnica;
import hr.edunova.servismobitelaapp.model.Servis;
import hr.edunova.servismobitelaapp.model.Serviser;
import hr.edunova.servismobitelaapp.model.Usluga;
import hr.edunova.servismobitelaapp.util.EdunovaException;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mirko
 */
public class ViewUsluga extends javax.swing.JFrame {

    private final ObradaUsluga obrada;

    private final ObradaServis obradaServis;

    /**
     * Creates new form ViewUsluga
     */
    public ViewUsluga() {
        initComponents();
        obrada = new ObradaUsluga();
        obradaServis = new ObradaServis();
        ucitajPoslovnice();
        ucitajKorisnike();
        ucitajServisere();

        ucitaj();
        obrada.setEntitet(new Usluga());

    }

    private void ucitajPoslovnice() {
        DefaultComboBoxModel<Poslovnica> m = new DefaultComboBoxModel<>();
        new ObradaPoslovnica().getPodaci().forEach(p -> m.addElement(p));
        cmbPoslovnica.setModel(m);
    }

    private void ucitajServisere() {
        DefaultComboBoxModel<Serviser> m = new DefaultComboBoxModel<>();
        new ObradaServiser().getPodaci().forEach(p -> m.addElement(p));
        cmbServiser.setModel(m);
    }

    private void ucitajKorisnike() {
        DefaultComboBoxModel<Korisnik> m = new DefaultComboBoxModel<>();
        new ObradaKorisnik().getPodaci().forEach(p -> m.addElement(p));
        cmbKorisnik.setModel(m);
    }

    private void ucitaj() {
        DefaultListModel<Usluga> m = new DefaultListModel<>();
        obrada.getPodaci().forEach(s -> m.addElement(s));
        lstPodaci.setModel(m);
    }

    private void ucitajVrijednosti() {
        obrada.getEntitet().setImeUsluge(txtImeUsluge.getText());
        obrada.getEntitet().setPoslovnica((Poslovnica) cmbPoslovnica.getSelectedItem());
        obrada.getEntitet().setKorisnik((Korisnik) cmbKorisnik.getSelectedItem());
        obrada.getEntitet().setServiser((Serviser) cmbServiser.getSelectedItem());
        obrada.getEntitet().setVrijemeZavrsetka(new Date());

        try {
            DefaultListModel<Clan> m = (DefaultListModel<Clan>) lstOpisServisa.getModel();
            obrada.ocistiClanove();
            for (int i = 0; i < m.getSize(); i++) {
                obrada.getEntitet().getClanovi().add(m.get(i));
            }
        } catch (Exception e) {
        }
    }

    private void postaviVrijednosti() {

        txtImeUsluge.setText(obrada.getEntitet().getImeUsluge());
        txtdatumZavršetka.setText(obrada.getEntitet().getVrijemeZavrsetka().toString());

        postaviPoslovnice();
        postaviKorisnike();
        postaviServisere();
        postaviOpisServisa();

    }

    private void postaviPoslovnice() {
        for (int i = 0; i < cmbPoslovnica.getModel().getSize(); i++) {
            if (cmbPoslovnica.getModel().getElementAt(i).getSifra().equals(
                    obrada.getEntitet().getPoslovnica().getSifra())) {
                cmbPoslovnica.setSelectedIndex(i);
                break;
            }
        }
    }

    private void postaviKorisnike() {
        ComboBoxModel<Korisnik> m = cmbKorisnik.getModel();
        for (int i = 0; i < m.getSize(); i++) {
            if (m.getElementAt(i).getSifra().equals(
                    obrada.getEntitet().getKorisnik().getSifra())) {
                cmbKorisnik.setSelectedIndex(i);
                break;
            }
        }
    }

    private void postaviServisere() {
        ComboBoxModel<Serviser> m = cmbServiser.getModel();
        for (int i = 0; i < m.getSize(); i++) {
            if (m.getElementAt(i).getSifra().equals(
                    obrada.getEntitet().getServiser().getSifra())) {
                cmbServiser.setSelectedIndex(i);
                break;
            }
        }
    }

    private void postaviOpisServisa() {
        DefaultListModel<Clan> m = new DefaultListModel<>();
        obrada.getEntitet().getClanovi().forEach(c -> {
            m.addElement(c);
        });
        lstOpisServisa.setModel(m);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        btnDodajNovi = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        txtImeUsluge = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbKorisnik = new javax.swing.JComboBox<>();
        cmbServiser = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbPoslovnica = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtdatumZavršetka = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstOpisServisa = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstServisi = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        txtCijena = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        btnDodajNovi.setText("Dodaj novi");
        btnDodajNovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajNoviActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        txtImeUsluge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImeUslugeActionPerformed(evt);
            }
        });

        jLabel1.setText("Ime Usluge");

        cmbKorisnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKorisnikActionPerformed(evt);
            }
        });

        cmbServiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbServiserActionPerformed(evt);
            }
        });

        jLabel2.setText("Korisnik");

        jLabel3.setText("Serviser");

        cmbPoslovnica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPoslovnicaActionPerformed(evt);
            }
        });

        jLabel4.setText("Poslovnica");

        txtdatumZavršetka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdatumZavršetkaActionPerformed(evt);
            }
        });

        jLabel5.setText("Vrijeme Završetka");

        lstOpisServisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstOpisServisaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lstOpisServisa);

        jLabel6.setText("Opis Servisa");

        lstServisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstServisiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lstServisi);

        jLabel7.setText("Servisi");

        txtCijena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCijenaActionPerformed(evt);
            }
        });

        jLabel8.setText("Cijena");

        txtUvjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUvjetActionPerformed(evt);
            }
        });
        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUvjetKeyPressed(evt);
            }
        });

        btnTrazi.setText("Traži");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmbServiser, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbKorisnik, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbPoslovnica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(79, 79, 79))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDodajNovi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPromjeni)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnObrisi))
                                    .addComponent(txtdatumZavršetka, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtImeUsluge, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCijena)
                        .addComponent(txtUvjet))
                    .addComponent(btnTrazi))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDodajNovi)
                        .addComponent(btnPromjeni)
                        .addComponent(btnObrisi))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel6)
                                .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtImeUsluge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel4)
                                            .addGap(5, 5, 5)
                                            .addComponent(cmbPoslovnica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmbKorisnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cmbServiser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtdatumZavršetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(40, 40, 40))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnTrazi)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                            .addComponent(txtCijena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajNoviActionPerformed
        try {

            ucitajVrijednosti();
            obrada.create();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(null, ex.getPoruka());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnDodajNoviActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        if (obrada.getEntitet() == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite stavku");
            return;
        }

        ucitajVrijednosti();
        try {
            obrada.update();
            ucitaj();
        } catch (EdunovaException e) {
            JOptionPane.showMessageDialog(null, e.getPoruka());
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        if (obrada.getEntitet() == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite stavku");
            return;
        }
        try {
            obrada.delete();
            ucitaj();
        } catch (EdunovaException e) {
            JOptionPane.showMessageDialog(null, e.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed


    private void txtImeUslugeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImeUslugeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImeUslugeActionPerformed

    private void cmbServiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbServiserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbServiserActionPerformed

    private void cmbKorisnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKorisnikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKorisnikActionPerformed

    private void txtdatumZavršetkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdatumZavršetkaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatumZavršetkaActionPerformed

    private void txtCijenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCijenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCijenaActionPerformed

    private void cmbPoslovnicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPoslovnicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPoslovnicaActionPerformed

    private void txtUvjetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ucitajServise();
        }
    }//GEN-LAST:event_txtUvjetKeyPressed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        ucitajServise();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void ucitajServise() {
        DefaultComboBoxModel<Servis> m = new DefaultComboBoxModel<>();
        new ObradaServis().getPodaci(txtUvjet.getText().trim()).forEach(s -> m.addElement(s));
        lstServisi.setModel(m);
    }
    private void lstOpisServisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstOpisServisaMouseClicked
        if (evt.getClickCount() == 2) {
            int index = lstOpisServisa.locationToIndex(evt.getPoint());

            DefaultListModel<Clan> m = (DefaultListModel<Clan>) lstOpisServisa.getModel();
            m.remove(index);

            lstOpisServisa.repaint();

        }
        zbrojiCijene();
    }//GEN-LAST:event_lstOpisServisaMouseClicked

    private void txtUvjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUvjetActionPerformed

    private void lstServisiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstServisiMouseClicked

        if (evt.getClickCount() == 2) {
            int index = lstServisi.locationToIndex(evt.getPoint());
            Servis p = lstServisi.getModel().getElementAt(index);

            try {
                DefaultListModel<Clan> m = (DefaultListModel<Clan>) lstOpisServisa.getModel();
                for (int i = 0; i < m.getSize(); i++) {
                    if (m.get(i).getServis().getSifra().equals(p.getSifra())) {
                        return;
                    }
                }
            } catch (Exception e) {
            }

            Clan c = new Clan();
            c.setServis(p);
            c.setUsluga(obrada.getEntitet());

            c.setDatumZavršetka(new Date());
            DefaultListModel<Clan> m;

            try {
                m
                        = (DefaultListModel<Clan>) lstOpisServisa.getModel();
            } catch (Exception e) {
                m = new DefaultListModel<>();
                lstOpisServisa.setModel(m);
            }

            m.addElement(c);
            lstOpisServisa.repaint();

        }
        zbrojiCijene();

    }//GEN-LAST:event_lstServisiMouseClicked

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        obrada.setEntitet(lstPodaci.getSelectedValue());
        if (obrada.getEntitet() == null) {
            return;
        }
        postaviVrijednosti();
        zbrojiCijene();
    }//GEN-LAST:event_lstPodaciValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajNovi;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Korisnik> cmbKorisnik;
    private javax.swing.JComboBox<Poslovnica> cmbPoslovnica;
    private javax.swing.JComboBox<Serviser> cmbServiser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<Clan> lstOpisServisa;
    private javax.swing.JList<Usluga> lstPodaci;
    private javax.swing.JList<Servis> lstServisi;
    private javax.swing.JTextField txtCijena;
    private javax.swing.JTextField txtImeUsluge;
    private javax.swing.JTextField txtUvjet;
    private javax.swing.JTextField txtdatumZavršetka;
    // End of variables declaration//GEN-END:variables

    private void zbrojiCijene() {
        try {
            DefaultListModel<Clan> m = (DefaultListModel<Clan>) lstOpisServisa.getModel();
            BigDecimal ukupno = BigDecimal.ZERO;

            for (int i = 0; i < m.getSize(); i++) {
                ukupno = ukupno.add(m.get(i).getServis().getCijena());

            }
            txtCijena.setText(ukupno.toString());
        } catch (Exception e) {
        }
    }
}
