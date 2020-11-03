/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.utcluj.ssatr.bank.sim;

/**
 *
 * @author Ramol
 */
public class Test {
    public static void main(String[] args){
        BankAccount a1= new BankAccount("Brd", 100);
        BankAccount a2= new BankAccount("Raiffeisen", 210);
        BankAccount a3= new BankAccount("CEC", 73);
        
        AccountsManager am= new AccountsManager();
        am.addBankAccount(a1);
        am.addBankAccount(a2);
        am.addBankAccount(a3);
        
        //System.out.println("Sum of the accounts balance is: " + am.getTotalBalance());
        
        //System.out.println(am.getBalanceOfAccounts(a1));
        
        //System.out.println(am.getBalanceByOwner("CEC"));
    }
}
