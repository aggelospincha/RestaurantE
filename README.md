
# Διαδικτυακες Υπηρεσιες Προστιθεμενης Αξιας
        Ηλεκτρονικο Εστιατοριο e-Restaurant
            Λουσι Αντζελο 144347

Στα πλαίσια του μαθήματος "Διαδικτυακές
Υπηρεσίες Προστιθέμενης Αξίας" για εργασία εξαμήνου, 
εφαρμόσαμε  ιδέες  προστιθέμενης αξίας στον
χώρο της εστίασης οι οποίες θα μπορούσε να είναι ένας
συνδυασμός με "αυτό κρατήσεις, instant πληρωμή μέσω
της εφαρμογής" και όλα αυτά από τον ίδιο τον χρήστη
καθώς και την  ίδια εφαρμογή θα μπορούσε είναι  για
τους εργαζόμενους επισης. Αυτήν την εφαρμογή αρχικά
προσπαθήσαμε να την υλοποιήσουμε μέσω του android
studio



## ENTITIES


Guests
| Parameter | Type     
| :-------- | :------
| `name` | `string` |  
| `reservetion number` | `int` |  
| `phone number` | `String` | 

Reservetions
| Parameter | Type     
| :-------- | :------
| `name` | `string` |  
| `reservetion number` | `int` |  
| `phone number` | `String` | 
| `Date` | `string` |  
| `table` | `String` |  
| `time` | `String` | 


Products (SUPER CLASS)
| Parameter | Type     
| :-------- | :------
| `name` | `string` |  
| `timi` | `double` |  

public class FoodsM extends  Products 
| Parameter | Type     
| :-------- | :------
| `name` | `string` |  
| `timi` | `double` |  


public class  DessertsM extends  Products 
| Parameter | Type     
| :-------- | :------
| `name` | `string` |  
| `timi` | `double` |  

public class DrinksM  extends  Products
| Parameter | Type     
| :-------- | :------
| `name` | `string` |  
| `timi` | `double` |  



