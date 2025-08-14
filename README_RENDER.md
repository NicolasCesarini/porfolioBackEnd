# Deploy to Render (Docker)

This repo now includes a multi‑stage Dockerfile that **builds and runs** the Spring Boot app on Java 17 without needing the prebuilt `target/` folder.

## 1) Render service
- **Blueprint:** Web Service
- **Runtime:** Docker
- **Region:** Closer to your DB
- **Branch:** `main`

## 2) Environment variables (recommended names)
Set these in the Render service:

```
DB_URL=jdbc:mysql://<HOST>:3306/<DB>?sslMode=REQUIRED&allowPublicKeyRetrieval=true&serverTimezone=UTC
DB_USER=<your_user>
DB_PASS=<your_pass>

# Optional tuning
DB_POOL_MIN=1
DB_POOL_MAX=2
JAVA_OPTS=-Xms128m -Xmx256m
```

> If you already have Clever Cloud MySQL variables (`MYSQL_ADDON_URI`, `MYSQL_ADDON_USER`, `MYSQL_ADDON_PASSWORD`), you can keep them. The app will read **DB_*** first and fall back to **MYSQL_ADDON_***.

## 3) Notes
- Uses `org.hibernate.dialect.MySQLDialect` (no deprecation warnings).
- `server.port` is wired to `$PORT` so it works on Render.
- Hikari pool kept tiny for free tiers.

## 4) Health check
Once deployed:
- Open: `https://<your-service>.onrender.com/actuator/health` (if you enable Spring Actuator)  
or just hit any existing controller endpoint.
