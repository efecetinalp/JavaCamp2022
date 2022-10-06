public class Main {
    public static void main(String[] args) {
        BaseLoanManager[] baseLoanManagers = new BaseLoanManager[]
                {new TeacherLoanManager(), new AgriculturalLoanManager(), new StudentLoanManager()};

        for (BaseLoanManager loanManager : baseLoanManagers){
            System.out.println(loanManager.calculate(1000));
        }
    }
}
