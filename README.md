# EsercizioContoBancario

In questo progetto su netbeans, abbiamo la possibilità di creare un nostro conto bancario.
Abbiamo un proprio conto che possiamo modificare, depositando soldi in esso o prelevando,
possiamo prelevare da un conto avendo un proprio fido.


Abbiamo usato i seguenti meccanismi e riferimenti:


Ereditarietà: è una proprietà dove delle classi chiamate sottoclassi, ereditano da una 
superclasse, tutti i metodi che si sono creati, e li si possono utilizzare nella
sottoclasse.

In più la classe derivata può aggiungere delle funzionalità proprie. 
L'override si mette sopra un metodo che è stato sovrascritto in un'altra classe a cui
sono stati ereditati i metodi.

L'overload è il sovraccarico di metodi che permette di modificarli con diverse varianti
secondo i parametri passati come riferimento. 

All'inizio di una classe si dichiarano le variabili d'oggetto che occupano uno spazio 
nella memoria, e fino a che non si crea un oggetto quella variabile non esiste. 

Le variabili static invece sono comuni a tutti gli oggetti di quella classe.


Nel costruttore le variabili locali ogni volta che finisce il metodo vengono rilasciate
e quindi occupano uno spazio nella memoria temporanea.


Polimorfismo: Un concetto che deriva dall'ereditarietà, dove i metodi della superclasse 
vengono modificati e ridefiniti secondo le esigenze della sottoclasse. 


Il this in Java viene utilizzato per fare riferimento, ad una variabile dell'oggetto
corrente con il costruttore o un metodo.

In caso di estensione di una classe, nel costruttore
della sottoclasse si può richiamare il costruttore della super-classe e si mette di default 
super(parametri), ma si potrebbe mettere this.variabileoggetto = variabilelocale, ma in caso 
la variabile di oggetto estesa è private non si può scrivere this.variabileoggetto = variabilelocale.


Alfieri Fabio 4C
