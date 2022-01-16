
# JokesService
Web-service which gets you an opportunity to use 3 different jokes-web-services APIs. 
##API Usage examples:
Here we have 3 endpont:
<host>:8080/sp/get - get random setup-punchline joke
<host>:8080/fs/get - get random father-style joke
<host>8080/geek/get - get random geek joke (80% about Chuck Norris idk why :) )
##Dockerisation
```docker build -t JokesService .``` - to build app in container

```docker run JokesService:latest ``` - to run container 
By default 8080 port is exposed for container 


## CI
<table>
  <tr><td>master</td><td>develop</td></tr>
  <tr>
    <td><a href="https://github.com/NastyPill/JokesService/actions/workflows/ci.yaml?query=branch%3Amaster">
      <img src="https://github.com/NastyPill/JokesService/actions/workflows/ci.yaml/badge.svg?branch=master" alt="test for master"></a></td>
    <td><a href="https://github.com/NastyPill/JokesService/actions/workflows/ci.yaml?query=branch%3Adevelop">
      <img src="https://github.com/NastyPill/JokesService/actions/workflows/ci.yamlbadge.svg?branch=develop" alt="test for dev"></a></td>
  </tr>