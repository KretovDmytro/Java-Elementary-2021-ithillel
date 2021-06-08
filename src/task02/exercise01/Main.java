package task02.exercise01;

/**
 * @author Kretov D.V
 */

public class Main {

    public static void main(String[] args) {

        Tax tax = new Tax();
        Tax taxPercentage = new TaxPercentage(0.25);
        Tax taxWithoutPercentage = new TaxWithoutPercentage(8.9, 0.1);
        Tax variableTax = new VariableTax();
        InfoOfIncome infoOfIncome = new InfoOfIncome();

        infoOfIncome.showStartInfo(tax.income);

        Tax[] taxArray = {taxPercentage, taxWithoutPercentage, variableTax};
        for (Tax value : taxArray) {
            infoOfIncome.profit += tax.calculate(value.calculate(tax.income));
        }

        infoOfIncome.showFinishInfo(tax.income - infoOfIncome.profit);
    }
}
