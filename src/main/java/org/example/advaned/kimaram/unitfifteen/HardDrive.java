package org.example.advaned.kimaram.unitfifteen;

// 서브 시스템 2 - HardDrive
public class HardDrive {
    public String read(long lba, int size) {
        System.out.println("HardDrive: read " + size + " bytes from " + lba);
        return "OS_BOOT_DATA";
    }

    public void spinDown() {System.out.println("HardDrive: spin down");}
}
