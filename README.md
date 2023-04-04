# console-app-eonix


Je suis conscient que l'utilisation d'interfaces est une technique courante pour affaiblir le couplage entre les classes dans un projet Java.

Dans notre cas, je peux créer une interface "Tour" qui serait implémentée par deux classes "TourAcrobatie" et "TourMusique" pour représenter les deux types de tours
Cette interface Tour pourrait contenir une méthode executer qui serait implémentée différemment dans les deux classes concrètes pour exécuter le tour correspondant.

=> Je n'ai pas opté pour cette approch d'un coté parce que parmis les contraintes , vous précisez qu'il y a juste les classes Singe , Dresseur & Spectateur 
de l'autre coté et dans ce cas précis et étant donné que le nombre de méthodes à implémenter est relativement faible, l'ajout d'une interface n'est pas strictement nécessaire
 en plus ma moduarité du code est correcte , ça n'a pas posé un problem pour les tests.

Je peux penser aux interfaces dans le cas où un besoin additionel va etre communiqué , vu que l'utilisation d'une interface peut rendre le code beaucoup plus modulaire et faciliter sa maintenance à long terme,
en permettant par exemple d'ajouter facilement de nouveaux types de tours 
