package pers.adlered.keepurdiskalive.main;

import pers.adlered.keepurdiskalive.value.Value;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <h3>KeepUrDiskAlive</h3>
 * <p>执行器</p>
 *
 * @author : https://github.com/AdlerED
 * @date : 2019-10-19 20:33
 **/
public class Processor extends Thread {
    @Override
    public void run() {
        File file = null;
        Do.started = true;
        while (true) {
            for (String volume : Value.volume) {
                volume = volume.replaceAll("(/$)|(\\\\$)", "");
                String filename = volume + "/" + Value.tempFilename;
                try {
                    file = new File(filename);
                    file.createNewFile();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss:SSS");
                    System.out.println("[+] [" + simpleDateFormat.format(new Date()) + "] " + filename);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write("https://github.com/AdlerED".getBytes());
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    Thread.sleep(500);
                    file.delete();
                    System.out.println("[-] [" + simpleDateFormat.format(new Date()) + "] "  + filename);
                } catch (Exception e) {
                    System.out.println("[!] [NO DIR] "  + filename);
                }
            }
            try {
                Thread.sleep(Value.interval * 1000);
            } catch (InterruptedException IE) {
                IE.printStackTrace();
            }
        }
    }
}
