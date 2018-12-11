package com.yolo.idea.plugin;

import com.android.ddmlib.Client;
import com.android.ddmlib.IDevice;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.wm.ToolWindow;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

public class SystemDumpWindow implements IDeviceConnectStateListener {

    /**
     * activities
     * services
     * broadcasts
     * intents
     * providers
     * recents
     * processes
     */
    private static final String ADB_SHELL_DUMPSYS = "dumpsys activity ";
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JTextArea TAActivity;
    private JTextArea TAService;
    private JTextArea TABoradcast;
    private JTextArea TARencents;
    private JTextArea TAProcesses;
    private JToolBar toolbar;
    private JButton refreshButton;
    private JProgressBar progressBar1;
    private JTextArea TAIntents;
    private JTextArea TAProviders;
    private JComboBox CBDeviceList;
    private final String[] systemComponents = new String[]{
            "activities",
            "services",
            "broadcasts",
            "recents",
            "processes",
            "intents",
            "providers"
    };
    private final List<JTextArea> textAreas = new ArrayList<>();
    private int currentIndex = 0;
    private JTextArea currentText = TAActivity;

    public SystemDumpWindow(ToolWindow toolWindow) {
        textAreas.add(TAActivity);
        textAreas.add(TAService);
        textAreas.add(TABoradcast);
        textAreas.add(TARencents);
        textAreas.add(TAProcesses);
        textAreas.add(TAIntents);
        textAreas.add(TAProviders);
        tabbedPane1.addChangeListener(event -> {
            JPanel component = (JPanel) tabbedPane1.getSelectedComponent();
            currentIndex = tabbedPane1.indexOfComponent(component);
            currentText = textAreas.get(currentIndex);
            try {
                processCommand(systemComponents[currentIndex]);
            } catch (Exception e) {
                currentText.setText(e.getMessage());
            }
        });

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                processCommand(systemComponents[currentIndex]);

            }
        });

        CBDeviceList.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                IDevice[] devices = AndroidDeviceManager.INSTANCE.getDevices();
                int selectIndex = CBDeviceList.getSelectedIndex();
                if (devices != null && devices.length > selectIndex && selectIndex != -1)
                    AndroidDeviceManager.INSTANCE.setSelectedDevice(devices[selectIndex]);
            }
        });

        AndroidDeviceManager.INSTANCE.init();
        AndroidDeviceManager.INSTANCE.registerDeviceStateListener(this);
        processCommand(systemComponents[0]);

    }

    private void processCommand(String command) {
        if (AndroidDeviceManager.INSTANCE.getDevices() != null) {
            if (AndroidDeviceManager.INSTANCE.getSelectedDevice() != null) {
                try {
                    progressBar1.setVisible(true);
                    currentText.setText("");
                    AndroidDeviceManager.INSTANCE.executeCommand(ADB_SHELL_DUMPSYS + command, new Function1<String[], Unit>() {
                        @Override
                        public Unit invoke(String[] strings) {
                            for (int i = 1; i < strings.length; i++) {
                                currentText.append(strings[i] + "\n");
                            }
                            currentText.setCaretPosition(0);
                            progressBar1.setVisible(false);
                            return null;
                        }
                    });
                } catch (Exception e) {
                    progressBar1.setVisible(false);
                    currentText.setText("命令执行错误!!");
                    Utils.INSTANCE.showNotification("Dump service info IO error:" + e.getMessage(), NotificationType.ERROR);
                }
            }
        } else {
            progressBar1.setVisible(false);
            Utils.INSTANCE.showNotification("No devices connected", NotificationType.ERROR);
        }
    }

//    private void processCommand(JTextArea textArea, String command) {
//
//        SwingWorker worker = new SwingWorker<String, Void>() {
//
//            @Override
//            protected String doInBackground() throws Exception {
//                BufferedReader reader = null;
//                StringBuilder stringBuilder = new StringBuilder();
//                try {
//                    Process process = Runtime.getRuntime().exec(ADB_SHELL_DUMPSYS + " " + command);
//                    InputStream inputStream = process.getInputStream();
//                    reader = new BufferedReader(new InputStreamReader(inputStream));
//                    String line = reader.readLine();
//                    if (TextUtils.isEmpty(line)) {
//                        Utils.INSTANCE.showNotification("No content dumped, please check adb connection", NotificationType.ERROR);
//                        return null;
//                    }
//                    while ((line = reader.readLine()) != null) {
//                        stringBuilder.append(line + "\n");
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                    Utils.INSTANCE.showNotification("Dump service info IO error:"+e.getMessage(), NotificationType.ERROR);
//                } finally {
//                    if (reader != null) {
//                        reader.close();
//                    }
//                }
//                return stringBuilder.toString();
//            }
//
//            @Override
//            protected void done() {
//                try {
//                    String content = get();
//                    if (content == null) {
//                        return;
//                    }
//                    textArea.setText(get());
//                    textArea.setCaretPosition(0);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                    Utils.INSTANCE.showNotification("Dump service info IO error", NotificationType.ERROR);
//                } catch (ExecutionException e) {
//                    e.printStackTrace();
//                    Utils.INSTANCE.showNotification("Dump service info IO error", NotificationType.ERROR);
//                } finally {
//                    progressBar1.setVisible(false);
//                }
//
//            }
//        };
//        progressBar1.setVisible(true);
//        worker.execute();
//    }

    public JPanel getPanel() {
        return panel1;
    }

    @Override
    public void onDeviceConnected(@Nullable IDevice device) {
        Client[] clients = device.getClients();
        for (int i = 0; i < clients.length; i++) {
            System.out.println("client: " + clients[i].toString());
        }
        updateDeviceList(device);
    }

    @Override
    public void onDeviceDisconnected(@Nullable IDevice device) {
        updateDeviceList(device);
    }

    private void updateDeviceList(IDevice device) {
        CBDeviceList.removeAllItems();
        IDevice[] allDevices = AndroidDeviceManager.INSTANCE.getDevices();
        for (int i = 0; i < allDevices.length; i++) {
            IDevice iDevice = allDevices[i];
            System.out.println("updateDeviceList: " + iDevice.getName() + ", " + iDevice.getState());
            CBDeviceList.addItem(iDevice.getName() + ":" + iDevice.getState().name());

        }
        if (CBDeviceList.getItemCount() == 0) {
            CBDeviceList.addItem("No Device Connected");
        }
    }

    @Override
    public void onDeviceStateChange(@Nullable IDevice device, int state) {
        updateDeviceList(device);
    }

}
