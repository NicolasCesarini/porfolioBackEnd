# Deploy a Render (Spring Boot + MySQL Clever Cloud) — Quick Fix

## Archivos en este paquete
- `Dockerfile` — usa el puerto dinámico `PORT` de Render.
- `src/main/resources/application.properties` — parametriza la conexión a MySQL con variables de entorno.
- `render.yaml` (opcional) — Infra-as-code para Render (no incluye secretos).

## Pasos
1. Copiá **todo** el contenido de este ZIP en la raíz de tu repo (sobrescribiendo archivos).
2. Hacé **commit & push** a `main`.
3. En Render → tu servicio → **Environment**, creá estas variables:

   ```
   MYSQL_ADDON_HOST=bbnmnzpp3gwjbranhxcv-mysql.services.clever-cloud.com
   MYSQL_ADDON_PORT=3306
   MYSQL_ADDON_DB=bbnmnzpp3gwjbranhxcv
   MYSQL_ADDON_USER=u7kvjbd1rmjdf3li
   MYSQL_ADDON_PASSWORD=<TU_PASSWORD_ACTUAL_O_REGENERADA>

   DB_POOL_MAX=2
   DB_POOL_MIN=1
   ```

4. Redeploy en Render.

### Notas
- Si cambió el nombre del JAR final, editá `ARG JAR_FILE` en el `Dockerfile`.
- Recomendado: una vez que levante, **regenerá** la contraseña en Clever Cloud y actualizá solo `MYSQL_ADDON_PASSWORD` en Render.
