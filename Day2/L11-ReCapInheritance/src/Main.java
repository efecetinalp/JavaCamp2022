public class Main {
    public static void main(String[] args) {
        LoanUI loanUI = new LoanUI();
        loanUI.calculateLoan(new TeacherLoanManager());
        loanUI.calculateLoan(new AgriculturalLoanManager());
        loanUI.calculateLoan(new CarLoanManager());
    }
}
