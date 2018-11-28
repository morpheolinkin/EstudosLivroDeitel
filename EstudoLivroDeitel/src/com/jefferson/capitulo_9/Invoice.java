package com.jefferson.capitulo_9;

public class Invoice implements Payable{
    private final String partNumber;
    private final String partDescription;
    private int quantfy;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantfy, double pricePerItem) {
        if (quantfy < 0)
            throw new IllegalArgumentException("Quantfy must be >= 0");
        
        if (pricePerItem < 0.0)
            throw new IllegalArgumentException("PricePerItem must be >= 0.0");
        
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantfy = quantfy;
        this.pricePerItem = pricePerItem;
    }
    
    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }
    
    public int getQuantfy() {
        return quantfy;
    }

    public void setQuantfy(int quantfy) {
        if (quantfy < 0)
            throw new IllegalArgumentException("Quantfy must be >= 0");
        this.quantfy = quantfy;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0.0)
            throw new IllegalArgumentException("PricePerItem must be >= 0.0");
        this.pricePerItem = pricePerItem;
    }

    // retorno da representação de String do objeto Invoice
    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", 
                "Invoice", "Part Number", getPartNumber(), getPartDescription(), 
                "Quantfy", getQuantfy(), "Price per item", getPricePerItem());
    }
    
    // método requerido para executar o contrato com a interface Payable
    @Override
    public double getPaymentAmount() {
        return getQuantfy() * getPricePerItem();
    }
    
    
    
}
