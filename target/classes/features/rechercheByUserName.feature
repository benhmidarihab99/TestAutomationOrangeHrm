@recherche
Feature: Recherche

En tant qu'admin je souhaite effectue une recherche par utilisateur

Background: 
Given je me connecte sur l'application
When je saisis le username "Admin"
And je saisis le password "Admin123++*/"
And je clique sur le bouton login
Then je me redirige vers la page d'acceuil et "Dashboard" s'affiche

@rechercheByUsername
Scenario Outline: recherche par username
When je click sur le bouton admin
And je saisis le username souaite "<username>"
And je click sur le bouton recherche
Then je verifie les usernames affiches sur le tableau "<username>"

Examples:
|username|
|Admin|



