/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.invoice;

/**
 *
 * @author Naweed Quorishi
 */
public class InvoiceTest {
    public static void main(String[] args) {
        // Create an instance of Invoice:
        Invoice invoice = new Invoice("1234", "Hammer", 2, 14.95);
        
        // Output the invoice information:
        System.out.printf("Part Number: %s%n", invoice.getPartNumber());
        System.out.printf("Part Description: %s%n", invoice.getPartDescription());
        System.out.printf("Quantity: %d%n", invoice.getQuantity());
        System.out.printf("Price Per Item: $%.2f%n", invoice.getPricePerItem());
        System.out.printf("Invoice Amount: $%.2f%n", invoice.getInvoiceAmount());
        
        // Change the quantity and price per item:
        invoice.setQuantity(3);
        invoice.setPricePerItem(9.99);
        
        // Output the updated invoice information:
        System.out.printf("%nUpdated Quantity: %d%n", invoice.getQuantity());
        System.out.printf("Updated Price Per Item: $%.2f%n", invoice.getPricePerItem());
        System.out.printf("Updated Invoice Amount: $%.2f%n", invoice.getInvoiceAmount());
    }
}

