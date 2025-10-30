@recherche
Feature: Recherche

En tant qu'admin je souhaite effectue une recherche par nom d'employe

Background: 
Given je me connecte sur l'application
When je saisis le username "Admin"
And je saisis le password "Admin123++*/"
And je clique sur le bouton login
Then je me redirige vers la page d'acceuil et "Dashboard" s'affiche

@rechercheByEmployeName
Scenario: recherche par employe name
When je click sur le bouton admin
And je saisis le l'employe name souaite "<EmployeName>"
And je click sur le bouton recherche
Then je verifie le employe name affiche sur le tableau "<resultatAttendu>"

Examples:
|EmployeName|resultatAttendu|
|benhmidar benhmidar|benhmidar benhmidar|
|rihab|Invalid|
