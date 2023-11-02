package Test2.Src.UI;

import javax.swing.*;

import Test2.Src.Bridges.AlexaBridge;
import Test2.Src.Bridges.GoogleHomeBridge;
import Test2.Src.Bridges.SmartphoneBridge;
import Test2.Src.Devices.Laptop;
import Test2.Src.Devices.Projector;
import Test2.Src.Devices.SmartTV;
import Test2.Src.Interfaces.Device;
import Test2.Src.Interfaces.DeviceBridge;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazGrafica {
    private JFrame frame;
    private JComboBox<String> controlComboBox;
    private JComboBox<String> dispositivoComboBox;

    public InterfazGrafica() {
        // Crear el marco (frame) principal
        frame = new JFrame("Ejemplo de Interfaz Gráfica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 120);
        frame.setLayout(new FlowLayout());

        AlexaBridge alexa;
        GoogleHomeBridge googleHome;
        SmartphoneBridge smartphone;
        Laptop laptop;
        Projector projector;
        SmartTV smartTV;

        // Crear JComboBox para el Control
        DeviceBridge[] controles = {alexa = new AlexaBridge(), googleHome = new GoogleHomeBridge(),smartphone = new SmartphoneBridge()};
        String[] controls = {"ALEXA", "GOOGLE HOME","SMARTPHONE"};
        controlComboBox = new JComboBox<>(controls);
        controlComboBox.setSelectedItem("ALEXA");
        frame.add(new JLabel("Control: "));
        frame.add(controlComboBox);

        // Crear JComboBox para el Dispositivo
        Device[] dispositivos = {laptop = new Laptop(),projector = new Projector(),smartTV = new SmartTV()};
        String[] devices = {"LAPTOP", "PROJECTOR","SMART TV"};
        dispositivoComboBox = new JComboBox<>(devices);
        dispositivoComboBox.setSelectedItem("LAPTOP");
        frame.add(new JLabel("Dispositivo: "));
        frame.add(dispositivoComboBox);

        // Crear el botón "Probar Control"
        JButton probarControlButton = new JButton("Probar Control");
        frame.add(probarControlButton);

        // Agregar un ActionListener al botón
        probarControlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String controlSeleccionado = controlComboBox.getSelectedItem().toString();
                controles[controlComboBox.getSelectedIndex()].setDevice(dispositivos[dispositivoComboBox.getSelectedIndex()]);
                String dispositivoSeleccionado = dispositivoComboBox.getSelectedItem().toString();
                JOptionPane.showMessageDialog(frame, "Control seleccionado: " + controlSeleccionado + "\nDispositivo seleccionado: " + dispositivoSeleccionado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                DeviceBridge controller = controles[controlComboBox.getSelectedIndex()];
                controller.testDevice();
                
            }
        });
        // Mostrar la ventana
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazGrafica();
            }
        });
    }
}
