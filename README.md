本程序通过每隔一段时间读写一次硬盘来防止指定目录休眠。

支持Windows/Linux/MacOS

使用方法：

提取项目release下的KeepUrDiskAlive.jar

前台运行：

```$xslt
Windows下，同时防止C盘和D盘休眠
java -jar KeepUrDiskAlive.jar c:/ d:/

Linux/MacOS下，防止任意目录休眠
java -jar KeepUrDiskAlive.jar /mnt /Volumes/disk1 /home
```

后台运行：

```$xslt
Windows：
javaw -jar KeepUrDiskAlive.jar [参数]

Linux/MacOS：
java -jar KeepUrDiskAlive.jar [参数] &
```