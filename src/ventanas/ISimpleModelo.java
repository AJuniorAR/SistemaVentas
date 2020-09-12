package ventanas;

import controllers.CSimpleModelo;
import core.JAbstractModelBD;
import modelbd.SimpleModelo;
import modelgui.ModeloTablaSimpleModelo;
import java.awt.event.ActionEvent;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/**
 * Formulario por el cual se puede agregar modelo,marcas y clases.
 * @author Ferz Código Lite - https://codigolite.com
 */
public class ISimpleModelo extends javax.swing.JInternalFrame {

    /**
     * Creates new form ISimpleModelo
     */
    //CSimpleModelo generic;
    private ModeloTablaSimpleModelo tmodelo;
    private ModeloTablaSimpleModelo tmarca;
    private ModeloTablaSimpleModelo tclase;
    private CSimpleModelo cGeneral;
    private SimpleModelo sp;
    public ISimpleModelo() {
        initComponents();
        cGeneral = new CSimpleModelo();//885
       tmodelo = new ModeloTablaSimpleModelo(CSimpleModelo.OMODELO);
       tmarca = new ModeloTablaSimpleModelo(CSimpleModelo.OMARCA);
       tclase = new ModeloTablaSimpleModelo(CSimpleModelo.OCLASE);
       tblModelo.setModel(tmodelo);
       tblMarca.setModel(tmarca);
       tblClase.setModel(tclase);
       agregarEventoTablas();
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

        tbPane = new elaprendiz.gui.panel.TabbedPaneHeader();
        panelImage1 = new elaprendiz.gui.panel.PanelImage();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtModelo = new elaprendiz.gui.textField.TextField();
        lbActivoModelo = new elaprendiz.gui.label.LabelRect();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblModelo = new javax.swing.JTable();
        panelImage2 = new elaprendiz.gui.panel.PanelImage();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMarca = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new elaprendiz.gui.textField.TextField();
        lbActivoMarca = new elaprendiz.gui.label.LabelRect();
        panelImage3 = new elaprendiz.gui.panel.PanelImage();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblClase = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtClase = new elaprendiz.gui.textField.TextField();
        lbActivoClase = new elaprendiz.gui.label.LabelRect();
        panelImage4 = new elaprendiz.gui.panel.PanelImage();
        jPanel3 = new javax.swing.JPanel();
        bntActivar = new elaprendiz.gui.button.ButtonRect();
        bntGrabar = new elaprendiz.gui.button.ButtonRect();
        bntEliminar = new elaprendiz.gui.button.ButtonRect();
        bntCancelar = new elaprendiz.gui.button.ButtonRect();
        bntsalir = new elaprendiz.gui.button.ButtonRect();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconifiable(true);
        setTitle("Administre las Marcas,Modelos y Clases");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fondoazulceleste.jpg"))); // NOI18N
        panelImage1.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 7);
        jPanel1.add(jLabel1, gridBagConstraints);

