package pers.adlered.keepurdiskalive.main;

/**
 * <h3>KeepUrDiskAlive</h3>
 * <p>执行器</p>
 *
 * @author : https://github.com/AdlerED
 * @date : 2019-10-19 20:24
 **/
public class Do {
    public static boolean started = false;

    public static boolean tryStart() {
        if (!started) {
            Thread processor = new Thread(new Processor());
            processor.start();
            return true;
        } else {
            return false;
        }
    }
}
