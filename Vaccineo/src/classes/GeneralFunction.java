package classes;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
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

    private String value;

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
            String[] columnsName = firstLine.split(";");
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setColumnIdentifiers(columnsName);

            // get lines from txt file
            Object[] tableLines = br.lines().toArray();

            // extract the data from lines
            // set data to jtable model
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(";");
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
        // System.out.println(appointmentList.get(0).get(0));
    }

    public void tableLoaderOneColumn(JTable table, ArrayList<ArrayList<String>> list, int index) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int colNum = list.get(0).size();
        Object rowHeader[] = new Object[1];
        Object rowData[] = new Object[colNum];

        // get the first row of the text file
        for (int i = 0; i == 0; i++) {
            for (int j = index; j < index + 1; j++) {
                //System.out.println(appointmentList.get(i).get(j));
                rowHeader[j - 1] = list.get(i).get(index);
            }
        }
        System.out.println(Arrays.toString(rowHeader));
        // set the header of table
        model.setColumnIdentifiers(rowHeader);

        // get the content of the text file except for header
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < index; j++) {
                rowData[j] = list.get(i).get(index);
            }
            model.addRow(rowData);
        }
    }

    public void tableLoaderOmittedColumn(JTable table, ArrayList<ArrayList<String>> list, int startFrom) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        // The total number of the column
        int colNum = list.get(0).size();
        // After ommit x number of column
        int afterOmmited = colNum - startFrom;
        // System.out.println(colNum);
        // the object here need to have "afterOmmited" number of size
        Object rowHeader[] = new Object[afterOmmited];
        Object rowData[] = new Object[afterOmmited];
        // System.out.println(rowHeader.length);
        // System.out.println(rowData.length);

        // get the first row of the text file
        for (int i = 0; i == 0; i++) {
            // start from which column
            for (int j = startFrom; j < colNum; j++) {
                // set rowHeader[0]
                rowHeader[j - startFrom] = list.get(i).get(j);
            }
            // System.out.println(Arrays.toString(rowHeader));
        }
        // set the header of table
        model.setColumnIdentifiers(rowHeader);

        // get the content of the text file except for header
        for (int i = 1; i < list.size(); i++) {
            // start from which column
            for (int j = startFrom; j < colNum; j++) {
                // set rowHeader[0]
                rowData[j - startFrom] = list.get(i).get(j);
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

    public void tableLoaderStartsWith(JTable table, ArrayList<ArrayList<String>> list, String condition, int index) {
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
            if (list.get(i).get(index).startsWith(condition)) {
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

    public void tableLoaderStartsWith(JTable table, ArrayList<ArrayList<String>> list, int index1, String condition1, int index2, String condition2) {
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
            if (list.get(i).get(index1).startsWith(condition1) && list.get(i).get(index2).equals(condition2)) {
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

    public void tableLoaderStartsWithOmitted(JTable table, ArrayList<ArrayList<String>> list, String condition, int index, int startIndex) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int colNum = list.get(0).size();
        int afterOmmited = colNum - startIndex;
        Object rowHeader[] = new Object[afterOmmited];
        Object rowData[] = new Object[afterOmmited];

        // get the first row of the text file
        for (int i = 0; i == 0; i++) {
            for (int j = startIndex; j < colNum; j++) {
                //System.out.println(appointmentList.get(i).get(j));
                rowHeader[j - startIndex] = list.get(i).get(j);
            }
        }
        // set the header of table
        model.setColumnIdentifiers(rowHeader);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).get(index).startsWith(condition)) {
                for (int j = startIndex; j < colNum; j++) {
                    rowData[j - startIndex] = list.get(i).get(j);
                }
                model.addRow(rowData);
                //table.revalidate();
            }
            //table.revalidate();
        }
        //table.revalidate();
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
                //table.revalidate();
            }
            //table.revalidate();
        }
        //table.revalidate();
    }

    public void tableLoaderEqualsOmmited(JTable table, ArrayList<ArrayList<String>> list, int index, String condition, int startIndex) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int colNum = list.get(0).size();
        int afterOmmited = colNum - startIndex;
        Object rowHeader[] = new Object[afterOmmited];
        Object rowData[] = new Object[afterOmmited];

        // get the first row of the text file
        for (int i = 0; i == 0; i++) {
            for (int j = startIndex; j < list.get(i).size(); j++) {
                //System.out.println(appointmentList.get(i).get(j));
                rowHeader[j - startIndex] = list.get(i).get(j);
            }
        }
        // set the header of table
        model.setColumnIdentifiers(rowHeader);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).get(index).equals(condition)) {
                for (int j = startIndex; j < list.get(i).size(); j++) {
                    rowData[j - startIndex] = list.get(i).get(j);
                }
                model.addRow(rowData);
                //table.revalidate();
            }
            //table.revalidate();
        }
        //table.revalidate();
    }

    public void tableLoaderEqualsMore(JTable table, ArrayList<ArrayList<String>> list, int index1, String condition1, int index2, String condition2) {
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
            if (list.get(i).get(index1).equals(condition1) && list.get(i).get(index2).equals(condition2)) {
                for (int j = 0; j < list.get(i).size(); j++) {
                    rowData[j] = list.get(i).get(j);
                }
                model.addRow(rowData);
                //table.revalidate();
            }
            //table.revalidate();
        }
        //table.revalidate();
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void tableRowClicked(JTable table) {

        table.addMouseListener(new MouseAdapter() {
            String value;

            @Override
            public void mouseClicked(MouseEvent me) {

                if (me.getClickCount() == 2) {     // to detect doble click events
                    JTable target = (JTable) me.getSource();
                    int row = target.getSelectedRow(); // select a row
                    // int column = target.getSelectedColumn(); // select a column                
                    value = (String) table.getValueAt(row, 0);
                    setValue(value);
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
            String[] items = nextLine.split(";");

            list.addAll(Arrays.asList(items));
            theList.add(list);
            Arrays.fill(items, null);
        }

        return theList;
    }

    public void writeIntoFile(ArrayList<ArrayList<String>> list, String file) throws IOException {
        File fileName = new File(file);

        FileWriter fw = new FileWriter(fileName);
        try (Writer output = new BufferedWriter(fw)) {
            int size = list.size();
            for(int i = 0; i < size; i++) {
                for(int j = 0; j == 0; j++) {
                    output.write(list.get(i).get(j));
                }
                for(int j = 1; j < list.get(i).size(); j++) {                
                    if(j != list.get(i).size() - 1) {
                        output.write(";" + list.get(i).get(j));
                    } else {
                        output.write(";" + list.get(i).get(j) + "\n");
                    }
                    
                }
            }
        }

    }

}
