/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.invoice;

/**
 *
 * @author Naweed Quorishi
 */
public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    
    // Constructor:
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity > 0 ? quantity : 0;
        this.pricePerItem = pricePerItem > 0 ? pricePerItem : 0.0;
    }
    
    // Setters:
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity > 0 ? quantity : 0;
    }
    
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem > 0 ? pricePerItem : 0.0;
    }
    
    // Getters:
    public String getPartNumber() {
        return partNumber;
    }
    
    public String getPartDescription() {
        return partDescription;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public double getPricePerItem() {
        return pricePerItem;
    }
    
    // Method to calculate invoice amount:
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

