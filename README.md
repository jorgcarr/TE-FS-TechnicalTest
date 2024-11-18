Technical Test: Movie Management System
=======================================

**Run Instructions**: 
## Bakend
1. Add the followingg in `/etc/hosts`
```
127.0.0.1    backend-gateway-client
127.0.0.1    backend-keycloak-auth
127.0.0.1    backend-resources
```
2. Authorizer Server: 
  - `cd  backend-keycloak-auth`
  - `docker-componse up`
  - Unfortunatelly I was not able to export the connfiguration done locally, so you will have to create a real, client, scope and user.
3. Movies service: From intellij run usual spring boot `DemoApplication` class
4. Gateway: From intellij run usual spring boot `BackendGatewayClientApplication` class
5. Open `Movies Management.postman_collection.json` in postman
    * Go to Create movie request, select Authoization tab, scroll down and click on `Get New Access Token`
    * It will open keyclock login page in roder to log-in with user1 or admin1.
    * Same for all othe request loging-in according to the user and action.
## Front End
Unfortunatelly I had no time to implemented autontication, so in order to see the list of movies, these changes are needed in movies modulde `com.te.movies.demo.config.SecurityConfig.java`

replace this:
```
.authorizeHttpRequests(authorize -> authorize
                        .requestMatchers(HttpMethod.GET, "/actorsinmovies/**").access(hasAuthority("USER"))
                        .requestMatchers(HttpMethod.GET, "/movies/**").access(hasAuthority("USER"))
                        .requestMatchers(HttpMethod.POST, "/movies/**").access(hasAuthority("ADMIN"))
                        .requestMatchers(HttpMethod.GET, "/authors/**").access(hasAuthority("USER"))
                        .requestMatchers(HttpMethod.POST, "/authors/**").access(hasAuthority("ADMIN"))
                        .requestMatchers(HttpMethod.GET, "/genres/**").access(hasAuthority("USER"))
                        .requestMatchers(HttpMethod.POST, "/genres/**").access(hasAuthority("ADMIN"))
                        .requestMatchers(HttpMethod.GET, "/actors/**").access(hasAuthority("USER"))
                        .requestMatchers(HttpMethod.POST, "/actors/**").access(hasAuthority("ADMIN"))
```
with 
```
.authorizeHttpRequests(authorize -> authorize
                        .requestMatchers( "/**").permitAll()
```

- `cd vuetify-project`
- `yarn dev`