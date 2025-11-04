@add
Feature: ajout d'utilisateur

En tant qu'admin je vais ajouter un nouveau utilisateur 

Background: 
Given je me connecte sur l'application
When je saisis le username "Admin"
And je saisis le password "Admin123++*/"
And je clique sur le bouton login
Then je me redirige vers la page d'acceuil et "Dashboard" s'affiche

@addUser
Scenario Outline: ajout d'un utilisateur
When je click sur le bouton admin
And je click sur le bouton add
And je selectionne un role 
And je saisis l'employe name existant "<employeName>"
And je selectionne un status
And je saisis le nouveau username "<user>"
And je saisis le nouveau password "<pass>"
And je confirme le password "<pass>"
And je click sur le bouton save
Then je saisis le username souaite "<user>"
And je click sur le bouton recherche
And je verifie les usernames affiches sur le tableau "<user>"
When je clique sur le menu deroulant du profil
And je click sur le bouton logout
Then je dois être redirigé vers la page de connexion et "Login" doit s'afficher 

Examples:
|employeName|user|pass|
|benhmidar benhmidar|rihabbn|123Rihab/|