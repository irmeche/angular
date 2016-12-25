- see: https://openclassrooms.com/courses/gerez-vos-codes-source-avec-git

- parametrer les couleur de git
#git config --global color.diff auto
#git config --global color.status auto
#git config --global color.branch auto

- parametrer le nom et email
#git config --global user.name "belaid"
"git config --global user.email irmeche@gmail.com

- create un fichier
#echo "# jsf" >> README.md

- initialiser le repo git
#git init

- voir l'état des modifications 
#git status

- voir les changements
#git diff

- pour ajouter les fichiers à la liste de ceux devant faire l’objet d’un commit
#git add README.md nomfichier2

- faire un commit
#git commit

- faire un commit avec un commentaire
#git commit -m "first commit"

- pour « commiter » tous les fichiers qui étaient listés dans git status
#git commit -a

- pour indiquer lors du commit quels fichiers précis doivent être « commités »
#git commit nomfichier1 nomfichier2

- créer un serveur de repository , À exécuter sur le serveur.
#git init --bare 

- push an existing repository from the command line
#git remote add origin https://github.com/irmeche/jsf.git
#git push -u origin master
