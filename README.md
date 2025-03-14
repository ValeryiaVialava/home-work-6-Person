#### **TASK**

- Stwórz klasę Person wraz
	- polem `name`
	- polem `surname`
	- polem `birthDate`
	- polem `timeOfBirth` – godzina urodzeń
	- metodą `getGender` – sprawdza płeć po imieniu, jeśli kończy się na a, to jest to kobieta
	- metodą `getAge` – podającą wiek w latach
	- metodą `getDayOfBirth` – podającą dzień tygodnia w którym urodziła się dana osoba (w języku, który używa użytkownik)
	- metodą `reverseNameAndSurname` – wypisuje ona imię i nazwisko użytkownika od końca. Nowe odwrócone imię i nazwisko powinno zaczynać się wielką literą:
	`Aleksandra Zakrzewska -> Ardnaskela Akswezrkaz`
	- metodą podającą jaka była data z godziną w momencie urodzenia użytkownika w Los Angeles (zakładamy, że użytkownik urodził się w Polsce).

- Dodatkowe uwagi:
	- pola mają być prywatne i powinny być dla nich dopisane gettery i setery
  - w drugiej klasie (w której będzie metoda `main`), sprawdzana powinna być poprawność wprowadzonych danych tzn.

- Imię i nazwisko składają się tylko z liter i pierwsza litera powinna być wielka

- Dane dotyczące daty urodzenia powinny być poprawne, czyli użytkownik musi podać liczby (a nie litery) z odpowiedniego przedziału.

---

```
Gender: Female
Age: 18
Day of Birth: Thursday
Reversed Name and Surname: Aiyrelav Avalaiv
Birth Date and Time in Los Angeles: 30/03/2006 01:23 AM PST
```

```
Enter your name: 
valeryia
Enter your surname: 
vialava
Enter your birth date (dd/MM/yyyy): 
30/03//2006
Invalid date or time format! Please try again.
Do you want to try again? (yes/no)
```

```
Enter your name: 
Valeryia
Enter your surname: 
Vialava
Enter your birth date (dd/MM/yyyy): 
32/03/2009
Invalid date or time format! Please try again. // DateTimeParseException
Do you want to try again? (yes/no)
```

```
Enter your name: 
Valeryia
Enter your surname: 
Vialava
Enter your birth date (dd/MM/yyyy): 
30/03/2025
Enter your time of birth (HH:mm): 
12:20
Invalid input data! // if else (isValidDate())
Do you want to try again? (yes/no)
```

```
Do you want to try again? (yes/no)
yes please

Process finished with exit code 0
```
