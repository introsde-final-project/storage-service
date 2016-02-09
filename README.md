# Storage Service

Storage Service serves as a junction where all the required data for the application is found. It obtains the suggested Food and Quote from External Adapter Service with which it communicates in REST with JSON objects. It also acquires data related to User, their Health Profile and Health Measure History from Data Service with which it communicates with SOAP Protocol. In addition to that, it scrubs the obtained data such that only the data required by the upper layers which are the Business Logic Layer and Process Centric Layers are passed to them as JSON object through RESTful APIs.

Further information on this service can be found in its [Wiki Page](https://github.com/introsde-final-project/storage-service/wiki).

[Click here to access this service in Heroku.](http://storage-service.herokuapp.com/storage/user)
