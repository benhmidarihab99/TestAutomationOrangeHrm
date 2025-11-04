@connexion
Feature: Authentification

en tant qu'un administrateur je veux m'authentifier sur l'application Orange Hrm

@connexionValide
Scenario: authentification avec des identifiants valides

Given je me connecte sur l'application
When je saisis le username "Admin"
And je saisis le password "Admin123++*/"
And je clique sur le bouton login
Then je me redirige vers la page d'acceuil et "Dashboard" s'affiche
When je clique sur le menu deroulant du profil
And je click sur le bouton logout
Then je dois être redirigé vers la page de connexion et "Login" doit s'afficher 


@connexionInvalide
Scenario Outline: Authentification avec des identifiants non valides
Given je me connecte sur l'application
When je saisis le username "<name>"
And je saisis le password "<pass>"
And je clique sur le bouton login
Then je verifie le message d'erreur affiche "<messageErreur>"

Examples:
|name|pass|messageErreur|
|Rihab|Admin123++*/|Invalid credentials|
|Admin|admin12|Invalid credentials|
|Admin||Required|
||Admin123++*/|Required|
|admin|Admin1|Invalid credentials|
|||Required|