        txtModelo.setPreferredSize(new java.awt.Dimension(250, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 7);
        jPanel1.add(txtModelo, gridBagConstraints);

        lbActivoModelo.setBackground(new java.awt.Color(0, 153, 51));
        lbActivoModelo.setText("Activo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 7);
        jPanel1.add(lbActivoModelo, gridBagConstraints);

        panelImage1.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setOpaque(false);

        tblModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblModelo.setName("tblModelo"); // NOI18N
        tblModelo.setOpaque(false);
        jScrollPane1.setViewportView(tblModelo);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelImage1.add(jPanel2, java.awt.BorderLayout.CENTER);

        tbPane.addTab("Modelos", panelImage1);

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fondoazulceleste.jpg"))); // NOI18N
        panelImage2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setOpaque(false);

        tblMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMarca.setName("tblMarca"); // NOI18N
        tblMarca.setOpaque(false);
        jScrollPane2.setViewportView(tblMarca);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        panelImage2.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 7);
        jPanel5.add(jLabel2, gridBagConstraints);

        txtMarca.setPreferredSize(new java.awt.Dimension(250, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 7);
        jPanel5.add(txtMarca, gridBagConstraints);

        lbActivoMarca.setBackground(new java.awt.Color(0, 153, 51));
        lbActivoMarca.setText("Activo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 7);
        jPanel5.add(lbActivoMarca, gridBagConstraints);

        panelImage2.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        tbPane.addTab("Marcas", panelImage2);

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fondoazulceleste.jpg"))); // NOI18N
        panelImage3.setLayout(new java.awt.BorderLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.BorderLayout());

        jScrollPane3.setOpaque(false);

        tblClase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblClase.setName("tblClase"); // NOI18N
        tblClase.setOpaque(false);
        jScrollPane3.setViewportView(tblClase);

        jPanel6.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        panelImage3.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 7);
        jPanel7.add(jLabel3, gridBagConstraints);

        txtClase.setPreferredSize(new java.awt.Dimension(250, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 7);
        jPanel7.add(txtClase, gridBagConstraints);

        lbActivoClase.setBackground(new java.awt.Color(0, 153, 51));
        lbActivoClase.setText("Activo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 7);
        jPanel7.add(lbActivoClase, gridBagConstraints);

        panelImage3.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        tbPane.addTab("Clases", panelImage3);

        getContentPane().add(tbPane, java.awt.BorderLayout.CENTER);

        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fondoazulceleste.jpg"))); // NOI18N
        panelImage4.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setOpaque(false);

        bntActivar.setBackground(new java.awt.Color(51, 153, 255));
        bntActivar.setLabel("Activar");
        bntActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntActivarActionPerformed(evt);
            }
        });
        jPanel3.add(bntActivar);

        bntGrabar.setBackground(new java.awt.Color(51, 153, 255));
        bntGrabar.setText("Grabar");
        bntGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGrabarActionPerformed(evt);
            }
        });
        jPanel3.add(bntGrabar);

        bntEliminar.setBackground(new java.awt.Color(51, 153, 255));
        bntEliminar.setText("Eliminar");
        bntEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(bntEliminar);

        bntCancelar.setBackground(new java.awt.Color(51, 153, 255));
        bntCancelar.setText("Cancelar");
        jPanel3.add(bntCancelar);

        bntsalir.setBackground(new java.awt.Color(51, 153, 255));
        bntsalir.setText("Salir");
        bntsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntsalirActionPerformed(evt);
            }
        });
        jPanel3.add(bntsalir);

        panelImage4.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(panelImage4, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntActivarActionPerformed
        switch(tbPane.getSelectedIndex())
         {
             case 0:
                 actualizarEstadoModelo(evt);
             break;
             case 1: 
                 actualizarEstadoMarca(evt);
                 break;
             case 2:
                 actualizarEstadoClase(evt);
                 break;    
         }     
    }//GEN-LAST:event_bntActivarActionPerformed

private void bntEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEliminarActionPerformed
   switch(tbPane.getSelectedIndex())
     {
         case 0:
             BorrarModelo();
         break;
         case 1: 
             BorrarMarca();
             break;
         case 2:
             BorrarClase();
             break;    
     }     
}//GEN-LAST:event_bntEliminarActionPerformed

private void bntGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGrabarActionPerformed
     switch(tbPane.getSelectedIndex())
     {
         case 0:
             grabarModelo(evt);
         break;
         case 1: 
             grabarMarca(evt);
             break;
         case 2:
             grabarClase(evt);
             break;    
     }
}//GEN-LAST:event_bntGrabarActionPerformed

private void bntsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntsalirActionPerformed
    cerrarVentana();
}//GEN-LAST:event_bntsalirActionPerformed

