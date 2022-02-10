# Git segédlet

Ez egy kis segítség / összefoglaló azoknak, akik nem tudják fejből a Git parancsokat. Az elejére felírom a parancsokat minimális magyarázattal, a végére pedig általánosabb információkat írok.

Ez a leírás egy kis összefoglaló! Aki többet szeretne, annak figyelmébe ajánlom [ennek a jól felépített könyvnek](https://git-scm.com/book/en/v2) az első 3 fejezetét!

## Alap parancsok

Leklónozni a weben megtalálható repository-t:

```
git clone https://github.com/gites-felhasznalonev/repository-nev.git
``` 

Megnézni, hogy mi lesz kommitolva a következő paranccsal:

```
git status
``` 

Egy fájl hozzáadása a staging area-hoz. (az ide helyezett fájlok lesznek kommitolva a következő commit paranccsal)
Itt használhatunk reguláris kifejezéseket és több fájlt is felsorolhatunk.

```
git add path/to/file/in/repository # Egy fájlt hozzáadunk
git add file1 file2 dir/file3      # Több fájlt hozzáadunk felsorolással
git add dirname/*                  # Minden fájlt hozzáadunk a dirname nevű mappában
```

Kommitolás:

```
git commit
```

Ha nem akarjuk, hogy egy szövegszerkesztő megnyíljon, akkor:

```
git commit -m "Commit message."
```

Ha a kommitunkat fel akarjuk küldeni a repository-ba, akkor (ha csak egy online tárolóhelye van a reponak; többnyire így lesz):

```
git push
```

Ha egy meglévő offline repo-ba le akarjuk szedni a frissítéseket, amiket máshonnan töltöttünk fel az online repo-ba, akkor:

```
git pull
```

## Magyarázatok

(Rövidek; aki hosszút akar, olvassa a könyvet.)

A git egy elosztott verziókövető eszköz.

**Hogyan követ verziót?**

- Amit commitolsz, az egy elmentett verzió lesz.
- Egy commitra később vissza lehet térni.
- A commitok az alapegységek.

**Miért jó ez?**

- Ha valamit egyszer commitolsz, akkor az úgymond biztonságban van.
- Egy commit után nyugodtan módosítgathatsz, mert később bármikor visszamehetsz az előző jó verzióra.

**Mi az, hogy elosztott?**

- A repository több helyen lehet: van lokális és szerveren lévő repo is.
- A kettő egymástól függetlenül is **tartalmaz mindent**.
- Nincs automatikus szinkronizáció a szerver (esetünkben Github) és a lokális repo (amin dolgozol a gépen) között.

**Miért jó ez?**

- Mert minden lokális repo egy biztonsági mentés is; minden megvan benne, ami kell.
- Mert a lokális repohoz nem kell a szervernek is működnie, hogy tudjon funkcionálni.

### Néhány következménye a fönt leírtaknak

- Mivel a git a commitokat fogja eltárolni, ha egy verziót el akarunk menteni, akkor commitolnunk kell.
- A kódunkat commitokban tudjuk feltölteni a repoba.
- Mivel elosztott, manuálisan kell feltöltenünk és letöltenünk a verziónkat.
