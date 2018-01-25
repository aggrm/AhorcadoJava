/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author xp
 */
public class VentanaAhorcado extends javax.swing.JFrame {

    String palabraOculta = "CETYS";
    int numerodefallos= 0;
    
    
    
    /**
     * Creates new form VentanaAhorcado
     */
    public VentanaAhorcado() {
        initComponents();
        //inicio las imagenes
        dibujaImagen(0);
    }
    private void chequeaLetra (String letra)
    {
        letra =  letra.toUpperCase();
        String palabraConGuiones = jLabel1.getText();
        boolean acierto= false;
        for(int i=0; i < palabraOculta.length ();i++)
        {
            if (letra.charAt(0)== palabraOculta.charAt(i))
            {
                //TODO qutar el guión bajo de la letra correspondiente
                palabraConGuiones = palabraConGuiones.substring(0, 2*i) 
                        + letra 
                        + palabraConGuiones.substring(2*i + 1);
                
                acierto = true;
            }
        }
        //actualizo el valor que se muestra en la pantalla con las letras adivinadas
        jLabel1.setText(palabraConGuiones);
        if (!acierto)
        {
            numerodefallos ++;
            dibujaImagen(numerodefallos);
        }
    }
    private void chequeaBoton (JButton _boton)
    {
      _boton.setEnabled(false);
      chequeaLetra(_boton.getText());
    }
    
