# Sample File Upload Project
## RESTful implementation which uses Springframework

### Setup
- .war file deployment
- Runs on Tomcat

### Set File Storage Location
- StorageProperties.java, location = "your_storage_directory"

### URL
- http://your_server:8080/

### Endpoints
| Method | Description | URL |
| --------- | --------- | --------- |
| POST | Send file to this path for upload as multipart form data. Just give it a key of your choosing and that will become the name of the file. | http://your_server:8080/ |
| GET | Returns all files in the storage directory identified as the storage location | http://your_server:8080/ |
- Yes they are the same endpoint and yes it is at the root of the applicaiton, modify as desired.

### Sample postman collection provided for convenience