/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasibukualamat;

// Import untuk komponen GUI
import javax.swing.*; // JFrame, JPanel, JTextField, JTable, JButton, JLabel, JOptionPane, JScrollPane
import javax.swing.table.DefaultTableModel; // Model data untuk JTable
import javax.swing.event.DocumentEvent; // Untuk mendeteksi perubahan pada JTextField
import javax.swing.event.DocumentListener; // Untuk listener perubahan teks pada JTextField


// Import untuk koneksi database SQLite
import java.sql.Connection; // Untuk koneksi database
import java.sql.DriverManager; // Driver koneksi SQLite
import java.sql.PreparedStatement; // Untuk query SQL dengan parameter
import java.sql.ResultSet; // Untuk hasil query SELECT
import java.sql.SQLException; // Untuk menangani error SQL

// Import untuk operasi file (ekspor/impor)
import java.io.BufferedReader; // Untuk membaca file secara efisien
import java.io.BufferedWriter; // Untuk menulis file secara efisien
import java.io.FileReader; // Untuk membaca file
import java.io.FileWriter; // Untuk menulis file
import java.io.IOException; // Untuk menangani error I/O




public class AplikasiBukuAlamat extends javax.swing.JFrame {

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlite:addressbook.db";

    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
        return connection;
    }
}
 
    public AplikasiBukuAlamat() {
        initComponents();
        loadData();
        addListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        importButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("APLIKASI BUKU ALAMAT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 23, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(9, 7, 9, 46);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Nama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(9, 7, 9, 46);
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Alamat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(9, 7, 9, 46);
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Phone");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(9, 7, 9, 46);
        jPanel2.add(jLabel5, gridBagConstraints);

        idTextField.setFocusable(false);
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 13);
        jPanel2.add(idTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 13);
        jPanel2.add(nameTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 13);
        jPanel2.add(addressTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 13);
        jPanel2.add(phoneTextField, gridBagConstraints);

        clearButton.setText("Bersihkan");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 14);
        jPanel2.add(clearButton, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        addButton.setText("Tambah");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel4.add(addButton, new java.awt.GridBagConstraints());

        updateButton.setText("Edit");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel4.add(updateButton, new java.awt.GridBagConstraints());

        deleteButton.setText("Hapus");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel4.add(deleteButton, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(9, 5, 9, 150);
        jPanel2.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(13, 15, 13, 15);
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel6.setText("Cari Alamat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(9, 16, 9, 53);
        jPanel3.add(jLabel6, gridBagConstraints);

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 0);
        jPanel3.add(searchTextField, gridBagConstraints);

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 16);
        jPanel3.add(resetButton, gridBagConstraints);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 150));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Alamat", "Phone"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(9, 8, 9, 8);
        jPanel3.add(jScrollPane1, gridBagConstraints);

        importButton.setText("Import");
        importButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 9, 72);
        jPanel3.add(importButton, gridBagConstraints);

        exportButton.setText("Export");
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 9, 79);
        jPanel3.add(exportButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(13, 15, 13, 15);
        jPanel1.add(jPanel3, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
// Menambahkan listener untuk searchTextField
private void addListeners() {
    searchTextField.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) { triggerSearch(); }
        @Override
        public void removeUpdate(DocumentEvent e) { triggerSearch(); }
        @Override
        public void changedUpdate(DocumentEvent e) { triggerSearch(); }

        private void triggerSearch() {
            String input = searchTextField.getText().trim();
            if (input.isEmpty()) {
                loadData();
            } else {
                findInAddressBook(input);
            }
        }
    });
}

