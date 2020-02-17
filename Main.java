class Main {
  public static void main(String[] args) {
    // User user = new User();
    // user.name = "Adel";
    // System.out.println(user.name);
    User user = new User("Adel", 30);
    System.out.println(user.name);
    user.sayHello();

    TaxCalculator calculator = getCalculator();
    calculator.calculateTax();

    var account = new Account();
    account.deposit(10);
    account.withdraw(5);
    System.out.println(account.getBalance());

    var mailService = new MailService();
    mailService.sendEmail();

    var textBox = new TextBox();
    textBox.enable();

    drawUIControl(new TextBox());
    drawUIControl(new CheckBox());

  }

  public static void drawUIControl(UIControl control){
    control.draw();
  }

  public static TaxCalculator getCalculator(){
    return new TaxCalculator2019();
  }


}