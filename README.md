# drstrangeproject
Using this project to demo writing a Java application to connect to a mysql database
1. Simple database was created with four relational tables for demo purposes. 
2. Database represents a small database being used by a fictional network of hospitals 
3. Database simulates a fictional system as follows:
        a. A hospital (represented by a table) has one or many doctors
        
        b. A doctor can only work in one hospital (done for simplicity to avoid need of creating a junction table to accomodate many-to-many
        relationship between doctor and hospital tables)
        
        c. A patient can have only one doctor (again to avoid many-to-many relationship which would need a junction table)
        
        d. A patient can have only one prescription
4. Fictional data is used in the database. This does not represent a real system

