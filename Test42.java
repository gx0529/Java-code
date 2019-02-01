package www.bit.java;

interface USB{
    public void plugIn(); //将USB设备插入电脑
    public void setup(); //安装USB驱动
    public void work(); //进行工作
}

class UDisk implements USB{
    @Override
    public void plugIn() {
        System.out.println("U盘插入电脑");
    }

    @Override
    public void setup() {
        System.out.println("安装U盘驱动");
    }

    @Override
    public void work() {
        System.out.println("U盘正常使用");
    }
}

class PrintDisk implements USB{
    @Override
    public void plugIn() {
        System.out.println("打印机插入电脑");
    }

    @Override
    public void setup() {
        System.out.println("安装打印机驱动");
    }

    @Override
    public void work() {
        System.out.println("打印机正常使用");
    }
}

class Computer{
    public void plugin(USB usb){
        usb.plugIn();
        usb.setup();
        usb.work();
    }
}

public class Test2{
    public static void main(String[] args){
        Computer computer = new Computer();
        computer.plugin(new UDisk());
        computer.plugin(new PrintDisk());
    }
}










