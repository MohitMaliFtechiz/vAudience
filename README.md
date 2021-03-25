## vAudience

#### Heroku
   This project is being running over the heroku server
   `HOST: https://vaudience.herokuapp.com/`
   

## Api Documentation

#### a) Post Request to create contacts

 ` https://{{HOST}}/contacts`
    
    {
    "dob":"{{current_timestamp}}",
     "fullname":"Name",
     "address":{
         "city":"city",
         "postalcode":"unique postalcode"
     }

     }`
 
 
#### b) Put Request to update contacts

 ` https://{{HOST}}/contacts`
  
    {
    "id":"set id value",
    "dob":"{{current_timestamp}}",
     "fullname":"Name",
     "address":{
         "city":"city",
         "postalcode":"unique postalcode"
     }

     }`
     
 #### c) Get Request to reterive all contacts

 `https://{{HOST}}/getcontacts`
  
     
     
 #### d) Get Request to reterive  contact by ID

 `https://{{HOST}}/contact/1`
 
 #### e) Delete Request to delete contact

 `https://{{HOST}}/contact/7`
 
 #### f) Get Request to revterive contact by postalcode

 `https://{HOST}}/contact/postalcode/248001`
  
  
        
    
## Execute API test using postman , click to invoke collection
[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/6e83bf2611c1db5e5fbb)
