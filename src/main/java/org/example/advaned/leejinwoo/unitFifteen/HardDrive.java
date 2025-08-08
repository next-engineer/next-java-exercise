package org.example.advaned.leejinwoo.unitFifteen;

public class HardDrive {
    public String read(long lba, int size) {
        System.out.println("HardDrive: read " + size + " bytes from " + lba);
        return "OS_BOOT_DATA";
    }
}
