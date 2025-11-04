@deconnexion
Feature: deconnecter

En tant qu'utilisateur authentifié Je veux me déconnecter

Background: 
Given je me connecte sur l'application
When je saisis le username "Admin"
And je saisis le password "Admin123++*/"
And je clique sur le bouton login
Then je me redirige vers la page d'acceuil et "Dashboard" s'affiche

@logout
Scenario: Successful logout
When je clique sur le menu deroulant du profil
And je click sur le bouton logout
Then je dois être redirigé vers la page de connexion et "Login" doit s'afficher 