private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
    cerrarVentana();
}//GEN-LAST:event_formInternalFrameClosing


    private void cerrarVentana()
    {
        int opcion = JOptionPane.showInternalConfirmDialog(this, "Los Datos que no hayan sido guardado "
            + "se perderan.\n ¿Desea cerrar esta ventana?", "¿Desea cerrar esta ventana?", JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.WARNING_MESSAGE);
        if(opcion == JOptionPane.OK_OPTION)
        {
            this.dispose();
        }
    }
    public void agregarEventoTablas()
    {        
        ListSelectionListener lst = new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
               setDatoModelo();
            }
        };
        this.tblModelo.getSelectionModel().addListSelectionListener(lst);
        
        ListSelectionListener lstmc = new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
               setDatoMarca();
            }
        };
        this.tblMarca.getSelectionModel().addListSelectionListener(lstmc);
        
        ListSelectionListener lstcl = new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
               setDatoClase();
            }
        };
        this.tblClase.getSelectionModel().addListSelectionListener(lstcl);
    }
    
    public void setDatoModelo()
    {
        if(tblModelo.getSelectedRow() != -1)
        {
           SimpleModelo fila = (SimpleModelo)tmodelo.getFila(tblModelo.getSelectedRow());
           
           txtModelo.setText(fila.getNombre());
           if(fila.getActivo() == 1)
           {
              lbActivoModelo.setText("Activo"); 
              lbActivoModelo.setBackground(new java.awt.Color(0, 153, 51)); 
           }else
           {
              lbActivoModelo.setText("No Activo"); 
              lbActivoModelo.setBackground(new java.awt.Color(255, 0, 0)); 
           }
           
        }
    }
    
    public void setDatoMarca()
    {
        if(tblMarca.getSelectedRow() != -1)
        {
           SimpleModelo fila = (SimpleModelo)tmarca.getFila(tblMarca.getSelectedRow());
           
           txtMarca.setText(fila.getNombre());
           if(fila.getActivo() == 1)
           {
              lbActivoMarca.setText("Activo"); 
              lbActivoMarca.setBackground(new java.awt.Color(0, 153, 51)); 
           }else
           {
              lbActivoMarca.setText("No Activo"); 
              lbActivoMarca.setBackground(new java.awt.Color(255, 0, 0)); 
           }
           
        }
    }
    
    public void setDatoClase()
    {
        if(tblClase.getSelectedRow() != -1)
        {
           SimpleModelo fila = (SimpleModelo)tclase.getFila(tblClase.getSelectedRow());
           
           txtClase.setText(fila.getNombre());
           if(fila.getActivo() == 1)
           {
              lbActivoClase.setText("Activo"); 
              lbActivoClase.setBackground(new java.awt.Color(0, 153, 51)); 
           }else
           {
              lbActivoClase.setText("No Activo"); 
              lbActivoClase.setBackground(new java.awt.Color(255, 0, 0)); 
           }
           
        }
    }
    
    
    public void BorrarModelo()
    {
        if(tblModelo.getSelectedRow() != -1)
        {           
            int br = cGeneral.borrarRegistro(tmodelo.getFila(tblModelo.getSelectedRow()));
            if(br != 0)
            {
              JOptionPane.showInternalMessageDialog(this, "Modelo Eliminado","Registro Borrado", JOptionPane.ERROR_MESSAGE);
              tmodelo = new ModeloTablaSimpleModelo(CSimpleModelo.OMODELO);
              tblModelo.setModel(tmodelo);   
            } 
        }
    }
    
    public void BorrarMarca()
    {
        if(tblMarca.getSelectedRow() != -1)
        {
            int br = cGeneral.borrarRegistro(tmarca.getFila(tblMarca.getSelectedRow()));
            if(br != 0)
            {
              JOptionPane.showInternalMessageDialog(this, "Marca Eliminada","Registro Borrado", JOptionPane.ERROR_MESSAGE);
              tmarca = new ModeloTablaSimpleModelo(CSimpleModelo.OMARCA);
              tblMarca.setModel(tmarca);   
            }
        }
        
    }
    
    public void BorrarClase()
    {
        if(tblClase.getSelectedRow() != -1)
        {
           int br = cGeneral.borrarRegistro(tclase.getFila(tblClase.getSelectedRow()));
            if(br != 0)
            {
              JOptionPane.showInternalMessageDialog(this, "Clase Eliminada","Registro Borrado", JOptionPane.ERROR_MESSAGE);
              tclase = new ModeloTablaSimpleModelo(CSimpleModelo.OCLASE);
              tblClase.setModel(tclase);   
            } 
        }        
    }
    
    public void grabarModelo(ActionEvent evt)
    {
        if(!txtModelo.getText().isEmpty())
        {
            int op = JOptionPane.showInternalConfirmDialog(this, "Desea grabar el modelo:"
                    + txtModelo.getText()+"?", "¿Grabar Modelo?", JOptionPane.YES_NO_CANCEL_OPTION);
            
            if(op == JOptionPane.OK_OPTION)
            {
                sp = new SimpleModelo(SimpleModelo.OMODELO);
                sp.setNombre(txtModelo.getText());
                boolean guardarRegistro = cGeneral.guardarRegistro(sp);
                if(guardarRegistro)
                {
                   JOptionPane.showInternalMessageDialog(this, "Modelo: "+txtModelo.getText()+
                           " Guardado Correctamente", "Modelo guardado", JOptionPane.INFORMATION_MESSAGE);
                   tmodelo = new ModeloTablaSimpleModelo(CSimpleModelo.OMODELO);
                   tblModelo.setModel(tmodelo); 
                   txtModelo.setText("");
                }
            }
        }else{
            JOptionPane.showInternalMessageDialog(this, "Ingrese un Modelo","Campo vacio", JOptionPane.ERROR_MESSAGE);
               
        }
    }
    
    public void grabarMarca(ActionEvent evt){
       
        if(!txtMarca.getText().isEmpty())
        {
            int op = JOptionPane.showInternalConfirmDialog(this, "Desea grabar la Marca:"
                    + txtMarca.getText()+"?", "¿Grabar Marca?", JOptionPane.YES_NO_CANCEL_OPTION);
            
            if(op == JOptionPane.OK_OPTION)
            {
                sp = new SimpleModelo(SimpleModelo.OMARCA);
                sp.setNombre(txtMarca.getText());
                boolean guardarRegistro = cGeneral.guardarRegistro(sp);
                if(guardarRegistro)
                {
                   JOptionPane.showInternalMessageDialog(this, "Marca: "+txtModelo.getText()+
                           " Guardado Correctamente", "Marca guardada", JOptionPane.INFORMATION_MESSAGE);
                   tmarca = new ModeloTablaSimpleModelo(CSimpleModelo.OMARCA);
                   tblMarca.setModel(tmarca); 
                   txtMarca.setText("");
                }
            }
        }else{
            JOptionPane.showInternalMessageDialog(this, "Ingrese una Marca","Campo vacio", JOptionPane.ERROR_MESSAGE);
               
        }
    }
    
    public void grabarClase(ActionEvent evt)
    {
       if(!txtClase.getText().isEmpty())
        {
            int op = JOptionPane.showInternalConfirmDialog(this, "Desea grabar la Clase:"
                    + txtClase.getText()+"?", "¿Grabar Clase?", JOptionPane.YES_NO_CANCEL_OPTION);
            
            if(op == JOptionPane.OK_OPTION)
            {
                sp = new SimpleModelo(SimpleModelo.OCLASE);
                sp.setNombre(txtClase.getText());
                boolean guardarRegistro = cGeneral.guardarRegistro(sp);
                if(guardarRegistro)
                {
                   JOptionPane.showInternalMessageDialog(this, "Clase: "+txtClase.getText()+
                           " Guardada Correctamente", "Clase guardada", JOptionPane.INFORMATION_MESSAGE);
                   tclase = new ModeloTablaSimpleModelo(CSimpleModelo.OCLASE);
                   tblClase.setModel(tclase); 
                   txtClase.setText("");
                }
            }
        }else{
            JOptionPane.showInternalMessageDialog(this, "Ingrese una Clase","Campo vacio", JOptionPane.ERROR_MESSAGE);
               
        } 
    }
    
    public void actualizarModelo(ActionEvent evt)
    {
        if(!txtModelo.getText().isEmpty())
        {            
            if(tblModelo.getSelectedRow() != -1)
            {                
               SimpleModelo sp = (SimpleModelo)tmodelo.getFila(tblModelo.getSelectedRow());
                if(!sp.getNombre().equals(txtModelo.getText()))
                {
                   int op = JOptionPane.showInternalConfirmDialog(this, "Desea cambiar modelo:"
                        +sp.getNombre()+" por "+ txtModelo.getText()+"?", "¿Actualizar Modelo?", JOptionPane.YES_NO_CANCEL_OPTION);

                    if(op == JOptionPane.OK_OPTION)
                    { 
                        sp.setNombre(txtModelo.getText());
                        int guardarRegistro = cGeneral.actualizarRegistro(sp);
                        if(guardarRegistro != 0)
                        {
                           JOptionPane.showInternalMessageDialog(this, "Modelo: "+
                                   "Actualizado Correctamente", "Modelo actualizado", JOptionPane.INFORMATION_MESSAGE);
                           tmodelo = new ModeloTablaSimpleModelo(CSimpleModelo.OMODELO);
                           tblModelo.setModel(tmodelo); 
                           txtModelo.setText("");
                        }
                    }
                }  
            }
            
        }else{
            JOptionPane.showInternalMessageDialog(this, "Ingrese un Modelo","Campo vacio", JOptionPane.ERROR_MESSAGE);
               
        }
    }
    
    
    public void actualizarMarca(ActionEvent evt)
    {
        if(!txtMarca.getText().isEmpty())
        {            
            if(tblMarca.getSelectedRow() != -1)
            {                
               SimpleModelo sp = (SimpleModelo)tmarca.getFila(tblMarca.getSelectedRow());
                if(!sp.getNombre().equals(txtMarca.getText()))
                {
                   int op = JOptionPane.showInternalConfirmDialog(this, "Desea cambiar la marca:"
                        +sp.getNombre()+" por "+ txtMarca.getText()+"?", "¿Actualizar Marca?", JOptionPane.YES_NO_CANCEL_OPTION);

                    if(op == JOptionPane.OK_OPTION)
                    { 
                        sp.setNombre(txtMarca.getText());
                        int guardarRegistro = cGeneral.actualizarRegistro(sp);
                        if(guardarRegistro != 0)
                        {
                           JOptionPane.showInternalMessageDialog(this, "Marca: "+
                                   "Actualizada Correctamente", "Marca actualizada", JOptionPane.INFORMATION_MESSAGE);
                           tmarca = new ModeloTablaSimpleModelo(CSimpleModelo.OMARCA);
                           tblMarca.setModel(tmarca); 
                           txtMarca.setText("");
                        }
                    }
                }  
            }
            
        }else{
            JOptionPane.showInternalMessageDialog(this, "Ingrese una Marca","Campo vacio", JOptionPane.ERROR_MESSAGE);
               
        }
    }
    
    public void actualizarClase(ActionEvent evt)
    {
        if(!txtClase.getText().isEmpty())
        {            
            if(tblClase.getSelectedRow() != -1)
            {                
               SimpleModelo sp = (SimpleModelo)tclase.getFila(tblClase.getSelectedRow());
                if(!sp.getNombre().equals(txtClase.getText()))
                {
                   int op = JOptionPane.showInternalConfirmDialog(this, "Desea cambiar la Clase:"
                        +sp.getNombre()+" por "+ txtClase.getText()+"?", "¿Actualizar Clase?", JOptionPane.YES_NO_CANCEL_OPTION);

                    if(op == JOptionPane.OK_OPTION)
                    { 
                        sp.setNombre(txtClase.getText());
                        int guardarRegistro = cGeneral.actualizarRegistro(sp);
                        if(guardarRegistro != 0)
                        {
                           JOptionPane.showInternalMessageDialog(this, "Clase: "+
                                   "Actualizada Correctamente", "Clase actualizada", JOptionPane.INFORMATION_MESSAGE);
                           tclase = new ModeloTablaSimpleModelo(CSimpleModelo.OCLASE);
                           tblClase.setModel(tclase); 
                           txtClase.setText("");
                        }
                    }
                }  
            }
            
        }else{
            JOptionPane.showInternalMessageDialog(this, "Ingrese una Marca","Campo vacio", JOptionPane.ERROR_MESSAGE);
               
        }
    }
            

