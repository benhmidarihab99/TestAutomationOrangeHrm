@recherche
Feature: Recherche

En tant qu'admin je souhaite effectue une recherche par role d'utilisateur

Background: 
Given je me connecte sur l'application
When je saisis le username "Admin"
And je saisis le password "Admin123++*/"
And je clique sur le bouton login
Then je me redirige vers la page d'acceuil et "Dashboard" s'affiche

@rechercheByUserRole
Scenario Outline: recherche par user role
When je click sur le bouton admin
And je saisis le role souaite "<role>"
And je click sur le bouton recherche
Then je verifie les role affiches sur le tableau "<role>"
When je clique sur le menu deroulant du profil
And je click sur le bouton logout
Then je dois être redirigé vers la page de connexion et "Login" doit s'afficher 

Examples:
|role|
|ESS|
|Admin|
