Description of the challenge in the link below:
[https://github.com/rh-southsystem/desafio-backend-arquivo](https://github.com/rh-southsystem/desafio-backend-arquivo)
# sales-file-processor-master
Data analysis system, where the system is imported batches of files with their predefined layout's, will read and analyze the data and produce a report.


### Technologies used
- JDK8
- Spring Boot: 2.2.x
- Lombok: 1.18.x
- MongoDB
- JUnit5

#### Build:
```
./mvnw clean install
```

#### Create Directory structure:
- ${HOMEPATH}/data/in
- ${HOMEPATH}/data/out
---

Instructions for installing the **MongoDB**: [https://docs.mongodb.com/manual/installation/](https://docs.mongodb.com/manual/installation/)

## Features and instructions
### Data types
#### Seller details
The seller data has the identifier ** 001 ** and follows the following format:
> 001çCPFçNameçSalary

#### Client's data
The customer data has the identifier ** 002 ** and follows the following format:
> 002çCNPJçNameçBusiness Area

#### Sales data
The sales data have the identifier ** 003 ** and follow the following format:
> 003çSale IDç [Item ID-Item Quantity-Item003çSale IDç [Item ID-Item Quantity-Item Price] çSalesman name
---
### Files and content used for testing:

> 001ç1234567891234çPedroç50000
> 001ç3245678865434çPauloç40000.99  
> 002ç2345675434544345çJose da SilvaçRural   
> 002ç2345675433444345çEduardo PereiraçRural   
> 003ç10ç[1-10-100,2-30-2.50,3-40-3.10]çPedro   
> 003ç08ç[1-34-10,2-33-1.50,3-40-0.10]çPaulo  
---
* Note: The file reader has been configured to accept only '.dat' and UTF-8 charset extensions *

The system continuously reads all new files inserted in the directory:
>% HOMEPATH% / data / in

When identifying a new file, the system will process it, generating a report containing the following information:
1. Number of customers in the input file
2. Number of salespeople in the input file
3. Most expensive sale ID
4. The worst seller

These reports will be saved in the directory:
>% HOMEPATH% / data / out
---
For each file, the system temporarily stores the data entered in MongoDB in order to generate the report of the read file at the end. After processing the file, the system will clean the database and start the process again for the next file, thus generating a report for each one.
