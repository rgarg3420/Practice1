package main.com.xmlObjectConversion;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import main.com.generated.ExpenseT;
import main.com.generated.ItemListT;
import main.com.generated.ItemT;
import main.com.generated.ObjectFactory;
import main.com.generated.UserT;

import java.io.File;
import java.math.BigDecimal;
 
public class ItemXMLGeneration
 
{
    public static void main(String[] args) throws JAXBException
    {
 File xmlFile = new File("expenses.xml");
        ObjectFactory factory = new ObjectFactory();
 
        UserT user = factory.createUserT();
        user.setUserName("Sanaulla");
        ItemT item = factory.createItemT();
        item.setItemName("Seagate External HDD");
        item.setPurchasedOn("August 24, 2010");
        item.setAmount(new BigDecimal("6776.5"));
 
        ItemListT itemList = factory.createItemListT();
        itemList.getItem().add(item);
 
        ExpenseT expense = factory.createExpenseT();
        expense.setUser(user);
        expense.setItems(itemList);
 
        JAXBContext context = JAXBContext.newInstance("main.com.generated");
        JAXBElement<ExpenseT> element = factory.createExpenseReport(expense);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty("jaxb.formatted.output",Boolean.TRUE);
        marshaller.marshal(element,xmlFile);
    }
 
}