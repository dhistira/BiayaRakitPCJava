/*
 * Aplikasi Hitung Biaya Rakit PC untuk Tugas Besar SDA
 * 
 * Oleh:
 * Salma Nida Khofiyya - M0518053
 * Tsamrotul Fathiyah Naelarohmah - M0518062
 * Yudhistira Bayu Wryatsongko - M0517053
 */
package rakitpc;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;

import static rakitpc.Hitung.Knap;
import static rakitpc.Hitung.minimumBiaya;
import static rakitpc.Hitung.totalHarga;

import java.awt.Color;
import javax.swing.JButton;

public class Main extends javax.swing.JFrame {
    ImageIcon img = new ImageIcon("");

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(1070,800);
    }

    private void clear() {
        BiayaField.setText(null);
        ResultArea.setText(null);
    }

    @Override
    public synchronized void addWindowListener(WindowListener wl) {
        super.addWindowListener(new WindowAdapter(){
            @Override
            public void windowOpened(WindowEvent we) {
              
            }

            @Override
            public void windowClosing(WindowEvent we) {
            }
        }); 
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(786, 131, 93, 22);
        BiayaField = new javax.swing.JTextField();
        BiayaField.setBounds(635, 169, 402, 35);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(270, 422, 38, 35);
        BuildBtn = new javax.swing.JButton();
        BuildBtn.setBounds(635, 210, 168, 30);
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane2.setBounds(635, 250, 402, 476);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(374, 38, 433, 35);
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane3.setBounds(26, 633, 567, 93);
        HTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane4.setBounds(26, 169, 567, 93);
        PTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(256, 126, 66, 35);
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane5.setBounds(26, 464, 567, 93);
        GTable = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jScrollPane6.setBounds(26, 307, 567, 93);
        RTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(270, 273, 29, 35);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(264, 585, 153, 35);
        ClearBtn = new javax.swing.JButton();
        ClearBtn.setBounds(807, 210, 230, 30);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(img.getImage());

        MainPanel.setBackground(Color.PINK);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Biaya Anda");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("VGA");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        BuildBtn.setBackground(Color.BLACK);
        BuildBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        BuildBtn.setForeground(Color.BLACK);
        BuildBtn.setText("Hitung");
        BuildBtn.setName(""); // NOI18N
        BuildBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuildBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText("HITUNG BIAYA RAKIT PC");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        HTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SEAGATE Barracuda 1TB", "704,000"},
                {"SEAGATE Barracuda 2TB", "1,069,000"},
                {"SEAGATE Skyhawk 4TB", "1,856,000"},
                {"SEAGATE Enterprise CAP SATA 6TB", "4,980,000"}
            },
            new String [] {
                "Tipe", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        HTable.setEnabled(false);
        jScrollPane3.setViewportView(HTable);

        PTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Intel i3-8350K", "2,665,000"},
                {"Intel i5-9600K", "4,675,000"},
                {"Intel i7-9700K", "7,700,000"},
                {"Intel i9-9900K", "10,175,000"},
            },
            new String [] {
                "Tipe", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PTable.setEnabled(false);
        jScrollPane4.setViewportView(PTable);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Processor");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        GTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Radeon RX 550 2GB DDR5", "1,595,000"},
                {"GeForce GTX 1060 3GB DDR5", "3,120,000"},
                {"Radeon RX 580 4GB DDR5", "4,540,000"},
                {null,null}
            },
            new String [] {
                "Seri VGA", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        GTable.setEnabled(false);
        jScrollPane5.setViewportView(GTable);

        RTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CORSAIR 4GB DDR4", "850,000"},
                {"TEAM 2 x 4GB DDR4", "987,000"},
                {"TEAM 2x8GB DDR4", "1,908,000"},
                {"CORSAIR 2 x 16GB DDR4", "5,625,000"},
            },
            new String [] {
                "Size RAM", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RTable.setEnabled(false);
        jScrollPane6.setViewportView(RTable);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("RAM");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Hard Disk");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        ClearBtn.setBackground(Color.BLACK);
        ClearBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ClearBtn.setForeground(Color.BLACK);
        ClearBtn.setText("Reset");
        ClearBtn.setName(""); // NOI18N
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(MainPanel, GroupLayout.PREFERRED_SIZE, 1447, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(818, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(MainPanel, GroupLayout.PREFERRED_SIZE, 773, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(150, Short.MAX_VALUE))
        );
        MainPanel.setLayout(null);
        MainPanel.add(jLabel3);
        MainPanel.add(jLabel5);
        MainPanel.add(jLabel1);
        MainPanel.add(jLabel7);
        MainPanel.add(jScrollPane4);
        MainPanel.add(jScrollPane3);
        MainPanel.add(jScrollPane2);
        ResultArea = new javax.swing.JTextArea();
        jScrollPane2.setViewportView(ResultArea);
        
                ResultArea.setColumns(20);
                ResultArea.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
                ResultArea.setRows(5);
                ResultArea.setFocusable(false);
        MainPanel.add(BiayaField);
        MainPanel.add(BuildBtn);
        MainPanel.add(ClearBtn);
        MainPanel.add(jLabel6);
        MainPanel.add(jLabel2);
        MainPanel.add(jScrollPane5);
        MainPanel.add(jScrollPane6);
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuildBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuildBtnActionPerformed
        int min = minimumBiaya();
        try {

            int biaya = Integer.parseInt(BiayaField.getText());

            if (biaya < min) {
                throw new MinException();
            }

            String SelectedProcessor = Knap(biaya).get(0);
            String SelectedRAM = Knap(biaya).get(1);
            String SelectedVGA = Knap(biaya).get(2);
            String SelectedHDD = Knap(biaya).get(3);

            DecimalFormat formatter = new DecimalFormat("#,###");
            
            int totalBiaya = totalHarga().get(0) + totalHarga().get(1) + totalHarga().get(2) + totalHarga().get(3);

            StringBuilder sb = new StringBuilder();
            sb.append("\t PC Anda").append("\n\n");
            sb.append("Processor: ").append(SelectedProcessor).append(" - Rp. "+formatter.format(totalHarga().get(0))).append("\n");
            sb.append("RAM: ").append(SelectedRAM).append(" - Rp. "+formatter.format(totalHarga().get(1))).append("\n");
            sb.append("VGA: ").append(SelectedVGA).append(" - Rp. "+formatter.format(totalHarga().get(2))).append("\n");
            sb.append("HDD: ").append(SelectedHDD).append(" - Rp. "+formatter.format(totalHarga().get(3))).append("\n\n");
            sb.append("Total Biaya: Rp. ").append(formatter.format(totalBiaya));

            ResultArea.setText(sb.toString());
        } catch (MinException me) {

            DecimalFormat formatter = new DecimalFormat("#,###");
            JOptionPane.showMessageDialog(this, "Waduch, kalo cuma segini jangan rakit pc om. Biaya minimal diperlukan Rp " + formatter.format(min));
            clear();
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Masa mau gratisan sich");
            clear();
        }
    }//GEN-LAST:event_BuildBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        clear();
    }//GEN-LAST:event_ClearBtnActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    private JDialog jd;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BiayaField;
    private javax.swing.JButton BuildBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JTable GTable;
    private javax.swing.JTable HTable;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTable PTable;
    private javax.swing.JTable RTable;
    private javax.swing.JTextArea ResultArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
}
