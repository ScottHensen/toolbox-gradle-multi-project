# Template Multi-Project Gradle Build
For a step-by-step on the construction of this template, see the Gradle 
Multi-Project Builds post at https://scotthensen.github.io  


### Project Structure:
- **killer-app**  
   builds the whole project   

   - **killer-app-common**  
      builds jar containing common domain models and business rules  

   - **killer-app-svc**  
      builds jar containing back-end for the app  

   - **killer-app-web**  
      builds bootJar containing front-end for the app  

### How to build:
- Build the whole project:  
   ```   
   /killer-app> gradlew build          
   ```   
- Build just one of the sub-projects:  
   ```   
   /killer-app> gradlew :killer-app-svc:build  
   ```   
   -or-  
   ```
   /killer-app/killer-app-svc> gradlew build  
   ```  