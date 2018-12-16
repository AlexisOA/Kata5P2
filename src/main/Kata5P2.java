/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import static view.MailHistogramBuilder.build;
import static view.MailListReader.read;
 public class Kata5P2 {
    
    private final String fileName;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;
            
    public static void main(String[] args)  {
        Kata5P2 k = new Kata5P2("C:\\Users\\Alexis\\Documents\\NetBeansProjects\\Kata5P2\\email.txt");
        k.execute();
    }
     public Kata5P2(String fileName) {
        this.fileName = fileName;
    }
    
    public void execute() {
        input();
        process();
        output();
    }
    
    public void input() {
        try {
           mailList = read(fileName); 
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error con el fichero");
        }
    }
    
    public void process() {
        histogram = build(mailList);
    }
    
    public void output() {
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}