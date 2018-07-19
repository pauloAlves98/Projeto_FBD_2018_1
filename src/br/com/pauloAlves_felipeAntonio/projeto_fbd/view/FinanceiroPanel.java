package br.com.pauloAlves_felipeAntonio.projeto_fbd.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import br.com.pauloAlves_felipeAntonio.projeto_fbd.complemento.Propiedade;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class FinanceiroPanel extends JPanel {
	private JLabel lblValorCaixa,lblValorReceber;
	private JButton btnNovaVenda,btnDashoroad;
	
	/**
	 * Create the panel.
	 */
	public FinanceiroPanel() {
		setLayout(null);
		
		PaneGradiente panel_3 = new PaneGradiente(Color.white,Color.white);
		panel_3.setBorder(new LineBorder(Color.BLACK,1,true));
		panel_3.setBounds(342, 329, 329, 86);
		add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setForeground(Color.black);
		lblSaldo.setBounds(10, 0, 100, 31);
		panel_3.add(lblSaldo);
		lblSaldo.setFont(Propiedade.FONT3);
		
//		JLabel lblServios = new JLabel("Servi\u00E7os");
//		lblServios.setFont(new Font("Tahoma", Font.PLAIN, 25));
//		lblServios.setBounds(697, 23, 139, 28);
//		add(lblServios);
		
		lblValorCaixa = new JLabel("R$ 0,00");
		lblValorCaixa.setForeground(Color.black);
		lblValorCaixa.setBounds(61, 24, 200, 62);
		panel_3.add(lblValorCaixa);
		lblValorCaixa.setFont(Propiedade.FONT2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.BLUE);
		separator_3.setBackground(Color.BLUE);
		separator_3.setBounds(298, 0, 10, 86);
		panel_3.add(separator_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.BLACK,1,true));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(342, 232, 329, 86);
		add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblValoresAReceber = new JLabel("Valores a Receber");
		lblValoresAReceber.setBounds(10, 0, 202, 39);
		panel_2.add(lblValoresAReceber);
		lblValoresAReceber.setFont(Propiedade.FONT4);
		
		lblValorReceber = new JLabel("R$ 0,00");
		lblValorReceber.setBackground(Color.WHITE);
		lblValorReceber.setBounds(64, 61, 62, 14);
		panel_2.add(lblValorReceber);
		lblValorReceber.setFont(Propiedade.FONT2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLUE);
		separator_2.setBackground(Color.BLUE);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(298, 0, 8, 86);
		panel_2.add(separator_2);
		
		btnNovaVenda = new JButton("Nova Venda");
		btnNovaVenda.setFont(Propiedade.FONT2);
		btnNovaVenda.setBackground(Color.WHITE);
		btnNovaVenda.setBounds(10, 123, 145, 39);
		add(btnNovaVenda);
		
		JLabel lblEntradasESaidas = new JLabel("Entradas e Saidas");
		lblEntradasESaidas.setFont(Propiedade.FONT3);
		lblEntradasESaidas.setBounds(10, 206, 218, 31);
		add(lblEntradasESaidas);

		
		setBackground(Color.WHITE);
		
		PaneGradiente panel = new PaneGradiente(Propiedade.cor1,Color.black);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 809, 99);
		add(panel);
		panel.setLayout(null);
		
		btnDashoroad = new JButton("Dashoroad");
		btnDashoroad.setFont(Propiedade.FONT2);
		btnDashoroad.setBackground(Color.WHITE);
		btnDashoroad.setBounds(10, 55, 130, 33);
		btnDashoroad.setBorder(null);
		btnDashoroad.setFocusPainted(false);
		panel.add(btnDashoroad);
		
		JLabel lblFinanceiro = new JLabel("Financeiro");
		lblFinanceiro.setBounds(10, 0, 201, 59);
		panel.add(lblFinanceiro);
		lblFinanceiro.setFont(Propiedade.FONT3);
		lblFinanceiro.setForeground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(342, 135, 329, 86);
		add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Color.BLACK,1,true));
		
//		JLabel lblFormasDePagamento = new JLabel("Formas de Pagamento");
//		lblFormasDePagamento.setFont(new Font("Tahoma", Font.PLAIN, 25));
//		lblFormasDePagamento.setBounds(423, 23, 264, 28);
//		add(lblFormasDePagamento);
		
		JLabel lblCaixas = new JLabel("Caixas");
		lblCaixas.setBounds(10, 0, 202, 59);
		panel_1.add(lblCaixas);
		lblCaixas.setBackground(Color.WHITE);
		lblCaixas.setFont(Propiedade.FONT3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.BLUE);
		separator_1.setBackground(Color.BLUE);
		separator_1.setBounds(298, 0, 8, 86);
		panel_1.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.BLUE);
		separator.setBackground(Color.BLUE);
		separator.setBounds(324, 100, 7, 405);
		add(separator);
	}

	public JLabel getLblValorCaixa() {
		return lblValorCaixa;
	}

	public JLabel getLblValorReceber() {
		return lblValorReceber;
	}

	public JButton getBtnNovaVenda() {
		return btnNovaVenda;
	}
	

	public void setLblValorCaixa(JLabel lblValorCaixa) {
		this.lblValorCaixa = lblValorCaixa;
	}

	public void setLblValorReceber(JLabel lblValorReceber) {
		this.lblValorReceber = lblValorReceber;
	}

	public JButton getBtnDashoroad() {
		return btnDashoroad;
	}
}
