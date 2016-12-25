-- see: https://openclassrooms.com/courses/gerez-vos-codes-source-avec-git

- parametrer les couleur de git
git config --global color.diff auto
git config --global color.status auto
git config --global color.branch auto

- parametrer le nom et email
git config --global user.name "belaid"
git config --global user.email irmeche@gmail.com

- create a new repository on the command line
echo "# jsf" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/irmeche/jsf.git
git push -u origin master

- push an existing repository from the command line
git remote add origin https://github.com/irmeche/jsf.git
git push -u origin master

- initialiser le repo git
git init
	
- créer un repos comme serveur, À exécuter sur le serveur.
git init --bare 

- voir l'état des modifications 
git status

- voir les changements
git diff

- pour ajouter les fichiers à la liste de ceux devant faire l’objet d’un commit
git add nomfichier1 nomfichier2

- puis faire le commit
git commit

- pour « commiter » tous les fichiers qui étaient listés dans git status
git commit -a

- pour indiquer lors du commit quels fichiers précis doivent être « commités »
git commit nomfichier1 nomfichier2
