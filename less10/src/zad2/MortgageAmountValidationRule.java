package zad2;

public class MortgageAmountValidationRule extends ValidationRule<Integer>{
    private static final int MIN_Amount = 1000000;
    private static final int MAX_Amount = 10000000;
    public MortgageAmountValidationRule(Integer value){
        super(value,"Минимальный размер ипотеки - 1.000.000, а максимальный - 10.000.000");
    }

    // Объявите и реализуйте метод для проверки суммы ипотеки ниже
    @Override
    public boolean isValid(){
        return value >= MIN_Amount && value <=MAX_Amount;
    }

}