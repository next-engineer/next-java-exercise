package org.example.advaned.yunbyeongchang.unitfifteen.homework;

public class HardDrive {
    //method
    public String read(long lba, int size) {
        System.out.println("HardDrive: read " + size + " bytes from " + lba);
        return "OS_BOOT_DATA";
    }

    public void write(long lba, String data) {
        System.out.println("HardDrive: write data " + data + " at position " + lba);
    }
}
