package org.example.advaned.kimaram.unitfifteen;

// 서브 시스템 1 - CPU
public class CPU {
    public void freeze() {System.out.println("CPU: freeze");}
    public void jump(long position) {System.out.println("CPU: jump to " + position);}
    public void execute() {System.out.println("CPU: execute");}
    public void shutdown() {System.out.println("CPU: shutdown");}
}
