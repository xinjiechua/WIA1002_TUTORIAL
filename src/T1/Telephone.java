package T1;

public class Telephone{
    private String areaCode, number;
    private static int numberOfTelephoneObject;

    public Telephone(String areaCode, String number){
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setAreaCode(String areaCode){
        this.areaCode = areaCode;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String makeFullNumber(){
        return areaCode + "-" + number;
    }

    public static void main (String[]args){
        Telephone num1 = new Telephone("03", "79676300");
        Telephone num2 = new Telephone("03", "79676301");
        Telephone num3 = new Telephone("03", "79676302");
        Telephone num4 = new Telephone("03", "79676303");
        Telephone num5 = new Telephone("03", "79676304");

        Telephone [] tel = {num1, num2, num3, num4, num5};
        for(Telephone x : tel){
            System.out.println(x.makeFullNumber());
        }
    }
}


