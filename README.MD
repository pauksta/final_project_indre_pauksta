# Final project 

#### Link to the page: "https://www.varle.lt/"

### Dependencies:
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`

## Test scenarios

`Registration`

*Test: Account registration with valid email*

1. click *"Registracija"* 
2. click  *"Registruotis"* 
3. input valid email 
4. input password 
5. repeat new password 
6. click on checkbox *"Susipazinau su naudojimo ir privatumo taisyklemis"* 
7. click  *"Registruotis" button*

 Expected result: In main page, account title should be *"Sveiki"*

*Test: Delete valid account*

1. click *"Prisijungimas"*
2. input valid email
3. input valid password
4. click *"Prisijungti*" button
5. click  *"Mano duomenys"*
6. click *"Naikinti paskyrą"*
7. click *"Taip"*

Expected result: Account should be deleted.

`Login`

* Test: Login to account with non exist account info*

1. click on *"Registracija"* 
2. input not valid email
3. input not valid password 
4. click *"Prisijungti"* button

Expected result: Should be given a message for unsuccessful login 
*"Pateiktas el. pašto adresas ir/arba slaptažodis yra neteisingi"*

`Shopping cart`

*Test: Add item Dulkių siurblys Dyson V11 to Shopping Cart*

1. input item title in *"Paieška"* (Dulkių siurblys Dyson V11)
2. select item (Dulkių siurblys Dyson V11)
3. click *"į krepšelį"* button
4. click *"Prekintis toliau"* button
5. click *"Prekių krepšelis"*

Expected result: Item Dulkių siurblys Dyson V11 should be added to shopping cart

*Test: Delete two items Kavos aparatas DeLonghi ECAM22 from shopping cart*

1. input item title in *"Paieška"* (Kavos aparatas DeLonghi ECAM22.110.SB)
2. select item (Kavos aparatas DeLonghi ECAM22.110.SB)
3. click *"+"* to increase quantity of item 
4. click *"į krepšelį"* button
5. click *"Prekintis toliau"* button
6. click *"Prekių krepšelis"*
7. click *"X"* to remove two items from shopping cart

Expected result: Shopping cart should be empty *"Krepšelis Tuščias"*

`Wishlist`

*Test: add item Syoss Šampūnas Oleo Intense to wishlist*

1. (before doing these steps need to log in)
2. input item title in *"Paieška"* (Syoss Šampūnas Oleo Intense)
3. select item (Syoss Šampūnas Oleo Intense)
4. click *"♡"* to put item to wishlist
5. return the main page
6. click *"Patikusios prekės"*

Expected result: Item Syoss šampūnas Oleo Intense should be in wishlist.

*Test: remove Syoss Šampūnas Oleo Intense from wishlist*

1. (before doing these steps need to log in)
2. click *"Pašalinti*"

Expected result: Wishlist should be empty.








