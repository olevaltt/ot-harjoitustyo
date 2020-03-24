# Vaatimusmäärittely

### Sovelluksen tarkoitus

Sovelluksen tarkoitus on antaa käyttäjälle matematiikan tehtäviä ratkottavaksi, ja tämän jälkeen antaa käyttäjälle ratkaisuehdotus.

### Käyttäjät

Sovlluksella on yksi käyttäjärooli, *normaali käyttäjä*.

### Perusversion tarjoama toiminnallisuus

#### Ennen kirjautumista

-käyttäjä voi luoda uuden käyttäjätunnuksen
	-tunnuksen täytyy olla uniikki
-käyttäjä voi kirjautua ohjelmaan
	-jotta kirjautuminen onnistuu, on käyttäjätunnuksen oltava olemassa ja oikein syötetty

#### Kirjautumisen jälkeen

-käyttäjä voi lisätä tehtäväiä
	-myös vastaus tulee lisätä
-käyttäjä voi kysyä ohjelmalta tehtävää ratkaistavaksi
	-voi kysyä tiettyä tehtävää
	-voi kysyä satunnaisesti valittua tehtävää
	-kun käyttäjä syöttää vastauksen, ohjelma esittää ratkaisuehdotuksen
-käyttäjä voi kirjautua ulos ohjelmasta

### Jatkokehitysideoita

-tehtävät voidaan määritellä tehtävätyypin perusteella
	-esimerkiksi sanalliset/ei sanalliset tehtävät
-tehtävien voidaan kysyä satunnaisesti tehtävätyypin perusteella
-käyttäjätunnukseen liitetään salasana
