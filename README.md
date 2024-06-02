# Robots-Lunaires


Inspiré par des problèmes posés lors d'entretien d'embauche

# Enoncé

Une escouade de robots rovers doit être débarquée par la NASA sur un plateau de la lune 🌘.

Ce plateau, curieusement rectangulaire, doit être parcouru par les robots afin que leurs caméras embarquées puissent avoir une vue complète du terrain environnant à renvoyer sur Terre. 🌍

La position et l'emplacement d'un robot sont représentés par une combinaison de x et y, ses coordonnées et une lettre représentant l'un des quatre points cardinaux (N, W, E, S). Le plateau est divisé en une grille pour simplifier la navigation.

Afin de contrôler un robot, la NASA envoie une simple suite de lettres.

Les lettres possibles sont L, R et M. L et R font tourner le robot de 90 degrés gauche ou droit respectivement, sans bouger de son emplacement actuel. M signifie avancer d'un point de grille et maintenir le même cap. Supposons que le carré directement au nord de (x, y) est (x, y + 1).

# Format des données
Entrée

# Ligne 1 : 

Les coordonnées en haut à droite du plateau, les coordonnées en bas à gauche sont supposées être 0, 0.

Lignes 2 à 2xN+1 : Deux lignes par robots, la première ligne donne position de départ du robot, la seconde ligne donne une série d'instructions. La position est composée de deux entiers et d'une lettre séparés par des espaces, correspondant aux coordonnées x et y et à l'orientation du robot.

# Sortie

Pour chaque robot, ses coordonnées finales et son orientation. Chaque robot exécute ses instructions séquentiellement, ce qui signifie que le deuxième robot ne commencera à bouger que lorsque le premier aura fini de bouger.
