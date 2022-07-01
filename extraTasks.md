# Titkos kód játék.
  - **Alapszint**: terminál (könnyű).
  - **Komolyabb**: GUI (közepes, sok időt el lehet tölteni vele).
  
  Leírás:
  
  A Titkos kód játék lényege, hogy az egyik játékos kitalál egy kódot (itt ez a gép lesz, és véletlenszerűen generálja),
  a másik játékos pedig tippelgetve kitalálja. A kód alapból színekből áll (piros, kék, narancs...), és 8 darab szín van.
  A kódot úgy építjük fel, hogy 4 színt kiválasztunk, és adott pozíciókba helyezzük őket. Lehet ismétlődés és a sorrend
  is számít. Mikor a játékos tippel, akkor ő is 4 színt ad meg (ismétlődéssel, pozíció számít).
  A kódot ismerő játékos ekkor visszajelzést ad:
  - minden olyan színért, ami talált, de helytelen pozícióban van, ad egy sárga jelzőt
  - minden olyan színért, amit talált és jó helyen is van, ad egy piros jelzőt.
  Megjegyzés: a sárga és piros jelzők sorrendje és pozíciója nem bír jelentéssel.
  A tippelgető játékosnak természetesen az a célja, hogy 4 piros jelzőt kicsikarjon kódot ismerő játékostól. Erre
  mindössze 10 lehetőséget kap (ennyiszer tippelhet). Ha ennyiből kitalálja a kódot (helyes pozíciókkal), akkor 
  győzött. Egyébként a kódot ismerő játékos nyer.
Terminálos megoldás:
  A színeket jelölje 1-1 integer (0, 1, 2, ... , 7). A gép generál egy random kódot. A játékos a tippjét a következő 
  formában adja meg: "a b c d", ahol a, b, c, d számok 0-tól 7-ig. A gép minden eltalált szín után, ami jó helyen is
  van, ad egy X-et, minden rossz helyen lévő, de eltalált szín után ad egy |-at. Ha a játékos  4 db X-et kapna vissza,
  akkor kiírja az X-eket és hogy győzött. Ha 10 alkalomból sikertelen a játék, akkor kiírja a kódot, és hogy veszített
  a játékos.
    Megjegyzés: A tipp egy adott száma (színe) után egyetlen visszajelzés jár. Tehát például ha a kód:
    
    0 1 2 2
    
    A tipp pedig:
    
    0 2 6 7
    
    Akkor a visszajelzés: X |
    
    Néhány egy példa:
    
    Kód: 0 1 2 2; Tipp: 1 2 3 4; Visszajelzés: | |
    
    Kód: 0 1 2 2; Tipp: 1 2 2 4; Visszajelzés: X | |
    
    Kód: 0 1 2 2; Tipp: 2 2 0 2; Visszajelzés: X | | --> Az egyik 
    kettes után nem jár visszajelzés, mert a másik után már adtunk.
    
    Kód: 0 1 2 2; Tipp: 2 2 0 1; Visszajelzés: | | | | --> Még nincs kitalálva, mert a sorrendnek is stimmelnie kell.
    
    Kód: 7 0 7 7; Tipp: 7 7 7 7; Visszajelzés: X X X
  GUI-s megoldás:
    Megbeszélés és tervezés kérdése.

2. Amőba.
  - **Alapszint**: Player vs Player (közepes)
  - **Komolyabb**: Player vs Computer (nehéz)
  
  Leírás:

  Jelenjen meg egy form, ami a játék adatait bekéri! Az adatok a következők:

  - 1 játékos vagy 2.
  - Pálya mérete (például 30x30-as pálya, ami lehet default is)
  - Mennyi alakzatot (kört, X-et) kell kirakni a győzelemhez (5-tel amőba, 3-mal Tic-Tak-Toe 3x3-as pályán)

  Miután a játékos leokézta a beállításokat, készítsük el a játékteret (egy négyzetrácsot). A négyzetek lehetnek 
  kis képek, gombok (valamilyen GUI elemek). Két játékos esetén felváltva kattintunk. Ahova kattintottunk, ott jelenjen
  meg a megfelelő alakzat (X vagy O). Ha valamilyen irányban kiraktuk az 5 vagy 3 alakzatot, akkor a játék álljon le, és 
  írja ki, hogy ki nyert.

  1 játékos esetén bonyolultabb: a gép játsszon a játékos ellen! Ezt többféle megközelítésben is meg lehet csinálni.
  Aki szeretne mesterséges ellenfelet írni, annak javasolt (egész hosszú) időtöltés. Pár irány, amibe el lehet indulni:

  1. lehetőség: A gép előregondolkodik, és megnézi milyen döntéssorok után milyen helyzetek jönnek ki.
                  Itt vegyük figyelembe, hogy nagyon sok lehetőség van, és nagyon messzire nem lehet előregondolkodni.
                  (Nem bírja a gép). Ezért ez önmagában nem feltétlen javasolt.
  2. lehetőség: Az alakzatok elhelyezkedése alapján prioritás rendelése a mezőkhöz. Például ha sok X van egy sorban
                  vagy oszlopban vagy átlóban, akkor ott a körrel lévő játékos számára növekszik a prioritás. A 
                  gép a legnagyobb prioritásra teszi a jelét. A prioritást egyéb dolgok szerint is növelhetjük
                  (például ha egyik irányban már amúgy sem lenne hely kirakni egy teljes sort, akkor lehet kisebb a 
                  prioritás).
                  Ezzel a módszerrel meg lehet írni egy viszonylag értelmes amőba ellenfelet!!! (Bash-ben megvan a 
                  kódja is)
  3. lehetőség: Kombináljuk a kettőt. Például nem nézünk végig minden lehetőséget, mert a prioritások alapján tudjuk,
                  hogy néhány eleve nem lehet jó. Így igazán erős ellenfelet lehet írni. (Szép kis munka is megcsinálni.)
