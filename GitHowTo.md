# Git segédlet

Ez egy kis segítség / összefoglaló azoknak, akik nem tudják fejből a Git parancsokat. Az elejére felírom a parancsokat minimális magyarázattal, a végére pedig hosszabb magyarázatot írok.

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
