Inleiding
In de les hebben we het gehad over Maven en unitTesten.

Iedere applicatie die we maken, willen we opleveren inclusief testen. Dit is belangrijk, omdat dit een groot aantal bugs uit de applicatie kan halen, voordat de applicatie in productie gaat.

Opdrachtbeschrijving
We gaan een applicatie maken om een familie stamboom te maken. Iedereen heeft familieleden: van sommige houden we heel veel en van sommige misschien wat minder. Maar hoe dan ook hebben we allemaal familie. Voor deze applicatie hoeven we niet allerlei moeilijke opties toe te voegen. In de applicatie die we gaan maken, is het mogelijk om nieuwe personen en huisdieren toe te voegen aan de familie stamboom. Wanneer we bijvoorbeeld kinderen toevoegen aan een persoon in de stamboom, is het natuurlijk wel zo netjes om deze persoon gelijk neer te zetten als vader of moeder. Naast deze methode gebruiken we nog meer familie gerelateerde methodes binnen deze applicatie.

Family!

Randvoorwaarden
De opdracht moet voldoen aan de volgende voorwaarden:

minimaal 1 Person
minimaal 1 Pet
alle methodes (behalve de getters en setters) worden getest door een unittest
De Person heeft volgende attributen:

name
middleName
lastName
sex
age
mother (Person)
father (Person)
siblings (lijst)
children (lijst)
pets (lijst)
De Pet heeft minimaal de volgende attributen:

name
age
species
owner (Person)
De Person bevat naast de attributen het volgende:

constructor met name, lastname, age en sex
constructor met name, middleName, lastname, age en sex
getters & setters
addParents methode
addChild methode
addPet methode
addSibling methode
getGrandChildren methode
De Pet bevat naast de attributen minimaal:

een constructor met alle attributen op 'owner' na
getters & setters
Stappenplan
Let op: het is uitdagender om jouw eigen stappenplan te maken. Als je niet zo goed weet waar je moet beginnen, kun je onderstaand stappenplan gebruiken.

Maak de benodigde klassen aan.

Geef de klassen de juiste attributen.

Maak de constructors aan binnen de klassen.

Maak alle getters & setters.

Schrijf de benodigde methodes in de juiste klassen.

Tip voor addParents: Parents zijn twee Persons

Tip voor addChild, addPet en addSibling: Voeg toe aan de lijst.

Tip voor getGrandChildren: Dit is een uitdagende methode. Grandchildren zijn de children van de children van een persoon. Gebruik loops.

Voeg Maven toe aan het project.

Schrijf unittesten voor alle getters en setters van zowel Pet als Person.

Schrijf unittesten voor de extra methodes van Person (addPArents, addChild, addPet, addSibling, getGrandChildren)

Bonusopdrachten
Als je de bonusopdrachten maakt, zorg dan dat deze ook getest worden!

Schrijf een methode om alle dieren van de kleinkinderen terug te geven van een persoon.
Schrijf een methode om alle nichtjes terug te geven van een persoon.
Voeg een partner toe aan de Person en implementeer deze partner door de gehele applicatie inclusief getter & setter en benodigde methodes.
Kun je nog meer toevoegingen bedenken om de 'stamboom applicatie' compleet te maken?