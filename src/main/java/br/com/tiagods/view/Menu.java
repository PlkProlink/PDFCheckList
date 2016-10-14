package br.com.tiagods.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import br.com.tiagods.controller.ControllerMenu;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Window.Type;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.ComponentOrientation;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JProgressBar;

public class Menu extends javax.swing.JFrame {
    /**
     * Creates new form Menu
     */
    ControllerMenu controller = new ControllerMenu();
    
    public Menu() {
    	setTitle("Controle de Obrigacões");
        initComponents();
        controller.iniciar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txCaminhoArquivo = new javax.swing.JTextField();
        btCarregarArquivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPrincipal = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txView3 = new javax.swing.JTextField();
        comboStatus2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txView5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        txView4 = new javax.swing.JTextField();
        cbFiltro = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btAddUm = new javax.swing.JButton();
        btAddTodos = new javax.swing.JButton();
        btRemoveTodos = new javax.swing.JButton();
        btRemoveUm = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboCodigo = new javax.swing.JComboBox<>();
        comboNome = new javax.swing.JComboBox<>();
        comboCNPJ = new javax.swing.JComboBox<>();
        txView1 = new javax.swing.JTextField();
        txView2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txBuscarNome = new javax.swing.JTextField();
        btAvancar = new javax.swing.JButton();
        btNomeArquivo = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        txIconValido = new javax.swing.JLabel();
        txIconValido1 = new javax.swing.JLabel();
        btCarregarDir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txCaminhoPDF = new javax.swing.JTextField();
        btCarregarDirOutros = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txCaminhoOutros = new javax.swing.JTextField();
        txIconValido2 = new javax.swing.JLabel();
        txStatus = new javax.swing.JLabel();
        btAbrirSobre = new javax.swing.JButton();
        btExcel = new javax.swing.JButton();
        btRelatorio = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Informe o arquivo(xls, xlsx):");

        btCarregarArquivo.setBackground(new java.awt.Color(255, 255, 255));
        btCarregarArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/tiagods/utilitarios/carregar.jpg"))); // NOI18N
        btCarregarArquivo.setActionCommand("CarregarArquivo");
        btCarregarArquivo.addActionListener(controller);

        tbPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Status", "Nome", "CNPJ", "Status Codigo", "Status CNPJ", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableCellRenderer tcr1 = new Colorir();
        TableColumn column1 =
        tbPrincipal.getColumnModel().getColumn(4);
        column1.setCellRenderer(tcr1);

        TableCellRenderer tcr2 = new Colorir();
        TableColumn column2 =
        tbPrincipal.getColumnModel().getColumn(5);
        column2.setCellRenderer(tcr2);
        jScrollPane1.setViewportView(tbPrincipal);
        if (tbPrincipal.getColumnModel().getColumnCount() > 0) {
            tbPrincipal.getColumnModel().getColumn(0).setPreferredWidth(70);
            tbPrincipal.getColumnModel().getColumn(1).setPreferredWidth(80);
            tbPrincipal.getColumnModel().getColumn(2).setMaxWidth(150);
            tbPrincipal.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        comboStatus2.setActionCommand("FocusLost5");
        comboStatus2.addActionListener(controller);

        jLabel3.setText("Coluna:");

        txView5.setActionCommand("PreencherTabelas");
        txView5.addActionListener(controller);

        jLabel4.setText("Status:");

        comboStatus.setActionCommand("FocusLost4");
        comboStatus.addActionListener(controller);

        cbFiltro.setBackground(new java.awt.Color(255, 255, 255));
        cbFiltro.setText("Filtro Especial");
        cbFiltro.setActionCommand("Filtro");
        cbFiltro.addActionListener(controller);

        jLabel7.setText("Codigo:");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Excluir"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Incluir"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable3);

        btAddUm.setText(">");
        btAddUm.setActionCommand("AddUm");
        btAddUm.addActionListener(controller);

        btAddTodos.setText(">>");
        btAddTodos.setActionCommand("AddTodos");
        btAddTodos.addActionListener(controller);

        btRemoveTodos.setText("<<");
        btRemoveTodos.setActionCommand("RemoveTodos");
        btRemoveTodos.addActionListener(controller);

        btRemoveUm.setText("<");
        btRemoveUm.setActionCommand("RemoveUm");
        btRemoveUm.addActionListener(controller);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAddUm)
                    .addComponent(btAddTodos)
                    .addComponent(btRemoveTodos)
                    .addComponent(btRemoveUm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAddTodos, btAddUm, btRemoveTodos, btRemoveUm});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btAddUm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAddTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRemoveTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRemoveUm))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Nome:");

        jLabel9.setText("CNPJ:");

        jLabel10.setText("Colunas: 1\u00AA Linha \u00E9 o nome da Coluna");

        comboCodigo.setActionCommand("FocusLost1");
        comboCodigo.addActionListener(controller);

        comboNome.setActionCommand("FocusLost2");
        comboNome.addActionListener(controller);

        comboCNPJ.setActionCommand("FocusLost3");
        comboCNPJ.addActionListener(controller);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Adicionar  - Nome de Arquivo:");

        btAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/tiagods/utilitarios/play.jpg"))); // NOI18N
        btAvancar.setActionCommand("Iniciar");
        btAvancar.addActionListener(controller);

        btNomeArquivo.setBackground(new java.awt.Color(255, 255, 255));
        btNomeArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/tiagods/utilitarios/question.png"))); // NOI18N
        btNomeArquivo.setBorder(null);
        btNomeArquivo.setBorderPainted(false);
        btNomeArquivo.setContentAreaFilled(false);
        btNomeArquivo.setActionCommand("abrirNomeArquivo");
        btNomeArquivo.addActionListener(controller);
        
        JLabel lblIniciar = new JLabel("Iniciar!");
        lblIniciar.setHorizontalAlignment(SwingConstants.CENTER);
        
        chckbxIgnorarArquivos = new JCheckBox("Ignorar Nomeclatura");
        chckbxIgnorarArquivos.setBackground(new Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5Layout.setHorizontalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel5Layout.createSequentialGroup()
        					.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel5)
        						.addComponent(txBuscarNome, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
        					.addGap(18, 23, Short.MAX_VALUE)
        					.addComponent(btNomeArquivo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        					.addGap(46))
        				.addGroup(jPanel5Layout.createSequentialGroup()
        					.addComponent(chckbxIgnorarArquivos)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(lblIniciar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(btAvancar, GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE))
        			.addGap(29))
        );
        jPanel5Layout.setVerticalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addGap(32)
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel5Layout.createSequentialGroup()
        					.addComponent(jLabel5)
        					.addGap(3)
        					.addComponent(txBuscarNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(btNomeArquivo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(chckbxIgnorarArquivos)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addContainerGap(30, Short.MAX_VALUE)
        			.addComponent(lblIniciar)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btAvancar, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel5.setLayout(jPanel5Layout);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/tiagods/utilitarios/refresh.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
        								.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
        								.addComponent(comboStatus, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(comboNome, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(comboCodigo, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(comboCNPJ, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(txView1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txView2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txView3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txView4, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(cbFiltro)
        					.addGap(18)
        					.addComponent(jLabel3)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(comboStatus2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(txView5, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(jLabel10)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(comboCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(txView1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(comboNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txView2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(comboCNPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txView3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(comboStatus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txView4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGap(15)
        							.addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(8))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(cbFiltro)
        						.addComponent(comboStatus2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel3)
        						.addComponent(txView5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        					.addGap(7))))
        );
        jPanel2.setLayout(jPanel2Layout);

        jButton14.setActionCommand("Refresh");
        jButton14.addActionListener(controller);

        btCarregarDir.setBackground(new java.awt.Color(255, 255, 255));
        btCarregarDir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/tiagods/utilitarios/carregar.jpg"))); // NOI18N
        btCarregarDir.setActionCommand("CarregarDir");
        btCarregarDir.addActionListener(controller);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Comprovantes de Opera\u00E7\u00F5es(PDF):");

        btCarregarDirOutros.setBackground(new java.awt.Color(255, 255, 255));
        btCarregarDirOutros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/tiagods/utilitarios/carregar.jpg"))); // NOI18N
        btCarregarDirOutros.setActionCommand("CarregarOutros");
        btCarregarDirOutros.addActionListener(controller);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Outros arquivos(Opcional):");

        txStatus.setFont(new Font("Tahoma", Font.BOLD, 12)); // NOI18N
        txStatus.setForeground(Color.BLACK);
        txStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btAbrirSobre.setBackground(new java.awt.Color(255, 255, 255));
        btAbrirSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/tiagods/utilitarios/question.png"))); // NOI18N
        btAbrirSobre.setBorder(null);
        btAbrirSobre.setBorderPainted(false);
        btAbrirSobre.setContentAreaFilled(false);
        btAbrirSobre.setActionCommand("abrirSobre");
        btAbrirSobre.addActionListener(controller);

        btExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/tiagods/utilitarios/excel.jpg"))); // NOI18N
        btExcel.setToolTipText("Exportar o resultado para um arquivo excel");
        btExcel.setContentAreaFilled(false);
        btExcel.setActionCommand("Exportar");
        btExcel.addActionListener(controller);

        btRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/tiagods/utilitarios/relatorio.png"))); // NOI18N
        btRelatorio.setToolTipText("Gerar relatorio com o resultado obtido");
        btRelatorio.setContentAreaFilled(false);
        btRelatorio.setActionCommand("Relatorio");
        btRelatorio.addActionListener(controller);

        btCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/tiagods/utilitarios/iconX.png"))); // NOI18N
        btCancelar.setToolTipText("Cancelar Operação Atual");
        btCancelar.setContentAreaFilled(false);
        btCancelar.setActionCommand("Cancelar");
        btCancelar.addActionListener(controller);
        
        JPanel jPAtualizacao = new JPanel();
        jPAtualizacao.addMouseListener(controller);
        jPAtualizacao.setBackground(new Color(250,250,250));
        
        lbTitulo = new JLabel();
        lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 24));
        
        progressBar = new JProgressBar(0,100);
        progressBar.setForeground(Color.BLUE);
        progressBar.setMinimumSize(new Dimension(100,0));
        progressBar.setStringPainted(true);
        progressBar.setVisible(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
        				.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(progressBar, GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        						.addComponent(txStatus, GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
        					.addGap(18)
        					.addComponent(btCancelar)
        					.addGap(210)
        					.addComponent(btRelatorio, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(btExcel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        					.addGap(24))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(lbTitulo, GroupLayout.PREFERRED_SIZE, 831, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(btAbrirSobre, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jPAtualizacao, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
        						.addComponent(jLabel13)
        						.addComponent(jLabel2))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txCaminhoPDF, 466, 466, 466)
        						.addComponent(txCaminhoArquivo, 466, 466, 466)
        						.addComponent(txCaminhoOutros, 466, 466, 466))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(btCarregarArquivo, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btCarregarDir, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btCarregarDirOutros, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(txIconValido2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(txIconValido1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(txIconValido, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(btAbrirSobre, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbTitulo, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        					.addGroup(jPanel1Layout.createSequentialGroup()
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(jLabel2)
        							.addComponent(txCaminhoArquivo, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(jLabel12)
        							.addComponent(txCaminhoPDF, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(jLabel13)
        							.addComponent(txCaminhoOutros, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
        					.addGroup(jPanel1Layout.createSequentialGroup()
        						.addComponent(btCarregarArquivo, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(btCarregarDir, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(btCarregarDirOutros, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        					.addGroup(jPanel1Layout.createSequentialGroup()
        						.addComponent(txIconValido, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(txIconValido1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(txIconValido2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
        				.addComponent(jPAtualizacao, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        					.addComponent(btRelatorio, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(btExcel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(btCancelar, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(txStatus, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPAtualizacao.setLayout(null);
        
        lbTitVersao = new JLabel("");
        lbTitVersao.setBackground(Color.WHITE);
        lbTitVersao.setOpaque(true);
        lbTitVersao.setFont(new Font("Tahoma", Font.BOLD, 12));
        lbTitVersao.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitVersao.setBounds(10, 0, 182, 27);
        jPAtualizacao.add(lbTitVersao);
        
        lbDetalhes = new JLabel("");
        lbDetalhes.setBackground(Color.WHITE);
        lbDetalhes.setOpaque(true);
        lbDetalhes.setFont(new Font("Tahoma", Font.BOLD, 11));
        lbDetalhes.setHorizontalAlignment(SwingConstants.CENTER);
        lbDetalhes.setBounds(10, 32, 182, 55);
        jPAtualizacao.add(lbDetalhes);
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btAbrirSobre;
    public static javax.swing.JButton btAddTodos;
    public static javax.swing.JButton btAddUm;
    private javax.swing.JButton btAvancar;
    public static javax.swing.JButton btCancelar;
    public static javax.swing.JButton btCarregarArquivo;
    public static javax.swing.JButton btCarregarDir;
    public static javax.swing.JButton btCarregarDirOutros;
    private javax.swing.JButton btExcel;
    public static javax.swing.JButton btNomeArquivo;
    private javax.swing.JButton btRelatorio;
    public static javax.swing.JButton btRemoveTodos;
    public static javax.swing.JButton btRemoveUm;
    public static javax.swing.JCheckBox cbFiltro;
    public static javax.swing.JComboBox<String> comboCNPJ;
    public static javax.swing.JComboBox<String> comboCodigo;
    public static javax.swing.JComboBox<String> comboNome;
    public static javax.swing.JComboBox<String> comboStatus;
    public static javax.swing.JComboBox<String> comboStatus2;
    public static javax.swing.JButton jButton14;
    public static JProgressBar progressBar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel lbTitulo, lbTitVersao, lbDetalhes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JTable jTable2;
    public static javax.swing.JTable jTable3;
    public static javax.swing.JTable tbPrincipal;
    public static javax.swing.JTextField txBuscarNome;
    public static javax.swing.JTextField txCaminhoArquivo;
    public static javax.swing.JTextField txCaminhoOutros;
    public static javax.swing.JTextField txCaminhoPDF;
    public static javax.swing.JLabel txIconValido;
    public static javax.swing.JLabel txIconValido1;
    public static javax.swing.JLabel txIconValido2;
    public static javax.swing.JLabel txStatus;
    public static javax.swing.JTextField txView1;
    public static javax.swing.JTextField txView2;
    public static javax.swing.JTextField txView3;
    public static javax.swing.JTextField txView4;
    public static javax.swing.JTextField txView5;
    public static JCheckBox chckbxIgnorarArquivos;
    
    // End of variables declaration//GEN-END:variables
class Colorir extends JLabel implements TableCellRenderer{
    public Colorir(){
        this.setOpaque(true);
    }
  
    public Component getTableCellRendererComponent(
        JTable table, 
        Object value, boolean isSelected, boolean hasFocus,
           int row, int column){

        if(value.toString().equals("Não Existe")){
            setBackground(Color.RED);
            setForeground(Color.WHITE);
        }
        else if(value.toString().equals("CNPJ Inválido")){
        	setBackground(Color.YELLOW);
            setForeground(Color.WHITE);
        }
        else if(value.toString().equals("Erro na Leitura do Arquivo PDF")){
        	setBackground(Color.ORANGE);
            setForeground(Color.WHITE);
        }
        else{
            setBackground(Color.GREEN);
            setForeground(Color.WHITE);
//setBackground(table.getBackground());		
        }
        setText(value.toString());
        return this;   	
    }
  
  public void validate() {}
  public void revalidate() {}
  protected void firePropertyChange(String propertyName,
     Object oldValue, Object newValue) {}
  public void firePropertyChange(String propertyName,
     boolean oldValue, boolean newValue) {}
}
}