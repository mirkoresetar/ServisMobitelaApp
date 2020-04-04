/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.servismobitelaapp.view;

import hr.edunova.servismobitelaapp.controller.Obrada;
import hr.edunova.servismobitelaapp.controller.ObradaKorisnik;
import hr.edunova.servismobitelaapp.model.Korisnik;
import hr.edunova.servismobitelaapp.util.EdunovaException;
import hr.edunova.servismobitelaapp.util.Pomocno;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mirko
 */
public class ViewKorisnik extends javax.swing.JFrame {

    private final ObradaKorisnik obrada;

    /**
     * Creates new form Korisnik
     */
    public ViewKorisnik() {
        initComponents();
        obrada = new ObradaKorisnik();
    }

    private void ucitaj() {

        DefaultListModel<Korisnik> k = new DefaultListModel<>();
        obrada.getPodaci(txtUvjet.getText().trim()).forEach(s -> k.addElement(s));
        lstPodaci.setModel(k);
    }

    private void ucitajVrijednosti() {
        obrada.getEntitet().setIme(txtIme.getText());
        obrada.getEntitet().setPrezime(txtPrezime.getText());
        obrada.getEntitet().setTelefon(Pomocno.getCijeliBrojIzStringa(txtTelefon.getText()));
        obrada.getEntitet().setEmail(txtEmail.getName());
    }

    private void postaviVrijednosti() {
        txtIme.setText(obrada.getEntitet().getIme());
        txtPrezime.setText(obrada.getEntitet().getPrezime());
        txtTelefon.setText(Pomocno.getFormatCijelogBroja(obrada.getEntitet().getTelefon()));
        txtEmail.setText(obrada.getEntitet().getEmail());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUvjet = new javax.swing.JTextField();
        jbtnTrazi = new javax.swing.JButton();
        txtIme = new javax.swing.JTextField();
        txtPrezime = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jbtnDodajNovi = new javax.swing.JButton();
        jbtnPromijeni = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        jbtnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jbtnTrazi.setText("Trazi");
        jbtnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTraziActionPerformed(evt);
            }
        });

        txtIme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImeActionPerformed(evt);
            }
        });

        txtPrezime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrezimeActionPerformed(evt);
            }
        });

        txtTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jbtnDodajNovi.setText("Dodaj novi");
        jbtnDodajNovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDodajNoviActionPerformed(evt);
            }
        });

        jbtnPromijeni.setText("Promijeni");
        jbtnPromijeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPromijeniActionPerformed(evt);
            }
        });

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel3.setText("Telefon");

        jLabel4.setText("Email");

        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jbtnObrisi.setText("Obrisi");
        jbtnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnTrazi))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIme)
                    .addComponent(txtEmail)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnDodajNovi)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnPromijeni)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnObrisi))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrezime)
                    .addComponent(txtTelefon))
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTrazi))
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnDodajNovi)
                            .addComponent(jbtnPromijeni)
                            .addComponent(jbtnObrisi)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtImeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImeActionPerformed

    private void txtPrezimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrezimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrezimeActionPerformed

    private void jbtnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTraziActionPerformed
        ucitaj();
    }//GEN-LAST:event_jbtnTraziActionPerformed

    private void txtTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtUvjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjetActionPerformed

    }//GEN-LAST:event_txtUvjetActionPerformed

    private void jbtnDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajNoviActionPerformed
       try {
            obrada.setEntitet(new Korisnik());
            ucitajVrijednosti();
            obrada.create();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(null, ex.getPoruka());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }//GEN-LAST:event_jbtnDodajNoviActionPerformed

    private void jbtnPromijeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPromijeniActionPerformed
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
    }//GEN-LAST:event_jbtnPromijeniActionPerformed

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        obrada.setEntitet(lstPodaci.getSelectedValue());
        if (obrada.getEntitet() == null) {
            return;
        }
        postaviVrijednosti();
    }//GEN-LAST:event_lstPodaciValueChanged

    private void jbtnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnObrisiActionPerformed
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
    }//GEN-LAST:event_jbtnObrisiActionPerformed

    private void txtUvjetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ucitaj();
        }
        
    }//GEN-LAST:event_txtUvjetKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnDodajNovi;
    private javax.swing.JButton jbtnObrisi;
    private javax.swing.JButton jbtnPromijeni;
    private javax.swing.JButton jbtnTrazi;
    private javax.swing.JList<Korisnik> lstPodaci;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtTelefon;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables
}
