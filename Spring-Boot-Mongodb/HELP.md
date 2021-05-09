#URL

1. Get All Student [GET] - http://localhost:8091/api/student/findAll 
2. Find one Student [GET] - http://localhost:8091/api/student/findStudent/6096a87ff17a5fe7e329b6f3
3. Create one Entry  [POST ] - http://localhost:8091/api/student/create 
###{ 
    "name" : "Naman", 
    "email" : "naman@gmail.com", 
    "batch" : "Morning", 
    "courseDetails" : {
        "CourseNam" : "Angular", 
        "Level" : "Intermediate", 
        "Experience" : 2.0
    }
	}

 
4. Update One Entry - http://localhost:8091/api/student/update

{ 
    "name" : "Naman", 
    "email" : "naman@gmail.com", 
    "batch" : "Morning", 
    "courseDetails" : {
        "CourseNam" : "Angular", 
        "Level" : "Intermediate", 
        "Experience" : 2.0
    }
}

5. Delete One Entry [DELETE]- http://localhost:8091/api/student/delete/6097f858506f8414f69dfa1b


6. Get By batch Name [GET] - http://localhost:8091/api/student/getByBatches/Evening

7. Using And Condition [GET] - http://localhost:8091/api/student/getStudentsByNameAndBatch?name=Nirakar&batch=Evening

8. Using OR Condition [GET] - http://localhost:8091/api/student/getStudentsByNameOrBatch?name=Nirakar&batch=Evening