    private void dibujaImagen (int numeroImagen)
    {
        URL nombreImagen;
        String nombre = "";
        switch (numeroImagen)
        {
            case 0 : nombre = "/Imagenes/ahorcado_0.png"; break;
            case 1 : nombre = "/Imagenes/ahorcado_1.png"; break;
            case 2 : nombre = "/Imagenes/ahorcado_2.png"; break;
            case 3 : nombre = "/Imagenes/ahorcado_3.png"; break;
            case 4 : nombre = "/Imagenes/ahorcado_4.png"; break;
            case 5 : nombre = "/Imagenes/ahorcado_5.png"; break;
            default: nombre = "/Imagenes/ahorcado_fin.png"; break;
        }
        nombreImagen = getClass().getResource(nombre);
             
        int ancho = LugarDeFotos.getWidth();
        int alto = LugarDeFotos.getWidth();
        
        ImageIcon miImagen = new ImageIcon (new ImageIcon(nombreImagen).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        
        LugarDeFotos.setIcon(miImagen);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonA = new javax.swing.JButton();
        botonB = new javax.swing.JButton();
        botonC = new javax.swing.JButton();
        botonD = new javax.swing.JButton();
        botonE = new javax.swing.JButton();
        botonF = new javax.swing.JButton();
        botonG = new javax.swing.JButton();
        botonH = new javax.swing.JButton();
        botonI = new javax.swing.JButton();
        botonJ = new javax.swing.JButton();
        botonK = new javax.swing.JButton();
        botonL = new javax.swing.JButton();
        botonM = new javax.swing.JButton();
        botonN = new javax.swing.JButton();
        botonU = new javax.swing.JButton();
        botonV = new javax.swing.JButton();
        botonW = new javax.swing.JButton();
        botonComodin = new javax.swing.JButton();
        botonX = new javax.swing.JButton();
        botonY = new javax.swing.JButton();
        botonZ = new javax.swing.JButton();
        botonÑ = new javax.swing.JButton();
        botonO = new javax.swing.JButton();
        botonP = new javax.swing.JButton();
        botonQ = new javax.swing.JButton();
        botonR = new javax.swing.JButton();
        botonS = new javax.swing.JButton();
        botonT = new javax.swing.JButton();
        LugarDeFotos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("_ _ _ _ _");

        botonA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonA.setText("A");
        botonA.setMaximumSize(new java.awt.Dimension(64, 64));
        botonA.setMinimumSize(new java.awt.Dimension(64, 64));
        botonA.setPreferredSize(new java.awt.Dimension(64, 64));
        botonA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAMousePressed(evt);
            }
        });

        botonB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonB.setText("B");
        botonB.setMaximumSize(new java.awt.Dimension(64, 64));
        botonB.setMinimumSize(new java.awt.Dimension(64, 64));
        botonB.setPreferredSize(new java.awt.Dimension(64, 64));
        botonB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBMousePressed(evt);
            }
        });

        botonC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonC.setText("C");
        botonC.setMaximumSize(new java.awt.Dimension(64, 64));
        botonC.setMinimumSize(new java.awt.Dimension(64, 64));
        botonC.setPreferredSize(new java.awt.Dimension(64, 64));
        botonC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCMousePressed(evt);
            }
        });

        botonD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonD.setText("D");
        botonD.setMaximumSize(new java.awt.Dimension(64, 64));
        botonD.setMinimumSize(new java.awt.Dimension(64, 64));
        botonD.setPreferredSize(new java.awt.Dimension(64, 64));
        botonD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonDMousePressed(evt);
            }
        });

        botonE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonE.setText("E");
        botonE.setMaximumSize(new java.awt.Dimension(64, 64));
        botonE.setMinimumSize(new java.awt.Dimension(64, 64));
        botonE.setPreferredSize(new java.awt.Dimension(64, 64));
        botonE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEMousePressed(evt);
            }
        });

        botonF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonF.setText("F");
        botonF.setMaximumSize(new java.awt.Dimension(64, 64));
        botonF.setMinimumSize(new java.awt.Dimension(64, 64));
        botonF.setPreferredSize(new java.awt.Dimension(64, 64));
        botonF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonFMousePressed(evt);
            }
        });

        botonG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonG.setText("G");
        botonG.setMaximumSize(new java.awt.Dimension(64, 64));
        botonG.setMinimumSize(new java.awt.Dimension(64, 64));
        botonG.setPreferredSize(new java.awt.Dimension(64, 64));
        botonG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonGMousePressed(evt);
            }
        });

        botonH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonH.setText("H");
        botonH.setMaximumSize(new java.awt.Dimension(64, 64));
        botonH.setMinimumSize(new java.awt.Dimension(64, 64));
        botonH.setPreferredSize(new java.awt.Dimension(64, 64));
        botonH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonHMousePressed(evt);
            }
        });

        botonI.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonI.setText("I");
        botonI.setMaximumSize(new java.awt.Dimension(64, 64));
        botonI.setMinimumSize(new java.awt.Dimension(64, 64));
        botonI.setPreferredSize(new java.awt.Dimension(64, 64));
        botonI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonIMousePressed(evt);
            }
        });

        botonJ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonJ.setText("J");
        botonJ.setMaximumSize(new java.awt.Dimension(64, 64));
        botonJ.setMinimumSize(new java.awt.Dimension(64, 64));
        botonJ.setPreferredSize(new java.awt.Dimension(64, 64));
        botonJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonJMousePressed(evt);
            }
        });

        botonK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonK.setText("K");
        botonK.setMaximumSize(new java.awt.Dimension(64, 64));
        botonK.setMinimumSize(new java.awt.Dimension(64, 64));
        botonK.setPreferredSize(new java.awt.Dimension(64, 64));
        botonK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonKMousePressed(evt);
            }
        });

        botonL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonL.setText("L");
        botonL.setMaximumSize(new java.awt.Dimension(64, 64));
        botonL.setMinimumSize(new java.awt.Dimension(64, 64));
        botonL.setPreferredSize(new java.awt.Dimension(64, 64));
        botonL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonLMousePressed(evt);
            }
        });

        botonM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonM.setText("M");
        botonM.setMaximumSize(new java.awt.Dimension(64, 64));
        botonM.setMinimumSize(new java.awt.Dimension(64, 64));
        botonM.setPreferredSize(new java.awt.Dimension(64, 64));
        botonM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMMousePressed(evt);
            }
        });

        botonN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonN.setText("N");
        botonN.setMaximumSize(new java.awt.Dimension(64, 64));
        botonN.setMinimumSize(new java.awt.Dimension(64, 64));
        botonN.setPreferredSize(new java.awt.Dimension(64, 64));
        botonN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonNMousePressed(evt);
            }
        });

        botonU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonU.setText("U");
        botonU.setMaximumSize(new java.awt.Dimension(64, 64));
        botonU.setMinimumSize(new java.awt.Dimension(64, 64));
        botonU.setPreferredSize(new java.awt.Dimension(64, 64));
        botonU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonUMousePressed(evt);
            }
        });

        botonV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonV.setText("V");
        botonV.setMaximumSize(new java.awt.Dimension(64, 64));
        botonV.setMinimumSize(new java.awt.Dimension(64, 64));
        botonV.setPreferredSize(new java.awt.Dimension(64, 64));
        botonV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonVMousePressed(evt);
            }
        });

        botonW.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonW.setText("W");
        botonW.setMaximumSize(new java.awt.Dimension(64, 64));
        botonW.setMinimumSize(new java.awt.Dimension(64, 64));
        botonW.setPreferredSize(new java.awt.Dimension(64, 64));
        botonW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonWMousePressed(evt);
            }
        });

        botonComodin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonComodin.setMaximumSize(new java.awt.Dimension(64, 64));
        botonComodin.setMinimumSize(new java.awt.Dimension(64, 64));
        botonComodin.setPreferredSize(new java.awt.Dimension(64, 64));
        botonComodin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonComodinMousePressed(evt);
            }
        });

        botonX.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonX.setText("X");
        botonX.setMaximumSize(new java.awt.Dimension(64, 64));
        botonX.setMinimumSize(new java.awt.Dimension(64, 64));
        botonX.setPreferredSize(new java.awt.Dimension(64, 64));
        botonX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonXMousePressed(evt);
            }
        });

        botonY.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonY.setText("Y");
        botonY.setMaximumSize(new java.awt.Dimension(64, 64));
        botonY.setMinimumSize(new java.awt.Dimension(64, 64));
        botonY.setPreferredSize(new java.awt.Dimension(64, 64));
        botonY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonYMousePressed(evt);
            }
        });

        botonZ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonZ.setText("Z");
        botonZ.setMaximumSize(new java.awt.Dimension(64, 64));
        botonZ.setMinimumSize(new java.awt.Dimension(64, 64));
        botonZ.setPreferredSize(new java.awt.Dimension(64, 64));
        botonZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonZMousePressed(evt);
            }
        });

        botonÑ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonÑ.setText("Ñ");
        botonÑ.setMaximumSize(new java.awt.Dimension(64, 64));
        botonÑ.setMinimumSize(new java.awt.Dimension(64, 64));
        botonÑ.setPreferredSize(new java.awt.Dimension(64, 64));
        botonÑ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonÑMousePressed(evt);
            }
        });

        botonO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonO.setText("O");
        botonO.setMaximumSize(new java.awt.Dimension(64, 64));
        botonO.setMinimumSize(new java.awt.Dimension(64, 64));
        botonO.setPreferredSize(new java.awt.Dimension(64, 64));
        botonO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonOMousePressed(evt);
            }
        });

        botonP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonP.setText("P");
        botonP.setMaximumSize(new java.awt.Dimension(64, 64));
        botonP.setMinimumSize(new java.awt.Dimension(64, 64));
        botonP.setPreferredSize(new java.awt.Dimension(64, 64));
        botonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPMousePressed(evt);
            }
        });

        botonQ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonQ.setText("Q");
        botonQ.setMaximumSize(new java.awt.Dimension(64, 64));
        botonQ.setMinimumSize(new java.awt.Dimension(64, 64));
        botonQ.setPreferredSize(new java.awt.Dimension(64, 64));
        botonQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonQMousePressed(evt);
            }
        });

        botonR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonR.setText("R");
        botonR.setMaximumSize(new java.awt.Dimension(64, 64));
        botonR.setMinimumSize(new java.awt.Dimension(64, 64));
        botonR.setPreferredSize(new java.awt.Dimension(64, 64));
        botonR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonRMousePressed(evt);
            }
        });

        botonS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonS.setText("S");
        botonS.setMaximumSize(new java.awt.Dimension(64, 64));
        botonS.setMinimumSize(new java.awt.Dimension(64, 64));
        botonS.setPreferredSize(new java.awt.Dimension(64, 64));
        botonS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonSMousePressed(evt);
            }
        });

        botonT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonT.setText("T");
        botonT.setMaximumSize(new java.awt.Dimension(64, 64));
        botonT.setMinimumSize(new java.awt.Dimension(64, 64));
        botonT.setPreferredSize(new java.awt.Dimension(64, 64));
        botonT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonTMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonH, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonI, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonK, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonL, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonM, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonN, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonU, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonV, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonW, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonComodin, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonX, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonY, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonÑ, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonO, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonP, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonR, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonS, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonT, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonA, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonB, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonC, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonD, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonE, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonG, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LugarDeFotos, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LugarDeFotos, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonA, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonB, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonC, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonD, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonE, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonG, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonH, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonI, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonK, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonL, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonM, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonN, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonÑ, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonO, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonP, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonR, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonS, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonT, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonU, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonV, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonW, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonComodin, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonX, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonY, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonAMousePressed

    private void botonBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonBMousePressed

    private void botonCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonCMousePressed

    private void botonDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonDMousePressed

    private void botonEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonEMousePressed

    private void botonFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonFMousePressed

    private void botonGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonGMousePressed

    private void botonHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonHMousePressed

    private void botonIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonIMousePressed

    private void botonJMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonJMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonJMousePressed

    private void botonKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonKMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonKMousePressed

    private void botonLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonLMousePressed

    private void botonMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonMMousePressed

    private void botonNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonNMousePressed

    private void botonÑMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonÑMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonÑMousePressed

    private void botonOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonOMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonOMousePressed

    private void botonPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonPMousePressed

    private void botonQMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonQMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonQMousePressed

    private void botonRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonRMousePressed

    private void botonSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonSMousePressed

    private void botonTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonTMousePressed

    private void botonUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonUMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonUMousePressed

    private void botonVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonVMousePressed

    private void botonWMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonWMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonWMousePressed

    private void botonComodinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComodinMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonComodinMousePressed

    private void botonXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonXMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonXMousePressed

    private void botonYMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonYMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonYMousePressed

    private void botonZMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonZMousePressed
        chequeaBoton((JButton)evt.getSource());
    }//GEN-LAST:event_botonZMousePressed

    
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
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAhorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LugarDeFotos;
    private javax.swing.JButton botonA;
    private javax.swing.JButton botonB;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonComodin;
    private javax.swing.JButton botonD;
    private javax.swing.JButton botonE;
    private javax.swing.JButton botonF;
    private javax.swing.JButton botonG;
    private javax.swing.JButton botonH;
    private javax.swing.JButton botonI;
    private javax.swing.JButton botonJ;
    private javax.swing.JButton botonK;
    private javax.swing.JButton botonL;
    private javax.swing.JButton botonM;
    private javax.swing.JButton botonN;
    private javax.swing.JButton botonO;
    private javax.swing.JButton botonP;
    private javax.swing.JButton botonQ;
    private javax.swing.JButton botonR;
    private javax.swing.JButton botonS;
    private javax.swing.JButton botonT;
    private javax.swing.JButton botonU;
    private javax.swing.JButton botonV;
    private javax.swing.JButton botonW;
    private javax.swing.JButton botonX;
    private javax.swing.JButton botonY;
    private javax.swing.JButton botonZ;
    private javax.swing.JButton botonÑ;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
