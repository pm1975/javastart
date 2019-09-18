/**
 * Created by Piotr on 2019-09-18
 */
public class Bank {
    public static void main(String[] args) {
        //pierwsza osoba
        Person person = new Person();
        person.firstName = "Jan";
        person.lastName = "Kowalski";
        person.pesel = "90897812362";
        //tworzymy adres
        Address address = new Address();
        address.street = "Krucza";
        address.homeNumber = 51;
        address.flatNumber = "5B";
        address.city = "Warszawa";
        address.postalCode = "00-022";
        //taki sam adres zamieszkania i zameldowania
        person.livingAddress = address;
        person.registeredAddress = address;
        //pierwsze konto bankowe
        BankAccount bankAccount = new BankAccount();
        bankAccount.owner = person; //referencja na obiekt person
        bankAccount.balance = 10_000;

        //druga osoba
        Person person1 = new Person();
        person1.firstName = "Marta";
        person1.lastName = "Kowalska";
        person1.pesel = "75982504875";
        person1.livingAddress = address;
        person1.registeredAddress = new Address();
        person1.registeredAddress.street = "Śląska";
        person1.registeredAddress.homeNumber = 23;
        person1.registeredAddress.city = "Kraków";
        person1.registeredAddress.postalCode = "30-003";
        //drugie konto bankowe
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.owner = person1;
        bankAccount1.balance = 5_000;

        Credit credit = new Credit();
        credit.borrower = person;
        credit.cashBorrowed = 2000;
        credit.interestRate = 0.05;
        credit.termMonths = 12;

//        System.out.println("Osoba;");
//        System.out.println(person.firstName + " " + person.lastName + " " + person.pesel);
//        System.out.println("posiada konto bankowe z kwotą: " + bankAccount.balance);
//        System.out.println("oraz kredyt na kwotę: " + credit.cashBorrowed);
        System.out.println("Osoba1:");
        System.out.println(person.firstName + " " + person.lastName);
        System.out.println("mieszka w miejscowości: " + person.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + bankAccount.balance);
        System.out.println("Osoba2:");
        System.out.println(person1.firstName + " " + person1.lastName);
        System.out.println("mieszka w miejscowości: " + person1.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + bankAccount1.balance);
    }
}
