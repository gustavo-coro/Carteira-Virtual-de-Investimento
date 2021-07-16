package carteiraInvestimentos;

import acaoBolsa.AcaoBolsa;
import java.util.ArrayList;
import java.util.EventListener;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel {

    //pequeno vetor usado para guardar o nome de cada coluna
    private String[] columnName = {"NOME", "V.APORTE", "DATA", "V.ATUAL", "LUCRO", "RETORNO(%)"};
    //ArrayList responsável por guardar as informações da tabela
    private ArrayList<AcaoBolsa> rowData = new ArrayList();

    public ModeloTabela() {
    }

    @Override
    public int getRowCount() {
        return rowData.size(); //o numero de linhas da tabela corresponde ao número de objetos criados
    }

    @Override
    public int getColumnCount() {
        return columnName.length; //o numero de colunas da tabela corresponde ao número de colunas criadas acima
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        AcaoBolsa acaoBolsa = (AcaoBolsa) rowData.get(rowIndex);
        switch (columnIndex) {
            case 0: {
                return acaoBolsa.getNome();
            }
            case 1: {
                return acaoBolsa.getAporte();
            }
            case 2: {
                return acaoBolsa.getData();
            }
            case 3: {
                return acaoBolsa.getValorAtual();
            }
            case 4: {
                return acaoBolsa.getLucro();
            }
            case 5: {
                return acaoBolsa.getRetorno();
            }
            default: {
                return null;
            }
        }
    }

    //apenas a coluna Valor Atual pode ser editada
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }

    //metodo que adiciona o objeto criado com os dados do usuario e o adicionada no ArrayList
    //consequentemente também adiciona uma nova linha na tabela
    public void addAcao(AcaoBolsa a) {
        rowData.add(a);
        fireTableDataChanged(); //usado para atualizar a tabela com os novos dados
    }

    //metodo que remove um objeto do ArreyList
    //consequentemente também remove a linha correspondente na tabela
    public void removeAcao(int i) {
        if (rowData.size() >= 0 && !rowData.isEmpty()) {
            rowData.remove(i);
            fireTableDataChanged(); //usado para atualizar a tabela com os novos dados
        }
    }

    //metodo que permite o usuário editar o valor de uma linha na coluna Valor Atual
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex == 3) {
            try {
                //atualiza o Valor Atual com base no que o usuario digitou
                this.rowData.get(rowIndex).setValorAtual(Double.parseDouble((String) aValue));
                this.rowData.get(rowIndex).setLucro(); //atualiza o lucro com base no novo Valor Atual
                this.rowData.get(rowIndex).setRetorno(); //atualiza o retorno com base no novo Valor Atual
                fireTableDataChanged(); //usado para atualizar a tabela com os novos dados
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Valor incorreto no campo de números", "ERRO",
                        JOptionPane.ERROR_MESSAGE);
            }

        }
    }

}
