@recherche
Feature: Recherche

En tant qu'admin je souhaite effectue une recherche d'un utilisateur

Background: 
Given je me connecte sur l'application
When je saisis le username "Admin"
And je saisis le password "Admin123++*/"
And je clique sur le bouton login
Then je me redirige vers la page d'acceuil et "Dashboard" s'affiche

@rechercheAll
Scenario Outline: recherche par tous les filtres
When je click sur le bouton admin
And je saisis le username souaite "<username>"
And je saisis le role souaite "<role>"
And je saisis le l'employe name souaite "<EmployeName>"
And je saisis le status souhaite "<status>"
And je click sur le bouton recherche
Then je verifie les usernames affiches sur le tableau "<username>"
And je verifie les role affiches sur le tableau "<role>"
And je verifie le employe name affiche sur le tableau "<EmployeName>"
And je verifie le status affiche sur le tableau "<status>"


Examples:
|username|role|EmployeName|status|
|Admin|Admin|benhmidar benhmidar|Enabled|
|safouankraiem|Admin|benhmidar benhmidar|Disabled|
|testing|ESS|benhmidar benhmidar|Enabled|