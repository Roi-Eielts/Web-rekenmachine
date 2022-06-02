package prg;


import com.opensymphony.xwork2.ActionSupport;

/**
 * <code>Set welcome message.</code>
 */
public class HelloAction extends ActionSupport {

    Rekenmachine rek = new Rekenmachine();
    private int getal1;
    private int getal2;
    private String opperator = "+";
    private int resultaat;

    public String execute() throws Exception {
        switch(opperator) {
            case "+":
                resultaat = rek.add(getal1, getal2);
                break;
            case "-":
                resultaat = rek.subtract(getal1, getal2);
                break;
            case "/":
                resultaat = rek.devide(getal1, getal2);
                break;
            case "*":
                resultaat = rek.multply(getal1, getal2);
                break;
            case "^2":
                resultaat = rek.square(getal1);
                break;
            case "^n":
                resultaat = rek.exponentiation(getal1, getal2);
                break;
            default:
                return ERROR;

        }
        return SUCCESS;
    }

    public int getGetal1() {
        return getal1;
    }

    public void setGetal1(int getal1) {
        this.getal1 = getal1;
    }

    public int getGetal2() {
        return getal2;
    }

    public void setGetal2(int getal2) {
        this.getal2 = getal2;
    }

    public String getOpperator() {
        return opperator;
    }

    public void setOpperator(String opperator) {
        this.opperator = opperator;
    }

    public int getResultaat() {
        return resultaat;
    }
    public void setResultaat(int resultaat) {
        this.resultaat = resultaat;
    }

}