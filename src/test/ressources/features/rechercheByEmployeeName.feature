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
When je clique sur le menu deroulant du profil
And je click sur le bouton logout
Then je dois être redirigé vers la page de connexion et "Login" doit s'afficher 


Examples:
|EmployeName|resultatAttendu|
|benhmidar benhmidar|benhmidar benhmidar|
|rihab|Invalid|
