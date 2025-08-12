# Portfolio Backend (Render + Clever Cloud)

Desplegable en Render. Variables de entorno necesarias (en **Render → Environment**):

- `DB_URL`  → `jdbc:mysql://<HOST>:<PORT>/<DB>?sslMode=REQUIRED&allowPublicKeyRetrieval=true&serverTimezone=UTC`
- `DB_USER` → usuario de MySQL (Clever Cloud)
- `DB_PASS` → password de MySQL (Clever Cloud)
- (opcional) `DB_POOL_MIN` → `1`
- (opcional) `DB_POOL_MAX` → `2`

> Ejemplo con Clever Cloud  
> HOST: `bbnmnzpp3gwjbranhxcv-mysql.services.clever-cloud.com`  
> PORT: `3306`  
> DB: `bbnmnzpp3gwjbranhxcv`  
>
> **DB_URL:**  
> `jdbc:mysql://bbnmnzpp3gwjbranhxcv-mysql.services.clever-cloud.com:3306/bbnmnzpp3gwjbranhxcv?sslMode=REQUIRED&allowPublicKeyRetrieval=true&serverTimezone=UTC`

## Build & Run (local)
```bash
# Java 17+
./mvnw clean package
java -jar target/portfolio-0.0.1-SNAPSHOT.jar
```

## Notas
- El `application.properties` ya lee `DB_URL`, `DB_USER`, `DB_PASS`.  
- No se sube `target/` para que Render construya el jar durante el deploy.
