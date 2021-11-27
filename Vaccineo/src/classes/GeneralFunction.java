package classes;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GeneralFunction {

    public Color priColor = new Color(0, 109, 119);
    public Color secColor = new Color(131, 197, 190);
    public Color bgColor = new Color(237, 246, 249);

    private void panelHover(JPanel panel, JPanel icon) {
        panel.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel.setBackground(priColor);
                icon.setBackground(priColor);

            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel.setBackground(secColor);
                icon.setBackground(secColor);
            }

        });
    }

    public void loadDataToTable(String database, JTable table) {
        String path = database;
        File file = new File(path);

        try {

            BufferedReader br = new BufferedReader(new FileReader(file));

            // get the first line
            // get the columns name to the jtable model
            // set columns name to the jtable model
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setColumnIdentifiers(columnsName);

            // get lines from txt file
            Object[] tableLines = br.lines().toArray();

            // extract the data from lines
            // set data to jtable model
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }

            //setTableHeaderStyle(dataTable);
        } catch (IOException ex) {
        }
    }

    public void tableLoader(JTable table, ArrayList<ArrayList<String>> list) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int colNum = list.get(0).size();
        Object rowHeader[] = new Object[colNum];
        Object rowData[] = new Object[colNum];

        // get the first row of the text file
        for (int i = 0; i == 0; i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                //System.out.println(appointmentList.get(i).get(j));
                rowHeader[j] = list.get(i).get(j);
            }
        }
        // set the header of table
        model.setColumnIdentifiers(rowHeader);
        
        // get the content of the text file except for header
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                rowData[j] = list.get(i).get(j);
            }
            model.addRow(rowData);
        }

        // get the content of the text file except for header (with condition)
        /*
        for (int i = 1; i < appointmentList.size(); i++) {
            if (appointmentList.get(i).get(4).equals("-")) {
                for (int j = 0; j < appointmentList.get(i).size(); j++) {
                    rowData[j] = appointmentList.get(i).get(j);
                }
                model.addRow(rowData);
            }
        }
         */
        //System.out.println(appointmentList.get(0).get(0));
    }
    
    public void tableLoaderStartsWith(JTable table, ArrayList<ArrayList<String>> list, String condition) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int colNum = list.get(0).size();
        Object rowHeader[] = new Object[colNum];
        Object rowData[] = new Object[colNum];

        // get the first row of the text file
        for (int i = 0; i == 0; i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                //System.out.println(appointmentList.get(i).get(j));
                rowHeader[j] = list.get(i).get(j);
            }
        }
        // set the header of table
        model.setColumnIdentifiers(rowHeader);
        
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).get(0).startsWith(condition)) {
                for (int j = 0; j < list.get(i).size(); j++) {
                    rowData[j] = list.get(i).get(j);
                }
                model.addRow(rowData);
                table.revalidate();
            }
            table.revalidate();
        }
        table.revalidate();
    }
    
    public void tableLoaderEquals(JTable table, ArrayList<ArrayList<String>> list, int index, String condition) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int colNum = list.get(0).size();
        Object rowHeader[] = new Object[colNum];
        Object rowData[] = new Object[colNum];

        // get the first row of the text file
        for (int i = 0; i == 0; i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                //System.out.println(appointmentList.get(i).get(j));
                rowHeader[j] = list.get(i).get(j);
            }
        }
        // set the header of table
        model.setColumnIdentifiers(rowHeader);
        
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).get(index).equals(condition)) {
                for (int j = 0; j < list.get(i).size(); j++) {
                    rowData[j] = list.get(i).get(j);
                }
                model.addRow(rowData);
                table.revalidate();
            }
            table.revalidate();
        }
        table.revalidate();
    }
    
    public void tableRowClicked(JTable table) {
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                if (me.getClickCount() == 2) {     // to detect doble click events
                    JTable target = (JTable) me.getSource();
                    int row = target.getSelectedRow(); // select a row
                    // int column = target.getSelectedColumn(); // select a column
                    // System.out.println(table.getValueAt(row, 0));
                }
            }

        });
    }
    
    public void refreshTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

    public ArrayList<ArrayList<String>> generate2DArray(String file) throws FileNotFoundException {
        String path = file;
        Scanner s = new Scanner(new File(path));
        ArrayList<ArrayList<String>> theList = new ArrayList<>();

        while (s.hasNextLine()) {
            ArrayList<String> list = new ArrayList<>();
            String nextLine = s.nextLine();
            String[] items = nextLine.split(",");

            list.addAll(Arrays.asList(items));
            theList.add(list);
            Arrays.fill(items, null);
        }

        return theList;
    }

}