public void actualizarEstadoModelo(ActionEvent evt)
    {
                   
            if(tblModelo.getSelectedRow() != -1)
            {                
               SimpleModelo sp = (SimpleModelo)tmodelo.getFila(tblModelo.getSelectedRow());
             
               if(sp.getActivo() == 0){
                   sp.setActivo(1);
                    int guardarRegistro = cGeneral.actualizarRegistro(sp);
                    if(guardarRegistro != 0)
                    {
                       JOptionPane.showInternalMessageDialog(this, "Modelo: "+
                               "Activado Correctamente", "Modelo activado", JOptionPane.INFORMATION_MESSAGE);
                       tmodelo = new ModeloTablaSimpleModelo(CSimpleModelo.OMODELO);
                       tblModelo.setModel(tmodelo); 
                       txtModelo.setText("");
                    }
                }else
               {
                  JOptionPane.showInternalMessageDialog(this, "Esta Modelo ya esta Activo", "Ya Esta Activado", JOptionPane.INFORMATION_MESSAGE);
                       
               }
                
                  
            }
            
        
    }
    
    
    public void actualizarEstadoMarca(ActionEvent evt)
    {
        if(tblMarca.getSelectedRow() != -1)
            {                
               SimpleModelo sp = (SimpleModelo)tmarca.getFila(tblMarca.getSelectedRow());
                
               if(sp.getActivo() == 0)
               {
                    sp.setActivo(1);
                    int guardarRegistro = cGeneral.actualizarRegistro(sp);
                    if(guardarRegistro != 0)
                    {
                       JOptionPane.showInternalMessageDialog(this, "Marca: "+
                               "Activada Correctamente", "Marca activada", JOptionPane.INFORMATION_MESSAGE);
                       tmarca = new ModeloTablaSimpleModelo(CSimpleModelo.OMARCA);
                       tblMarca.setModel(tmarca); 
                       txtMarca.setText("");
                    } 
               }else
               {
                  JOptionPane.showInternalMessageDialog(this, "Esta Marca ya esta Activa", "Ya Esta Activado", JOptionPane.INFORMATION_MESSAGE);
                       
               }
            }
       
    }
    
    public void actualizarEstadoClase(ActionEvent evt)
    {
                    
        if(tblClase.getSelectedRow() != -1)
        {                
           SimpleModelo sp = (SimpleModelo)tclase.getFila(tblClase.getSelectedRow());
            if(sp.getActivo() == 0)
            {                
                sp.setActivo(1);
                int guardarRegistro = cGeneral.actualizarRegistro(sp);
                if(guardarRegistro != 0)
                {
                   JOptionPane.showInternalMessageDialog(this, "Clase: "+
                           "Actualizada Correctamente", "Clase Activada", JOptionPane.INFORMATION_MESSAGE);
                   tclase = new ModeloTablaSimpleModelo(CSimpleModelo.OCLASE);
                   tblClase.setModel(tclase); 
                   txtClase.setText("");
                }else
               {
                  JOptionPane.showInternalMessageDialog(this, "Esta Clase ya esta Activa", "Ya Esta Activada", JOptionPane.INFORMATION_MESSAGE);
                       
               }
                
            }  
        }
            
        
    }    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private elaprendiz.gui.button.ButtonRect bntActivar;
    private elaprendiz.gui.button.ButtonRect bntCancelar;
    private elaprendiz.gui.button.ButtonRect bntEliminar;
    private elaprendiz.gui.button.ButtonRect bntGrabar;
    private elaprendiz.gui.button.ButtonRect bntsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private elaprendiz.gui.label.LabelRect lbActivoClase;
    private elaprendiz.gui.label.LabelRect lbActivoMarca;
    private elaprendiz.gui.label.LabelRect lbActivoModelo;
    private elaprendiz.gui.panel.PanelImage panelImage1;
    private elaprendiz.gui.panel.PanelImage panelImage2;
    private elaprendiz.gui.panel.PanelImage panelImage3;
    private elaprendiz.gui.panel.PanelImage panelImage4;
    private elaprendiz.gui.panel.TabbedPaneHeader tbPane;
    private javax.swing.JTable tblClase;
    private javax.swing.JTable tblMarca;
    private javax.swing.JTable tblModelo;
    private elaprendiz.gui.textField.TextField txtClase;
    private elaprendiz.gui.textField.TextField txtMarca;
    private elaprendiz.gui.textField.TextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
