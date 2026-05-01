# Primed Job Portal Deployment

## Railway

Use Railway for this project because it can host the Spring Boot app and a MySQL service in one project.

### 1. Push Code To GitHub

Create a GitHub repository, then push this project.

### 2. Create MySQL On Railway

1. Open Railway.
2. Create a new project.
3. Add a MySQL database service.

Railway provides these variables from the MySQL service:

- `MYSQLHOST`
- `MYSQLPORT`
- `MYSQLUSER`
- `MYSQLPASSWORD`
- `MYSQLDATABASE`

### 3. Deploy The App Service

1. In the same Railway project, add a new service from your GitHub repository.
2. Set the root directory to this project folder if Railway asks.
3. Use these commands:

Build command:

```bash
./mvnw -DskipTests package
```

Start command:

```bash
java -jar target/jobportal-0.0.1-SNAPSHOT.jar
```

### 4. Add App Environment Variables

In the Spring Boot app service, add references or variables from the MySQL service:

```text
MYSQLHOST
MYSQLPORT
MYSQLUSER
MYSQLPASSWORD
MYSQLDATABASE
```

Railway sets `PORT` for the web service automatically.

### 5. Open The Public URL

After deployment finishes, open the generated Railway domain.

Register as a Recruiter, post a job, then search from the home page.
