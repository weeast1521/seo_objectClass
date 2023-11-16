abstract class Printer{
    public abstract boolean print();
}

class InkjetPrinter extends Printer{
    private String model; //모델명
    private int printedCount = 0; //현재까지의 출력 매수
    private int availableCount; //출력 가능 매수
    InkjetPrinter(String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
    }
    @Override
    public boolean print(){
        if(availableCount == 0){
            System.out.println(model + ": " + printedCount + 1 + "매째 인쇄 실패- 잉크 부족.");
            return false;
        }
        else{
            printedCount++;
            availableCount--;
            return true;
        }
    }
}
class LaserPrinter extends Printer{
    private String model; //모델명
    private int printedCount = 0; //현재까지의 출력 매수
    private int availableCount; //출력 가능 매수
    LaserPrinter(String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
    }
    @Override
    public boolean print(){
        if(availableCount == 0){
            System.out.println(model + ": " + printedCount + 1 + "매째 인쇄 실패- 토너 부족.");
            return false;
        }
        else{
            printedCount++;
            availableCount--;
            return true;
        }
    }
}

public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW",7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while(inkjet.print());
        while(laser.print());
    }
}
