package Practice4_1.Task6;

public class Manager extends Employer{
    private Double averageSum;

    public Manager(String firstName, String lastName, Double income, Double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public Double getIncome() {
        return super.getIncome() + averageSum;
    }
}