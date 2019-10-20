package pers.adlered.keepurdiskalive.main;

import pers.adlered.keepurdiskalive.value.Value;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide your drive paths in startup args. Example:");
            System.out.println("$ java -jar KeepUrDiskAlive.jar /Volumes/ADLER-DATA D:/ E:/");
            System.out.println("You can appoint 1 or more path(s).");
            System.exit(0);
        } else {
            add(args);
            Do.tryStart();
        }
    }

    private static void add(String[] args) {
        for (String i : args) {
            Value.volume.add(i);
        }
    }
}
