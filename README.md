# README

## 1. Datasäkerhet/Inkapsling

Jag har skyddat kontots uppgifter genom att använda `private` på `name` och `balance` i `Account`-klassen. Det betyder att andra klasser inte kan ändra uppgifterna direkt, utan måste använda metoder som till exempel `deposit()` och `withdraw()`. Om jag inte hade gjort detta hade andra delar av programmet kunnat ändra saldot direkt och till exempel göra saldot negativt.

## 2. Skapande-mönster (Factory)

Kontot skapas genom `AccountRegister` istället för direkt i `Main` eftersom `AccountRegister` ansvarar för att hantera alla konton. Metoden `createAccount()` skapar kontot och lägger sedan till det i listan med konton. På det sättet behöver inte `Main` själv hålla reda på hur konton skapas och sparas.

## 3. Flöde

Om användaren väljer "Sätt in pengar" skriver användaren först in namnet på kontot och sedan hur mycket pengar som ska sättas in. `Main` använder `findAccount()` i `AccountRegister` för att hitta rätt konto och sedan körs `deposit()` i `Account`-klassen. Till sist skrivs det nya saldot ut i konsolen.

## 4. Reflektion

När jag körde fast försökte jag först förstå vad problemet var genom att läsa koden och testa programmet. Jag använde AI för att få hjälp att förstå hur jag kunde lösa vissa delar, men jag gick igenom koden steg för steg för att förstå varför lösningen fungerade.