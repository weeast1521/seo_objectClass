class PersonalComputer{
    private Computer computer = new Computer();
    private Monitor monitor = new Monitor();
    public void turnOn(){
        computer.turnOn();
        monitor.turnOn();
    }
    public void printInfo(){
        computer.printInfo();
        monitor.printInfo();
    }
}
class Monitor{
    private String monitorSize = "32 inch";
    private String color = "Black";
    private String power = "45W";
    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }
    public void printInfo(){
        System.out.println("The spec of the monitor\n " + "Size: " + monitorSize + "\n Color: " + color +
                "Power: " + power);
    }
}
class Computer{
    private String cpu = "Core i7";
    private String memory = "16GB";
    private String hd = "2TB";
    private String color = "White";
    private String power = "500W";
    public void turnOn(){
        System.out.println("Turning on the computer.");
    }
    public void printInfo(){
        System.out.println("The spec of the computer\n" + " CPU: " + cpu + "\n Memory: "
                + memory + "\n HDD: " + hd + "\n Color: " + color + "\n Power: " + power);
    }
}
class Test{
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer();
        pc.turnOn();
        pc.printInfo();
    }
}