// Fungsi untuk menambahkan data baru ke database
private void insertData() {
    if (isInputValid()) {
        String query = "INSERT INTO AddressBook (name, address, phone) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nameTextField.getText().trim());
            stmt.setString(2, addressTextField.getText().trim());
            stmt.setString(3, phoneTextField.getText().trim());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!", "Success", JOptionPane.INFORMATION_MESSAGE);
            reloadTable();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

// Fungsi untuk memperbarui data
private void modifyData() {
    if (isInputValid() && !idTextField.getText().trim().isEmpty()) {
        String query = "UPDATE AddressBook SET name = ?, address = ?, phone = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nameTextField.getText().trim());
            stmt.setString(2, addressTextField.getText().trim());
            stmt.setString(3, phoneTextField.getText().trim());
            stmt.setInt(4, Integer.parseInt(idTextField.getText().trim()));
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data diperbarui!", "Success", JOptionPane.INFORMATION_MESSAGE);
            reloadTable();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin diperbarui!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

// Fungsi untuk menghapus data
private void removeData() {
    if (!idTextField.getText().trim().isEmpty()) {
        int confirmation = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirmation == JOptionPane.YES_OPTION) {
            String query = "DELETE FROM AddressBook WHERE id = ?";
            try (Connection conn = DatabaseConnection.connect();
                 PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, Integer.parseInt(idTextField.getText().trim()));
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus!", "Success", JOptionPane.INFORMATION_MESSAGE);
                reloadTable();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

// Fungsi untuk memuat ulang data ke JTable
private void loadData() {
    DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
    tableModel.setRowCount(0);
    String query = "SELECT * FROM AddressBook";
    try (Connection conn = DatabaseConnection.connect();
         PreparedStatement stmt = conn.prepareStatement(query);
         ResultSet result = stmt.executeQuery()) {
        while (result.next()) {
            tableModel.addRow(new Object[]{
                result.getInt("id"),
                result.getString("name"),
                result.getString("address"),
                result.getString("phone")
            });
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}

// Validasi input dari pengguna
private boolean isInputValid() {
    if (nameTextField.getText().trim().isEmpty() ||
        addressTextField.getText().trim().isEmpty() ||
        phoneTextField.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Semua field wajib diisi!", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    try {
        Long.parseLong(phoneTextField.getText().trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Nomor telepon harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    return true;
}

// Fungsi pencarian data
private void findInAddressBook(String keyword) {
    String query = "SELECT * FROM AddressBook WHERE name LIKE ? OR address LIKE ? OR phone LIKE ?";
    DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
    tableModel.setRowCount(0);
    try (Connection conn = DatabaseConnection.connect();
         PreparedStatement stmt = conn.prepareStatement(query)) {
        String searchPattern = "%" + keyword + "%";
        stmt.setString(1, searchPattern);
        stmt.setString(2, searchPattern);
        stmt.setString(3, searchPattern);
        ResultSet result = stmt.executeQuery();
        while (result.next()) {
            tableModel.addRow(new Object[]{
                result.getInt("id"),
                result.getString("name"),
                result.getString("address"),
                result.getString("phone")
            });
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}

// Fungsi ekspor data ke file
private void saveToFile() {
    String filePath = "addressbook.txt";
    String query = "SELECT * FROM AddressBook";
    try (Connection conn = DatabaseConnection.connect();
         PreparedStatement stmt = conn.prepareStatement(query);
         ResultSet result = stmt.executeQuery();
         BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        writer.write("ID, Name, Address, Phone");
        writer.newLine();
        while (result.next()) {
            writer.write(result.getInt("id") + ", " + result.getString("name") + ", " + result.getString("address") + ", " + result.getString("phone"));
            writer.newLine();
        }
        writer.flush();
        JOptionPane.showMessageDialog(this, "Data telah disimpan di " + filePath, "Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException | SQLException ex) {
        ex.printStackTrace();
    }
}

// Fungsi impor data dari file
private void loadFromFile() {
    String filePath = "addressbook.txt";
    String query = "INSERT INTO AddressBook (name, address, phone) VALUES (?, ?, ?)";
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
         Connection conn = DatabaseConnection.connect();
         PreparedStatement stmt = conn.prepareStatement(query)) {
        reader.readLine(); // Skip header
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 4) {
                stmt.setString(1, data[1].trim());
                stmt.setString(2, data[2].trim());
                stmt.setString(3, data[3].trim());
                stmt.executeUpdate();
            }
        }
        reloadTable();
        JOptionPane.showMessageDialog(this, "Data diimpor dari " + filePath, "Import Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException | SQLException ex) {
        ex.printStackTrace();
    }
}

// Fungsi untuk mengosongkan input field
private void resetFields() {
    idTextField.setText("");
    nameTextField.setText("");
    addressTextField.setText("");
    phoneTextField.setText("");
}

// Fungsi untuk reload tabel
private void reloadTable() {
    resetFields();
    loadData();
}


    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
    insertData();       // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
    modifyData(); // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
    removeData();   // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
   int selectedRow = jTable.getSelectedRow();
        if (selectedRow >= 0) {
            // Ambil data dari baris yang dipilih
            String id = jTable.getValueAt(selectedRow, 0).toString();
            String name = jTable.getValueAt(selectedRow, 1).toString();
            String address = jTable.getValueAt(selectedRow, 2).toString();
            String phone = jTable.getValueAt(selectedRow, 3).toString();

            // Isi data ke field
            idTextField.setText(id);
            nameTextField.setText(name);
            addressTextField.setText(address);
            phoneTextField.setText(phone);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTableMouseClicked

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
    resetFields();        // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonActionPerformed

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
    saveToFile();        // TODO add your handling code here:
    }//GEN-LAST:event_exportButtonActionPerformed

    private void importButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importButtonActionPerformed
    loadFromFile();        // TODO add your handling code here:
    }//GEN-LAST:event_importButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
    searchTextField.setText("");
            loadData();        // TODO add your handling code here:
    }//GEN-LAST:event_resetButtonActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplikasiBukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiBukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiBukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiBukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiBukuAlamat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exportButton;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton importButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
